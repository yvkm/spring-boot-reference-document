package com.github.yvkm.failureanalyzer_9_1_1;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author xie jian xun
 * @since
 */
@SpringBootApplication
public class FailureAnalyzerDemo implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(FailureAnalyzerDemo.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        int i = 1 / 0;
    }
}
