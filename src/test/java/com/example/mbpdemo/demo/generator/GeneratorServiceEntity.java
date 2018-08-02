package com.example.mbpdemo.demo.generator;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.annotation.IdType;
import org.junit.Test;

import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;

import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

/**
 * <p>
 * 测试生成代码
 * </p>
 *
 * @author K神
 * @date 2017/12/18
 */
public class GeneratorServiceEntity {



    @Test
    public void generator() {
        GlobalConfig config = new GlobalConfig();
        String dbUrl = "jdbc:mysql://localhost:3306/mbpdemo";
        DataSourceConfig dataSourceConfig = new DataSourceConfig();
        dataSourceConfig.setDbType(DbType.MYSQL)
                .setUrl(dbUrl)
                .setUsername("root")
                .setPassword("wisontuv")
                .setDriverName("com.mysql.jdbc.Driver");
        StrategyConfig strategyConfig = new StrategyConfig();
        strategyConfig
                .setCapitalMode(true)
                .setEntityLombokModel(false)
                .setDbColumnUnderline(true)
                .setNaming(NamingStrategy.underline_to_camel)
                .setTablePrefix("tbl_")
                .setInclude(new String[]{"tbl_employee"});//修改替换成你需要的表名，多个表名传数组
        config.setActiveRecord(false)
                .setAuthor("K神带你飞")
                .setOutputDir("E:\\IdeaProjects\\mbpdemo\\src\\main\\java\\")
                .setFileOverride(true)
                .setIdType(IdType.ID_WORKER)
                .setBaseResultMap(true)
                .setBaseColumnList(true)
                .setServiceName("%sService");
        PackageConfig packageConfig = new PackageConfig();
        packageConfig
                .setController("controller")
                .setEntity("model")
                .setService("service")
                .setMapper("mapper")
                .setXml("mapper")
                .setParent("com.example.mbpdemo.demo");

        new AutoGenerator().setGlobalConfig(config)
                .setDataSource(dataSourceConfig)
                .setStrategy(strategyConfig)
                .setPackageInfo(packageConfig)
                .execute();
    }

}
