package com.ruoyi.baseclean.service;

import com.ruoyi.baseclean.domain.ColComments;
import com.ruoyi.baseclean.domain.PageResult;
import com.ruoyi.baseclean.domain.TDataBinding;
import com.ruoyi.common.utils.PageData;
import org.apache.ibatis.annotations.Param;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public interface IBaseTestService {

    public List<ColComments> selectColsComments(String owner, String tableName) ;

    List<LinkedHashMap<String,Object>> selectPersonsMap(Map<String,Object> map);

    List<LinkedHashMap<String,Object>> selectDataMap(List<TDataBinding> bindings);

    List<PageData> selectDataMapPage(PageData bindings);
}
