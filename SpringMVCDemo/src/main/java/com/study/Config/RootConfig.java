package com.study.Config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created by forget on 2019/6/9.
 */
@Configuration
@ComponentScan(basePackages = "com.study")
public class RootConfig {
}
