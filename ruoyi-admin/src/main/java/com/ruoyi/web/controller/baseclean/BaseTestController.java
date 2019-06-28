package com.ruoyi.web.controller.baseclean;

import com.ruoyi.baseclean.domain.ColComments;
import com.ruoyi.baseclean.domain.PageResult;
import com.ruoyi.baseclean.domain.TDataBinding;
import com.ruoyi.baseclean.domain.TableClean;
import com.ruoyi.baseclean.service.IBaseTestService;
import com.ruoyi.baseclean.service.ITDataBindingService;
import com.ruoyi.baseclean.service.ITableCleanService;
import com.ruoyi.baseclean.service.impl.TableCleanServiceImpl;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.utils.PageData;
import net.sf.json.JSONObject;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@Controller
@RequestMapping("/baseclean/basetest")
public class BaseTestController extends BaseController {

    private String prefix = "baseclean/basetest";

    @Autowired
    private ITableCleanService tableCleanService;

    @Autowired
    private IBaseTestService baseTestService;

    @Autowired
    private ITDataBindingService tDataBindingService;

    @RequiresPermissions("baseclean:tableclean:list")
    @PostMapping("/tableList")
    @ResponseBody
    public AjaxResult list(TableClean tableClean)
    {
        List<TableClean> list = tableCleanService.selectTableByUser(tableClean);
        return AjaxResult.success("成功",list);
    }

    @RequiresPermissions("baseclean:basetest:view")
    @GetMapping()
    public String toViewPage(){
        return prefix + "/basetest";
    }

    /*@RequiresPermissions("baseclean:basetest:list")
    @PostMapping("/listPerson")
    @ResponseBody
    public AjaxResult listPerson(@RequestBody Map<String,Object> param){

        Map<String,Object> map = new HashMap<>();
       *//* map.put("owner","OWNFGJ");
        map.put("tableName","SYS_PERSON");*//*

        *//*Map<String,Object> params = new HashMap<>();
        params.put("user_type","00");
        params.put("sex","0");
        map.put("params",params);*//*

        List<LinkedHashMap<String, Object>> maps = baseTestService.selectPersonsMap(param);
        return AjaxResult.success("成功",maps);
    }*/

    /*@RequiresPermissions("baseclean:basetest:list")
    @PostMapping("/listPerson")
    @ResponseBody
    public TableDataInfo listPerson(@RequestBody Map<String,Object> param){

        Map<String,Object> map = new HashMap<>();
        if(param !=null && param.get("owner") != null && param.get("tableName")!=null){
            String owner = (String)param.get("owner");
            String tableName=(String) param.get("tableName");

            TDataBinding tDataBinding = new TDataBinding();
            tDataBinding.setOwner(owner);
            tDataBinding.setTableName(tableName);
            List<TDataBinding> bindings = tDataBindingService.selectTDataBindingList(tDataBinding);

            startPage();
            //List<LinkedHashMap<String, Object>> linkedHashMaps = baseTestService.selectDataMap(bindings);
            List<PageData> linkedHashMaps = baseTestService.selectDataMapPage(bindings);
            return getDataTable(linkedHashMaps);
        }
        //List<LinkedHashMap<String, Object>> maps = baseTestService.selectPersonsMap(param);
        return getDataTable(null);
    }*/

    @RequiresPermissions("baseclean:basetest:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo listPerson(@RequestBody JSONObject param){
        Map<String,Object> map = new HashMap<>();
        if(param !=null && param.get("owner") != null && param.get("tableName")!=null){
            String owner = (String)param.get("owner");
            String tableName=(String) param.get("tableName");

            TDataBinding tDataBinding = new TDataBinding();
            tDataBinding.setOwner(owner);
            tDataBinding.setTableName(tableName);
            List<TDataBinding> bindings = tDataBindingService.selectTDataBindingList(tDataBinding);

            PageData pd = new PageData();
            pd = this.getPageData();
            pd.put("bindings",bindings);
            pd.put("pageNum",owner);
            pd.put("pageSize",tableName);

            startPage();
            //List<LinkedHashMap<String, Object>> linkedHashMaps = baseTestService.selectDataMap(bindings);
            List<PageData> linkedHashMaps = baseTestService.selectDataMapPage(pd);
            return getDataTable(linkedHashMaps);
        }
        return getDataTable(new ArrayList<PageData>());
    }

    @GetMapping("/listColName/{owner}/{tableName}")
    @ResponseBody
    public AjaxResult listColName(@PathVariable("owner") String owner,@PathVariable("tableName") String tableName, ModelMap mmap){

        List<ColComments> colComments = baseTestService.selectColsComments(owner, tableName);
        return AjaxResult.success("成功",colComments);
    }
}
