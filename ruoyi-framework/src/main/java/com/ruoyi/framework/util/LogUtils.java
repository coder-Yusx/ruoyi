package com.ruoyi.framework.util;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import javax.servlet.http.HttpServletRequest;

import com.ruoyi.basp.domain.TDataCheck;
import com.ruoyi.basp.service.ITDataCheckService;
import com.ruoyi.common.json.JSONContrast;
import com.ruoyi.common.utils.ServletUtils;
import net.sf.json.JSONObject;
import org.apache.shiro.SecurityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.ruoyi.common.json.JSON;
import com.ruoyi.common.utils.IpUtils;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 处理并记录日志文件
 * 
 * @author ruoyi
 */
public class LogUtils
{
    @Autowired
    private ITDataCheckService tDataCheckService;

    public static final Logger ERROR_LOG = LoggerFactory.getLogger("sys-error");
    public static final Logger ACCESS_LOG = LoggerFactory.getLogger("sys-access");

    /**
     * 记录访问日志 [username][jsessionid][ip][accept][UserAgent][url][params][Referer]
     *
     * @param request
     * @throws Exception
     */
    public static void logAccess(HttpServletRequest request) throws Exception
    {
        String username = getUsername();
        String jsessionId = request.getRequestedSessionId();
        String ip = IpUtils.getIpAddr(request);
        String accept = request.getHeader("accept");
        String userAgent = request.getHeader("User-Agent");
        String url = request.getRequestURI();
        String params = getParams(request);

        StringBuilder s = new StringBuilder();
        s.append(getBlock(username));
        s.append(getBlock(jsessionId));
        s.append(getBlock(ip));
        s.append(getBlock(accept));
        s.append(getBlock(userAgent));
        s.append(getBlock(url));
        s.append(getBlock(params));
        s.append(getBlock(request.getHeader("Referer")));
        getAccessLog().info(s.toString());
    }

    /**
     * 记录异常错误 格式 [exception]
     *
     * @param message
     * @param e
     */
    public static void logError(String message, Throwable e)
    {
        String username = getUsername();
        StringBuilder s = new StringBuilder();
        s.append(getBlock("exception"));
        s.append(getBlock(username));
        s.append(getBlock(message));
        ERROR_LOG.error(s.toString(), e);
    }

    /**
     * 记录页面错误 错误日志记录 [page/eception][username][statusCode][errorMessage][servletName][uri][exceptionName][ip][exception]
     *
     * @param request
     */
    public static void logPageError(HttpServletRequest request)
    {
        String username = getUsername();

        Integer statusCode = (Integer) request.getAttribute("javax.servlet.error.status_code");
        String message = (String) request.getAttribute("javax.servlet.error.message");
        String uri = (String) request.getAttribute("javax.servlet.error.request_uri");
        Throwable t = (Throwable) request.getAttribute("javax.servlet.error.exception");

        if (statusCode == null)
        {
            statusCode = 0;
        }

        StringBuilder s = new StringBuilder();
        s.append(getBlock(t == null ? "page" : "exception"));
        s.append(getBlock(username));
        s.append(getBlock(statusCode));
        s.append(getBlock(message));
        s.append(getBlock(IpUtils.getIpAddr(request)));

        s.append(getBlock(uri));
        s.append(getBlock(request.getHeader("Referer")));
        StringWriter sw = new StringWriter();

        while (t != null)
        {
            t.printStackTrace(new PrintWriter(sw));
            t = t.getCause();
        }
        s.append(getBlock(sw.toString()));
        getErrorLog().error(s.toString());

    }

    public static String getBlock(Object msg)
    {
        if (msg == null)
        {
            msg = "";
        }
        return "[" + msg.toString() + "]";
    }

    protected static String getParams(HttpServletRequest request) throws Exception
    {
        Map<String, String[]> params = request.getParameterMap();
        return JSON.marshal(params);
    }

    protected static String getUsername()
    {
        return (String) SecurityUtils.getSubject().getPrincipal();
    }

    public static Logger getAccessLog()
    {
        return ACCESS_LOG;
    }

    public static Logger getErrorLog()
    {
        return ERROR_LOG;
    }

    public TDataCheck getAll(String oldParams, String newParams, String ownusename, String tablename, String onlyId) throws Exception {
        TDataCheck tDataCheck = new TDataCheck();
        tDataCheck.setId(UUID.randomUUID().toString().substring(0,31));
        tDataCheck.setCheckOsuser(ownusename);
        tDataCheck.setCheckTable(tablename);
        tDataCheck.setCheckIdname("id");
        tDataCheck.setCheckId(onlyId);
        tDataCheck.setOldval(oldParams);
        tDataCheck.setNewval(newParams);
        tDataCheck.setRestStat("0");
        tDataCheck.setCheckStat("1");// 1:已修改未审核
        tDataCheck.setOsuser(ShiroUtils.getSysUser().getLoginName());
        return tDataCheck;
    }

    public TDataCheck getAllOfRecovry(String oldParams, String newParams, String ownusename, String tablename, String idName, String onlyId) {
        TDataCheck tDataCheck = new TDataCheck();
        tDataCheck.setId(UUID.randomUUID().toString().substring(0,31));
        tDataCheck.setOldval(oldParams);
        tDataCheck.setNewval(newParams);
        tDataCheck.setCheckOsuser(ownusename);
        tDataCheck.setCheckTable(tablename);
        tDataCheck.setCheckIdname(idName);
        tDataCheck.setCheckId(onlyId);
        tDataCheck.setRestStat("1");
        tDataCheck.setOsuser(ShiroUtils.getSysUser().getLoginName());
        return tDataCheck;
    }

    /**
     * 还原记录,将新值和旧值进行调换
    */
    public TDataCheck getAllOfRecovryTDataCheck(TDataCheck tDataCheck) {
        TDataCheck tDataCheck2 = new TDataCheck();
        tDataCheck2.setId(UUID.randomUUID().toString().substring(0,31));
        tDataCheck2.setCheckOsuser(tDataCheck.getCheckOsuser());
        tDataCheck2.setCheckTable(tDataCheck.getCheckTable());
        tDataCheck2.setCheckIdname(tDataCheck.getCheckIdname());
        tDataCheck2.setCheckId(tDataCheck.getCheckId());
        tDataCheck2.setOldval(tDataCheck.getNewval());
        tDataCheck2.setNewval(tDataCheck.getOldval());
        tDataCheck2.setOsuser(tDataCheck.getOsuser());
        tDataCheck2.setCheckStat(tDataCheck.getCheckStat());
        tDataCheck2.setRestStat("1");
        tDataCheck2.setExt1(tDataCheck.getExt1());
        tDataCheck2.setExt2(tDataCheck.getExt2());

        String sql = "";
        String updateSql = "";
        JSONObject json = JSONObject.fromObject(tDataCheck2.getNewval());
        Iterator keys = json.keys();
        while (keys.hasNext()){
            String key = String.valueOf(keys.next());
            String value = json.optString(key);
            if(keys.hasNext()){
                updateSql += key+ "= '" +value+"',";
            }else{
                updateSql += key+ "= '" +value+"'";
            }
        }
        sql = "update "+ tDataCheck2.getCheckOsuser()+"."+tDataCheck2.getCheckTable() +" set "+ updateSql +" where "+tDataCheck2.getCheckIdname()+" = '"+tDataCheck2.getCheckId()+"'";
        tDataCheck2.setExt3(sql);
        return tDataCheck2;
    }
}
