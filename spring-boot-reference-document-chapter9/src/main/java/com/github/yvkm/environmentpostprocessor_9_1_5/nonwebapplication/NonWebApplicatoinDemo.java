package com.github.yvkm.environmentpostprocessor_9_1_5.nonwebapplication;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * @author xie jian xun
 * @since
 */
public class NonWebApplicatoinDemo {

    public static void main(String[] args) {
      /*  SpringApplication app = new SpringApplication(NonWebApplicatoinDemo.class);
        app.setWebApplicationType(WebApplicationType.NONE);
        app.run(args);*/

        // 建议使用下面的方式
        new SpringApplicationBuilder(NonWebApplicatoinDemo.class)
            .web(WebApplicationType.NONE)
            .run(args);
    }
}
