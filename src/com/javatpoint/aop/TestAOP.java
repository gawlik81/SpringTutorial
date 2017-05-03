/**
 * $RCSfile$
 * $Revision$
 * $Date$
 * $Source$
 * $Author$
 */
package com.javatpoint.aop;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class TestAOP {
  public static void main(String[] args) {
    Resource r = new ClassPathResource("applicationContextAOP.xml");
    BeanFactory factory = new XmlBeanFactory(r);

    A a = factory.getBean("proxy", A.class);
    System.out.println("proxy class name: "+a.getClass().getName());  
    a.m("Witam");
  }
}