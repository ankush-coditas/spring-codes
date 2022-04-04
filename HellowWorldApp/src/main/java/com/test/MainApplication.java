package com.test;

import com.beans.HellowWorld;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class MainApplication {
    public static void main(String[] args) {

//        FileSystemResource resource = new FileSystemResource("src/main/resources/ApplicationContext.xml");
//        XmlBeanFactory factory = new XmlBeanFactory(resource);
//        HellowWorld obj_hw= (HellowWorld) factory.getBean("hw");
//        System.out.println("hellow "+obj_hw.getMsg());
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        Object obj = context.getBean("hw");
        HellowWorld obj_hw = (HellowWorld) obj;

        System.out.println( "hellow "+obj_hw.getMsg());

    }
}
