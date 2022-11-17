package com.fxy.config;

import org.springframework.context.annotation.*;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Configuration
@PropertySource("classpath:jdbc.properties")
@Import({MybatisConfig.class})
@ComponentScan(value = "com.fxy",
excludeFilters = @ComponentScan.Filter(
        type = FilterType.ANNOTATION,
        classes = Controller.class
    )
)
public class springConfig {
}
