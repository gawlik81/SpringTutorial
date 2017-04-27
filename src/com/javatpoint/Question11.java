/**
 * $RCSfile$
 * $Revision$
 * $Date$
 * $Source$
 * $Author$
 */
package com.javatpoint;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class Question11 {
private int id;
private String name;
private Map<Answer11,User11> answers;



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



public Map<Answer11, User11> getAnswers() {
  return answers;
}



public void setAnswers(Map<Answer11, User11> answers) {
  this.answers = answers;
}



public void displayInfo(){
  System.out.println("question id:"+id);
  System.out.println("question name:"+name);
  System.out.println("Answers....");
  Set<Entry<Answer11, User11>> set=answers.entrySet();
  Iterator<Entry<Answer11, User11>> itr=set.iterator();
  while(itr.hasNext()){
    Entry<Answer11, User11> entry=itr.next();
    Answer11 ans=entry.getKey();
    User11 user=entry.getValue();
    System.out.println("Answer Information:");
    System.out.println(ans);
    System.out.println("Posted By:");
    System.out.println(user);
  }
}
}