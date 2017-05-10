/**
 * $RCSfile$
 * $Revision$
 * $Date$
 * $Source$
 * $Author$
 */
package com.javatpoint.jdbc;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class TestJDBCNamedParameter {
  public static void main(String[] args) {

    Resource r = new ClassPathResource("applicationContextJDBC.xml");
    BeanFactory factory = new XmlBeanFactory(r);

    EmployeeDaoNamedParameter dao = (EmployeeDaoNamedParameter)factory.getBean("edaonp");
    dao.save(new Employee(23, "sonoo", 50000));

  }
}  