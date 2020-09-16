package com.divya.ApplicationContext;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class App 
{
    public static void main( String[] args )
    {
    	//BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
        
    	ApplicationContext factory = new ClassPathXmlApplicationContext("spring.xml");
    	
//    	Alien obj = factory.getBean(Alien.class);
//        obj.code();
//        obj.age = 10;
//        System.out.println(obj.age);
//        
//    	Alien obj1 = factory.getBean(Alien.class);
//        obj1.code();
//        System.out.println(obj1.age);
        
    }
}
