package com.alibaba.nacos.plugin.datasource.impl.oracle;

import com.alibaba.nacos.plugin.datasource.constants.DataSourceConstant;
import com.alibaba.nacos.plugin.datasource.mapper.ConfigMigrateMapper;

/**
 * Config migrate mapper for Oracle.
 */
public class ConfigMigrateMapperByOracle extends AbstractMapperByOracle implements ConfigMigrateMapper {

    @Override
    public String getDataSource() {
        return DataSourceConstant.ORACLE;
    }
}
