package com.mybatisplusvisitmysql.mybatisplusgenerator;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

public class Generate {
    public static void main(String[] args) {
        //创建generator对象
        AutoGenerator autoGenerator = new AutoGenerator();
        //数据源
        DataSourceConfig dataSourceConfig = new DataSourceConfig();
        //选择数据库类型
        dataSourceConfig.setDbType(DbType.MYSQL);
        dataSourceConfig.setDriverName("com.mysql.cj.jdbc.Driver");
        dataSourceConfig.setUsername("root");
        dataSourceConfig.setPassword("root");
        dataSourceConfig.setUrl("jdbc:mysql://localhost:3306/tiga?serverTimezone=UTC&useUnicode=true" +
                "&characterEncoding=UTF-8");
        autoGenerator.setDataSource(dataSourceConfig);
        //全局配置
        GlobalConfig globalConfig = new GlobalConfig();
        //生成文件的存放位置
        //globalConfig.setOutputDir(System.getProperty("user.dir") + "/src/main/java");
        globalConfig.setOutputDir(System.getProperty("user.dir") + "/MyBatisPlusVisitMySql/src/main/java");
        //作者，会显示在注释上
        globalConfig.setAuthor("tiga");
        //是否打开生成后文件夹所在路径
        globalConfig.setOpen(false);
        //声明Service层接口的写法，默认前会有字母I ，添加%s则没有
        globalConfig.setServiceName("%sService");
        autoGenerator.setGlobalConfig(globalConfig);
        //包信息
        PackageConfig packageConfig = new PackageConfig();
        //父包
        //packageConfig.setParent("com.yyx");
        packageConfig.setParent("com.mybatisplusvisitmysql");
        packageConfig.setEntity("entity");
        packageConfig.setMapper("mapper");
        packageConfig.setService("service");
        packageConfig.setServiceImpl("service.impl");
        packageConfig.setController("controller");
        autoGenerator.setPackageInfo(packageConfig);
        //策略配置
        StrategyConfig strategyConfig = new StrategyConfig();
        //表名字
        //strategyConfig.setInclude("student","teacher");
        strategyConfig.setInclude("USER");
        //映射表名和字段名，underline_to_camel下划线转驼峰
        strategyConfig.setNaming(NamingStrategy.underline_to_camel);
        strategyConfig.setColumnNaming(NamingStrategy.underline_to_camel);
        //是否添加Lombok的注解
        strategyConfig.setEntityLombokModel(true);
        autoGenerator.setStrategy(strategyConfig);
        //运行
        autoGenerator.execute();
    }
}
