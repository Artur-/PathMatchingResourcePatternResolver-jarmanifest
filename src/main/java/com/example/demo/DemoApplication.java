package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

@SpringBootApplication
public class DemoApplication {

  public static void main(String[] args) {
    SpringApplication.run(DemoApplication.class, args);
  }

  @Bean
  public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
    return args -> {
      PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();

      // Trying to find com.vaadin.flow.component.Tag.class
      String[] patterns = new String[] {
        "classpath*:**/component/Tag.class",
        "classpath*:com/**/component/Tag.class"
      };

      for (String pattern : patterns) {
        System.out.println("Searching for " + pattern);
        for (Resource res : resolver.getResources(pattern)) {
          System.out.println(res);
        }
        System.out.println();
      }
    };
  }
}
