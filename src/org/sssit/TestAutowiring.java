/**
 * $RCSfile$
 * $Revision$
 * $Date$
 * $Source$
 * $Author$
 */
package org.sssit;  
import org.springframework.context.ApplicationContext;  
import org.springframework.context.support.ClassPathXmlApplicationContext;  
public class TestAutowiring {  
public static void main(String[] args) {  
    ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext2.xml"); 
    
    
    // --- Autowiring in Spring
    A a=context.getBean("a",A.class);  
    a.display();  
    
    // --- Dependency Injection with Factory Method in Spring
    A2 a2=(A2)context.getBean("a2");  
    a2.msg();  
    
    Printable3 p3=(Printable3)context.getBean("p3");  
    p3.print();  
    
    Printable3 p4=(Printable3)context.getBean("p4");  
    p4.print();  
}  
}