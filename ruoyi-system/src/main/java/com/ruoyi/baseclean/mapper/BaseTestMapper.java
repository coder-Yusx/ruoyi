package com.ruoyi.baseclean.mapper;

import com.ruoyi.baseclean.domain.ColComments;
import com.ruoyi.baseclean.domain.PageResult;
import com.ruoyi.baseclean.domain.TDataBinding;
import com.ruoyi.common.utils.PageData;
import org.apache.ibatis.annotations.Param;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public interface BaseTestMapper {

    List<ColComments> selectColsComments(Map<String,String> map);

    List<LinkedHashMap<String,Object>> selectPersonsMap(@Param("map") Map<String,Object> map);

    List<LinkedHashMap<String,Object>> selectDataMap(@Param("bindings")List<TDataBinding> bindings);

    List<PageData> selectDataMapPage(PageData bindings);
}
