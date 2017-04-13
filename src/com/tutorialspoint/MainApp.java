/**
 * $RCSfile$
 * $Revision$
 * $Date$
 * $Source$
 * $Author$
 */
package com.tutorialspoint;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
   public static void main(String[] args) {
      AbstractApplicationContext  context = new ClassPathXmlApplicationContext("Beans.xml");
      context.registerShutdownHook();
      
      HelloWorld objA = (HelloWorld) context.getBean("helloWorld");

      //objA.setMessage("I'm object A");
      objA.getMessage();

      HelloWorld objB = (HelloWorld) context.getBean("helloWorld");
      objA.setMessage("I'm object A");
      
      objB.getMessage();
      
      HelloWorld objC = (HelloWorld) context.getBean("helloWorld2");

      objC.setMessage("I'm object C");
      objC.getMessage();

      HelloWorld objD = (HelloWorld) context.getBean("helloWorld2");
      //objA.setMessage("I'm object A");
      objD.getMessage();
      
      HelloIndia objE = (HelloIndia) context.getBean("helloIndia");
      //objA.setMessage("I'm object A");
      objE.getMessage();
      objE.getMessage2();
      objE.getMessage3();
   }
}