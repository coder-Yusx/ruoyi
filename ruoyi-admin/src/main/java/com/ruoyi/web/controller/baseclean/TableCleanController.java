package com.ruoyi.web.controller.baseclean;

import com.ruoyi.baseclean.domain.*;
import com.ruoyi.baseclean.service.ITDataBindingService;
import com.ruoyi.baseclean.service.ITDataResultService;
import com.ruoyi.baseclean.service.ITDataRuleService;
import com.ruoyi.baseclean.service.ITableCleanService;
import com.ruoyi.basp.domain.DjGgQlrmx;
import com.ruoyi.basp.service.IDjGgQlrmxService;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.utils.StringUtils;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.util.ShiroUtils;
import com.ruoyi.system.domain.SysPerson;
import com.ruoyi.system.domain.SysRole;
import io.swagger.models.auth.In;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/baseclean/tableclean")
public class TableCleanController extends BaseController {

    @Autowired
    private ITableCleanService tableCleanService;

    @Autowired
    private ITDataResultService tDataResultService;

    @Autowired
    private ITDataRuleService tDataRuleService;

    @Autowired
    private ITDataBindingService tDataBindingService;

    private String prefix = "baseclean/tableclean";

    @RequiresPermissions("baseclean:tableclean:view")
    @GetMapping()
    public String tableClean()
    {
        return prefix + "/tableclean";
    }

    /**
     * 查询权利人明细_簿载层列表
     */
    @RequiresPermissions("baseclean:tableclean:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(TableClean tableClean)
    {
        startPage();
        List<TableClean> list = tableCleanService.selectTableByUser(tableClean);
        return getDataTable(list);
    }

    @RequiresPermissions("baseclean:tableclean:tocol")
    @GetMapping("/tocol/{tableName}/{owner}")
    public String toColClean(@PathVariable("tableName") String tableName,@PathVariable("owner") String owner, ModelMap mmap)
    {
        ColClean colClean = new ColClean();
        colClean.setTableName(tableName);
        colClean.setOwner(owner);
        mmap.put("colClean", colClean);
        return prefix + "/colclean";
    }

    @RequiresPermissions("baseclean:tableclean:listCols")
    @PostMapping("/listCols")
    @ResponseBody
    public TableDataInfo listCols(ColClean colClean)
    {
        startPage();
        List<ColClean> list = tableCleanService.selectColsByTableName(colClean);
        return getDataTable(list);
    }

    @RequiresPermissions("baseclean:tableclean:view")
    @GetMapping("tobind/{owner}/{tableName}/{columnName}/{comments}")
    @RequestMapping(value = {"tobind/{owner}/{tableName}/{columnName}/{dataType}/{comments}","tobind/{owner}/{tableName}/{columnName}/{dataType}"},method = RequestMethod.GET)
    public String toBindingRules(@PathVariable("owner") String owner,@PathVariable("tableName")String tableName,@PathVariable("columnName")String columnName,@PathVariable("dataType")String dataType,@PathVariable(value = "comments",required = false)String comments,ModelMap map)
    {
        /*map.put("owner",owner);
        map.put("tableName",tableName);
        map.put("columnName",columnName);
        map.put("comments",comments);*/
        TDataBinding tDataBinding = new TDataBinding();
        tDataBinding.setOwner(owner);
        tDataBinding.setTableName(tableName);
        tDataBinding.setColName(columnName);
        tDataBinding.setColComments(comments);
        tDataBinding.setExt2(dataType);
        map.put("tDataBinding",tDataBinding);
        return prefix + "/edit";
    }

    /**
     * 修改保存角色
     */
    @RequiresPermissions("baseclean:tableclean:edit")
    @PostMapping("/relatedRules")
    @ResponseBody
    public AjaxResult editSave(Map<String,Object> params)
    {
        return toAjax(1);
    }

/*    @PostMapping("/listCols")
    @ResponseBody
    public TableDataInfo allocatedList(SysPerson user)
    {
        startPage();
        List<SysPerson> list = userService.selectAllocatedList(user);
        return getDataTable(list);
    }*/

    /*@GetMapping("/tabusers")
    @ResponseBody
    public AjaxResult listUser()
    {
        String account_status = "OPEN";
        String[] users = tableCleanService.selectAllDbUsers(account_status);
        return AjaxResult.success("成功",users);
    }*/

    @RequiresPermissions("baseclean:tableclean:listColVal")
    /*@GetMapping("listColVal/{owner}/{tableName}/{columnName}/{comments}")*/
    @RequestMapping(value = {"listColVal/{owner}/{tableName}/{columnName}/{comments}","listColVal/{owner}/{tableName}/{columnName}"},method = RequestMethod.GET)
    public String listColVal(@PathVariable("owner") String owner,@PathVariable("tableName")String tableName,@PathVariable("columnName")String columnName,@PathVariable(value = "comments",required = false)String comments,ModelMap map)
    {
        TDataResult tDataResult = new TDataResult();
        tDataResult.setOwner(owner);
        tDataResult.setTableName(tableName);
        tDataResult.setColName(columnName);
        tDataResult.setExt1(comments);

        map.put("tDataResult",tDataResult);
        return prefix + "/listColVal";
    }

    @RequiresPermissions("baseclean:tableclean:getColVal")
    @PostMapping("/getColVal")
    @ResponseBody
    public TableDataInfo getColVal(TDataResult tDataResult)
    {

        //List<TableClean> list = tableCleanService.selectTableByUser(tableClean);

        String owner = tDataResult.getOwner();
        String tableName = tDataResult.getTableName();
        String colName = tDataResult.getColName();
        String colOriVal = tDataResult.getColOriVal();
        String ext1 = tDataResult.getExt1();

        TDataRule tDataRule = tDataRuleService.selectTDataRuleById(Integer.parseInt(ext1));

        //通过表名查询该表的主键字段
        String colKey = "";
        String[] ids = tDataBindingService.selectPrimaryKey(tDataResult.getTableName());
        if(ids != null && ids.length > 0){
            colKey = ids[0];
        }

        //拼接sql语句
        String sql = "select " +
                "upper('"+owner+"') owner,"+
                "upper('"+tableName+"') tableName,"+
                "upper('"+colKey+"') colKey,"+
                colKey+" colKeyVal,"+
                "upper('"+colName+"') colName,"+
                colName+" colOriVal "+
                "from "+owner+"."+tableName;

        String condStr = " where 1=1 ";
        if(colOriVal!=null && colOriVal!=""){
            condStr = condStr+colName+" like "+"'%"+colOriVal+"%'";
        }
        if(tDataRule != null){
            if(tDataRule.getRuleType() != null){
                if(tDataRule.getRuleType().equals("rel") && tDataRule.getExt1() != null && tDataRule.getExt1() != ""){
                    condStr = condStr + " and "+colName+" "+tDataRule.getExt1();
                }
                if(tDataRule.getRuleType().equals("reg") && tDataRule.getExt1() != null && tDataRule.getExt1() != ""){
                    String replace = tDataRule.getExt1().replace("{0}", colName);
                    condStr = condStr + " and "+replace;
                }
            }
        }

        sql = sql + condStr;

        startPage();
        //执行查询操作
        List<TDataResult> tDataResults = tableCleanService.selectColVal(sql);
        return getDataTable(tDataResults);
    }

    /*@RequiresPermissions("baseclean:tableclean:view")
    *//*@GetMapping("listColVal/{owner}/{tableName}/{columnName}/{comments}")*//*
    @RequestMapping(value = {"updateColVal/{owner}/{tableName}/{colName}/{colKey}/{colKeyVal}/{colOriVal}",
            "updateColVal/{owner}/{tableName}/{colName}/{colKey}/{colKeyVal}",
            "updateColVal/{owner}/{tableName}/{colName}"},
            method = RequestMethod.GET)
    public String updateColVal(@PathVariable("owner") String owner,
                               @PathVariable("tableName")String tableName,
                               @PathVariable("colName")String colName,
                               @PathVariable(value = "colKey",required = false)String colKey,
                               @PathVariable(value = "colKeyVal",required = false)String colKeyVal,
                               @PathVariable(value = "colOriVal",required = false)String colOriVal,
                               ModelMap map)
    {
        map.put("owner",owner);
        map.put("tableName",tableName);
        map.put("colName",colName);
        map.put("colKey",colKey);
        map.put("colKeyVal",colKeyVal);
        map.put("colOriVal",colOriVal);

        return prefix + "/colValEdit";
    }*/

    //@RequiresPermissions("baseclean:tableclean:updateColVal")
    /*@GetMapping("listColVal/{owner}/{tableName}/{columnName}/{comments}")*/
    @RequestMapping(value = {"updateColVal/{owner}/{tableName}/{colName}/{colKey}/{colKeyVal}/{colOriVal}",
            "updateColVal/{owner}/{tableName}/{colName}/{colKey}/{colKeyVal}",
            "updateColVal/{owner}/{tableName}/{colName}"},
            method = RequestMethod.GET)
    public String updateColVal(@PathVariable("owner") String owner,
                               @PathVariable("tableName")String tableName,
                               @PathVariable("colName")String colName,
                               @PathVariable(value = "colKey",required = false)String colKey,
                               @PathVariable(value = "colKeyVal",required = false)String colKeyVal,
                               @PathVariable(value = "colOriVal",required = false)String colOriVal,
                               ModelMap map)
    {

        TDataResult tDataResult = new TDataResult();
        tDataResult.setOwner(owner);
        tDataResult.setTableName(tableName);
        tDataResult.setColName(colName);
        tDataResult.setColOriVal(colOriVal);
        tDataResult.setColKey(colKey);
        tDataResult.setColKeyVal(colKeyVal);

        map.put("tDataResult",tDataResult);

        return prefix + "/colValEdit";
    }

    @RequiresPermissions("baseclean:tableclean:updateColVal")
    @PostMapping("/editColVal")
    @ResponseBody
    public AjaxResult editColVal(TDataResult tDataResult)
    {
        String owner = tDataResult.getOwner();
        String tableName = tDataResult.getTableName();
        String colName = tDataResult.getColName();
        String colNowVal = tDataResult.getColNowVal();
        String colKey = tDataResult.getColKey();
        String colKeyVal = tDataResult.getColKeyVal();

        if(colNowVal == null){
            colNowVal = "";
        }

        String sql = "update "+
                owner+"."+tableName+
                " set "+colName+"='"+colNowVal+"'"+
                " where 1=1 and "+
                colKey+"="+colKeyVal;

        int i = tableCleanService.updateColVal(sql);

        if(i>0){
            //tDataResult.setModifyTimes(1);
            return toAjax(tDataResultService.insertTDataResult(tDataResult));
        }else {
            return AjaxResult.error("修改失败");
        }
    }

    @RequiresPermissions("baseclean:tDataResult:export")
    @PostMapping("/exportColVal")
    @ResponseBody
    public AjaxResult export(TDataResult tDataResult)
    {
        List<TDataResult> list = tDataResultService.selectTDataResultList(tDataResult);
        ExcelUtil<TDataResult> util = new ExcelUtil<TDataResult>(TDataResult.class);
        return util.exportExcel(list, "tDataResult");
    }
}
