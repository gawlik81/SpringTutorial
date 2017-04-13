/**
 * $RCSfile$
 * $Revision$
 * $Date$
 * $Source$
 * $Author$
 */
package com.tutorialspoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
   public static void main(String[] args) {
      ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
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
   }
}