/**
 * $RCSfile$
 * $Revision$
 * $Date$
 * $Source$
 * $Author$
 */
package com.javatpoint.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAspectJ {
  public static void main(String[] args) {
    ApplicationContext context = new ClassPathXmlApplicationContext("applicationContextAspectJ.xml");
/*    Operation e = (Operation)context.getBean("opBean");
    System.out.println("calling msg...");
    e.msg();
    System.out.println("calling m...");
    e.m();
    System.out.println("calling k...");
    e.k();*/
  }
}
