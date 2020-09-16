package com.divya.BeanFactory;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class App 
{
    public static void main( String[] args )
    {
    	BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
        Alien obj = factory.getBean("alien", Alien.class);
        obj.code();
    }
}
