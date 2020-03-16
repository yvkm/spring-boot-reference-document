package com.github.yvkm.expandproperties_9_2_1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;

/**
 * @author xie jian xun
 * @since
 */
@SpringBootApplication
public class PropertyExpansionUsingMaven implements EnvironmentAware {

    @Autowired
    private Environment env;

    public static void main(String[] args) {

        ConfigurableApplicationContext ctx =
            SpringApplication.run(PropertyExpansionUsingMaven.class, args);
        PropertyExpansionUsingMaven bean = ctx.getBean(PropertyExpansionUsingMaven.class);
        System.out.println(bean.env.getProperty("app.java.version"));
    }

    @Override
    public void setEnvironment(Environment environment) {

        this.env = environment;
    }
}
