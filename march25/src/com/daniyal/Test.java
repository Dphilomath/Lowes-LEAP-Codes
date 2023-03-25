package com.daniyal;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {
    public static void main(String[] args) {
        try {
            Resource r = new ClassPathResource("appContext.xml");
            BeanFactory fac = new XmlBeanFactory(r);
            Bank i = (Bank) fac.getBean("bnkBean");
            i.disp();

        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }
    }
}