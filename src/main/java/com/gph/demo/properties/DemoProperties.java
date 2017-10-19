package com.gph.demo.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "demo")
public class DemoProperties  {

    private String sizeCup;

    private Integer age;

    public String getSizeCup() {
        return sizeCup;
    }

    public void setSizeCup(String sizeCup) {
        this.sizeCup = sizeCup;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
