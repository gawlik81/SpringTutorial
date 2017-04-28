/**
 * $RCSfile$
 * $Revision$
 * $Date$
 * $Source$
 * $Author$
 */

package org.sssit;

public class A2 {
  private static final A2 obj = new A2();

  private A2() {
    System.out.println("private constructor");
  }

  public static A2 getA2() {
    System.out.println("factory method ");
    return obj;
  }

  public void msg() {
    System.out.println("hello user");
  }
}