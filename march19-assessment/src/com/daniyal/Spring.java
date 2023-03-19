package com.daniyal;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.*;

public class Spring {
    public static void main(String[] args) {
        Resource r = new ClassPathResource("applicationContext.xml");
        BeanFactory fac = new XmlBeanFactory(r);
        Product p = (Product)fac.getBean("product");
        p.show();

        Resource r2 = new ClassPathResource("appContext2.xml");
        BeanFactory fac2 = new XmlBeanFactory(r2);
        Product2 product2 = (Product2) fac2.getBean("product");
        System.out.println(product2.getName());
        System.out.println(product2.getPrice());
    }
}
