package com.craft;

public class StudentInfo {

	String firstName = "James";
	   String lastName = "Foxx";
	   int rollNo = 11;
	   int age = 52;
	   char gender = 'M';
	   
	     void showMethod() {
	    	System.out.println("Student Full Name: " + firstName + " " + lastName);
	    	System.out.println("Student roll number: " + rollNo);
	    	System.out.println("Student Age: " + age);
	    	System.out.println("Student Gender: " + gender);   	
	   }
	    
	    public static void main(String[] args) {
	    	
//	    	new StudentInfo().showMethod();
	  	
	    	StudentInfo m1 = new StudentInfo();
	    	m1.showMethod();
	    }
}
