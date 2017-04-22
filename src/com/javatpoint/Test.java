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
    
    // --- Dependency Injection by Constructor Example
    Resource r=new ClassPathResource("applicationContext.xml");
    BeanFactory factory2=new XmlBeanFactory(r);
    
    Employee s=(Employee)factory2.getBean("e");
    s.show();
    
    // --- Constructor Injection with Dependent Object
    Resource r2=new ClassPathResource("applicationContext.xml");
    BeanFactory factory3=new XmlBeanFactory(r);
    
    Employee2 e1=(Employee2)factory3.getBean("e1");
    e1.show();
    
    // --- Constructor Injection with Collection Example
    Resource r3=new ClassPathResource("applicationContext.xml");
    BeanFactory factory4=new XmlBeanFactory(r);
    
    Question q=(Question)factory4.getBean("q");
    q.displayInfo();
    
    // --- Constructor Injection with Non-String Collection (having Dependent Object) Example
	Resource r4=new ClassPathResource("applicationContext.xml");
	BeanFactory factory5=new XmlBeanFactory(r);
	
	Question q2=(Question)factory5.getBean("q2");
	q2.displayInfo();
    
  }
}
