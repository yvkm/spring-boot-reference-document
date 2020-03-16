package com.github.yvkm.environmentpostprocessor_9_1_3;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.env.EnvironmentPostProcessor;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;

/**
 * @author xie jian xun
 * @since
 */
public class EnviromentPostProcessorDemo implements EnvironmentAware {
    private static final Logger log = LoggerFactory.getLogger(EnviromentPostProcessorDemo.class);
    @Autowired
    private Environment env;

    public static void main(String[] args) {
        ConfigurableApplicationContext ctx =
            SpringApplication.run(EnviromentPostProcessorDemo.class, args);
        EnviromentPostProcessorDemo bean = ctx.getBean(EnviromentPostProcessorDemo.class);
        String property = bean.env.getProperty("spring.env");
        // 仅为方便查看
        log.error("Get property env: {}", property);
    }

    @Override
    public void setEnvironment(Environment environment) {
        this.env = environment;
    }
}
