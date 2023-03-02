package com.icterguru.controller;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfiguration implements WebMvcConfigurer {

   @Override
   public void addViewControllers(ViewControllerRegistry registry) {
       registry.addViewController("/").setViewName("forward:/index.html");
   }
   // https://stackoverflow.com/questions/27381781/java-spring-boot-how-to-map-my-app-root-to-index-html#:~:text=on%20this%20post.-,index.,%2Fresources%2Fstatic%2Findex.
   
}