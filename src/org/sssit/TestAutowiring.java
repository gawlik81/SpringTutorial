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
    ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");  
    A a=context.getBean("a",A.class);  
    a.display();  
}  
}