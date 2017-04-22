package com.javatpoint;

import java.util.Iterator;
import java.util.List;

public class Question2 {
private int id;
private String name;
private List<Answer2> answers;

public Question2() {}
public Question2(int id, String name, List<Answer2> answers) {
	super();
	this.id = id;
	this.name = name;
	this.answers = answers;
}

public void displayInfo(){
	System.out.println(id+" "+name);
	System.out.println("answers are:");
	Iterator<Answer2> itr=answers.iterator();
	while(itr.hasNext()){
		System.out.println(itr.next());
	}
}

}