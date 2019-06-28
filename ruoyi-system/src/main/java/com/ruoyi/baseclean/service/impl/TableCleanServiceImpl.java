package com.ruoyi.baseclean.service.impl;

import com.ruoyi.baseclean.domain.ColClean;
import com.ruoyi.baseclean.domain.TDataResult;
import com.ruoyi.baseclean.domain.TableClean;
import com.ruoyi.baseclean.mapper.TableCleanMapper;
import com.ruoyi.baseclean.service.ITableCleanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TableCleanServiceImpl implements ITableCleanService {

    @Autowired
    private TableCleanMapper tableCleanMapper;

    @Override
    public List<TableClean> selectTableByUser(TableClean tableClean) {
        return tableCleanMapper.selectTableByUser(tableClean);
    }

    @Override
    public String[] selectAllDbUsers(String status) {
        return tableCleanMapper.selectAllDbUsers(status);
    }

    @Override
    public List<ColClean> selectColsByTableName(ColClean colClean) {
        return tableCleanMapper.selectColsByTableName(colClean);
    }

    @Override
    public List<TDataResult> selectColVal(String sql) {
        return tableCleanMapper.selectColVal(sql);
    }

    @Override
    public int updateColVal(String sql) {
        return tableCleanMapper.updateColVal(sql);
    }
}
