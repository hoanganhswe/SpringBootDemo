package com.hanh.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.flyway.FlywayDataSource;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
//@PropertySource("classpath:custom.properties")
//@PropertySources({
//        @PropertySource("classpath:custom.properties"),
//        @PropertySource("classpath:custom-file-2.properties")
//})
public class MyFirstService {
    private final MyFirstClass myFirstClass;

    @Value("${my.custom.property}")
    private String customProperty;
//    @Value("${my.prop}")
//    private String customPropertyFromAnotherFile;
//    @Value("${my.prop.2}")
//    private String customPropertyFromAnotherFile2;
    @Value("${my.custom.property.int}")
    private Integer customPropertyInt;


    public MyFirstService(@Qualifier("mfb") MyFirstClass myFirstClass) {
        this.myFirstClass = myFirstClass;
    }

    public String tellAStory() {
        return "the dependency is saying: " + myFirstClass.sayHello();
    }

    public String getCustomProperty() {
        return customProperty;
    }
//
//    public String getCustomPropertyFromAnotherFile() {
//        return customPropertyFromAnotherFile;
//    }
//
    public Integer getCustomPropertyInt() {
        return customPropertyInt;
    }
//
//    public String getCustomPropertyFromAnotherFile2() {
//        return customPropertyFromAnotherFile2;
//    }
}
