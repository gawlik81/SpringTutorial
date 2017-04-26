/**
 * $RCSfile$
 * $Revision$
 * $Date$
 * $Source$
 * $Author$
 */
package com.javatpoint;

import java.util.Iterator;
import java.util.List;

public class Question9 {
private int id;
private String name;
private List<Answer9> answers;


public int getId() {
  return id;
}


public void setId(int id) {
  this.id = id;
}


public String getName() {
  return name;
}


public void setName(String name) {
  this.name = name;
}


public List<Answer9> getAnswers() {
  return answers;
}


public void setAnswers(List<Answer9> answers) {
  this.answers = answers;
}


public void displayInfo(){
  System.out.println(id+" "+name);
  System.out.println("answers are:");
  Iterator<Answer9> itr=answers.iterator();
  while(itr.hasNext()){
    System.out.println(itr.next());
  }
}

}
