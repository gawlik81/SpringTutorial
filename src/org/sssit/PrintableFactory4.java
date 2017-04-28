/**
 * $RCSfile$
 * $Revision$
 * $Date$
 * $Source$
 * $Author$
 */
package org.sssit;

public class PrintableFactory4 {  
//non-static factory method  
public Printable3 getPrintable3(){  
    return new A3();//return any one instance, either A or B  
}  
}  