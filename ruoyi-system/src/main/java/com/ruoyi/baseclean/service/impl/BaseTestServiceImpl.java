package com.ruoyi.baseclean.service.impl;

import com.ruoyi.baseclean.domain.ColComments;
import com.ruoyi.baseclean.domain.PageResult;
import com.ruoyi.baseclean.domain.TDataBinding;
import com.ruoyi.baseclean.mapper.BaseTestMapper;
import com.ruoyi.baseclean.service.IBaseTestService;
import com.ruoyi.common.utils.PageData;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Service
public class BaseTestServiceImpl implements IBaseTestService
{

    @Autowired
    private BaseTestMapper baseTestMapper;

    @Override
    public List<ColComments> selectColsComments(String owner,String tableName) {

        Map<String,String> map = new HashMap<String ,String>();

        if(owner!=null && owner!="")
            map.put("owner",owner);
        if(tableName!=null&&tableName!="")
            map.put("tableName",tableName);

        List<ColComments> colsComments = baseTestMapper.selectColsComments(map);
        return colsComments;
    }

    @Override
    public List<LinkedHashMap<String, Object>> selectPersonsMap(Map<String, Object> map) {
        return baseTestMapper.selectPersonsMap(map);
    }

    @Override
    public List<LinkedHashMap<String, Object>> selectDataMap(List<TDataBinding> bindings) {
        return baseTestMapper.selectDataMap(bindings);
    }

    @Override
    public List<PageData> selectDataMapPage(PageData bindings) {
        return baseTestMapper.selectDataMapPage(bindings);
    }
}
