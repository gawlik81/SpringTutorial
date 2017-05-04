package com.javatpoint.aop;

public class Validator {
	public void validate(int age) throws Exception {
	  Thread.sleep(4000);
		if (age < 18) {
			throw new ArithmeticException("Not Valid Age");
		} else {
			System.out.println("vote confirmed");
		}
	}
}