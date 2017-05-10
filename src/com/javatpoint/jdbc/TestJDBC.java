/**
 * $RCSfile$
 * $Revision$
 * $Date$
 * $Source$
 * $Author$
 */
package com.javatpoint.jdbc;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class TestJDBC {

  public static void main(String[] args) {
    ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContextJDBC.xml");
    
    EmployeeDao dao=(EmployeeDao)ctx.getBean("edao");
    
    
/*    int status=dao.saveEmployee(new Employee(102,"Ala",35000));
    System.out.println(status);
    
    Boolean ret=dao.saveEmployeeByPreparedStatement(new Employee(102,"Pawe³",35));
    System.out.println(ret);*/
    
    /*int status=dao.updateEmployee(new Employee(102,"Sonoo",15000));
    System.out.println(status);
    */
    
    /*Employee e=new Employee();
    e.setId(102);
    int status=dao.deleteEmployee(e);
    System.out.println(status);*/
    
    List<Employee> list=dao.getAllEmployees();  
    
    for(Employee e:list)  
        System.out.println(e);  
    
  }

}
