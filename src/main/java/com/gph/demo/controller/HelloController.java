package com.gph.demo.controller;

import com.gph.demo.properties.DemoProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

   /* @Value("${age}")
    private Integer age;

    @Value("${sizeCup}")
    private String sizeCup;*/

   @Autowired
   private DemoProperties demoProperties;

    @RequestMapping(value="/say" ,method= RequestMethod.GET)
    public String say(){

        return "hello SpringBoot"+" age: "+demoProperties.getAge()+" sizeCup: "+demoProperties.getSizeCup();
    }
}
