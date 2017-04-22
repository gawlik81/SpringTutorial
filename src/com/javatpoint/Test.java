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
    Resource r=new ClassPathResource("applicationContext.xml");
    BeanFactory factory2=new XmlBeanFactory(r);
    
    Employee s=(Employee)factory2.getBean("e");
    s.show();
    
    // --- Constructor Injection with Dependent Object
    Resource r2=new ClassPathResource("applicationContext.xml");
    BeanFactory factory3=new XmlBeanFactory(r2);
    
    Employee2 e1=(Employee2)factory3.getBean("e1");
    e1.show();
    
    // --- Constructor Injection with Collection
    Resource r3=new ClassPathResource("applicationContext.xml");
    BeanFactory factory4=new XmlBeanFactory(r3);
    
    Question q=(Question)factory4.getBean("q");
    q.displayInfo();
    
    // --- Constructor Injection with Non-String Collection (having Dependent Object)
	Resource r4=new ClassPathResource("applicationContext.xml");
	BeanFactory factory5=new XmlBeanFactory(r4);
	
	Question2 q2=(Question2)factory5.getBean("q2");
	q2.displayInfo();
	
	// --- Constructor Injection with Map
	Resource r5=new ClassPathResource("applicationContext.xml");
	BeanFactory factory6=new XmlBeanFactory(r5);
	
	Question3 q3=(Question3)factory6.getBean("q3");
	q3.displayInfo();
	
	// --- Constructor Injection with Non-String Map (having dependent Object)
	Resource r6=new ClassPathResource("applicationContext.xml");
	BeanFactory factory7=new XmlBeanFactory(r6);
	
	Question4 q4=(Question4)factory7.getBean("q4");
	q4.displayInfo();
	
	// --- Inheriting Bean in Spring
	Resource r7=new ClassPathResource("applicationContext.xml");
	BeanFactory factory8=new XmlBeanFactory(r7);
	
	Employee5 e52=(Employee5)factory8.getBean("e52");
	e52.show();
	Employee5 e51=(Employee5)factory8.getBean("e51");
	e51.show();

    
  }
}
