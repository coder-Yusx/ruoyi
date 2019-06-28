package com.ruoyi.baseclean.service;

import com.ruoyi.baseclean.domain.ColClean;
import com.ruoyi.baseclean.domain.TDataResult;
import com.ruoyi.baseclean.domain.TableClean;

import java.util.List;

public interface ITableCleanService {

    List<TableClean> selectTableByUser(TableClean tableClean);

    String[] selectAllDbUsers(String status);

    List<ColClean> selectColsByTableName(ColClean colClean);

    List<TDataResult> selectColVal(String sql);

    int updateColVal(String sql);
}
