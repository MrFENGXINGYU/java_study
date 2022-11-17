package com.fxy.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

//@Configuration
@ComponentScan("com.fxy.controller")
@EnableWebMvc
public class springmvcConfig {

}
