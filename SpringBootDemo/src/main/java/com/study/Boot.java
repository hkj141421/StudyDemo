package com.study;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.exception.InvalidConfigurationException;
import org.mybatis.generator.exception.XMLParserException;
import org.mybatis.generator.internal.DefaultShellCallback;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by forget on 2019/6/15.
 */
@SpringBootApplication
@MapperScan(basePackages = "com.study.Dao")
public class Boot {

    public static void main(String arg[]) throws IOException, XMLParserException, InvalidConfigurationException, SQLException, InterruptedException {
        SpringApplication.run(Boot.class);
//        List<String> warnings = new ArrayList<String>();
//        boolean overwrite = true;
//        //指向逆向工程配置文件，只需要把下面这个文件改为你自己写的配置文件即可
//        File configFile = new File("E:\\Code\\FrameDemo\\SpringBootDemo\\src\\main\\resources\\Mybatis.xml");
//        ConfigurationParser cp = new ConfigurationParser(warnings);
//        Configuration config = cp.parseConfiguration(configFile);
//        DefaultShellCallback callback = new DefaultShellCallback(overwrite);
//        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
//        myBatisGenerator.generate(null);
    }
}
