package com.javatpoint;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {
  public static void main(String[] args) {
    Resource resource = new ClassPathResource("applicationContext.xml");
    BeanFactory factory = new XmlBeanFactory(resource);

    ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

    Student student = (Student)factory.getBean("studentbean");
    student.displayInfo();

    Student studentappcon = (Student)context.getBean("studentbeanappcon");
    studentappcon.displayInfo();
    
    // --- Dependency Injection by Constructor
    Employee s=(Employee)context.getBean("e");
    s.show();
    
    // --- Constructor Injection with Dependent Object
    System.out.println("");
    Employee2 e1=(Employee2)context.getBean("e1");
    e1.show();
    
    // --- Constructor Injection with Collection
    System.out.println("");
    Question q=(Question)context.getBean("q");
    q.displayInfo();
    
    // --- Constructor Injection with Non-String Collection (having Dependent Object)
    System.out.println("");
    Question2 q2=(Question2)context.getBean("q2");
	q2.displayInfo();
	
	// --- Constructor Injection with Map
    System.out.println("");
	Question3 q3=(Question3)context.getBean("q3");
	q3.displayInfo();
	
	// --- Constructor Injection with Non-String Map (having dependent Object)
    System.out.println("");
	Question4 q4=(Question4)context.getBean("q4");
	q4.displayInfo();
	
	// --- Inheriting Bean in Spring
    System.out.println("");
	Employee5 e52=(Employee5)context.getBean("e52");
	e52.show();
	Employee5 e51=(Employee5)context.getBean("e51");
	e51.show();
	
	// --- Dependency Injection by setter method
    System.out.println("");
	Employee6 e6=(Employee6)context.getBean("obj");
	e6.display();
	
	// --- Setter Injection with Dependent Object
    System.out.println("");
	Employee7 e7=(Employee7)context.getBean("obj7");
	e7.displayInfo();
	
	// --- Setter Injection with Collection
	  System.out.println("");
	Question8 q8 = (Question8)context.getBean("q8");
	q8.displayInfo();
	
	// --- Setter Injection with Non-String Collection
	  System.out.println("");
	 Question9 q9=(Question9)factory.getBean("q9");
	 q9.displayInfo();

    
  }
}
