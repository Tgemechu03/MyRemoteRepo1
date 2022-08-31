package com.craft;

public class Student {

	

		String name = "James";    //instance variable
		int age = 20;        //instance variable
		static int instituteCode = 1101; // static variable //global variable

		public double getDiscount(int price) {
			double discount = price*(20/100);  // local variable
			return discount;
	}

		public static void main(String[] args) {
			
//			System.out.println("Student Name:" + name); //instance variable
//			System.out.println("Student age:" + age); // instance variable
//			System.out.println("Student instituteCode: "   + instituteCode); // static variable
			
			Student s1 = new Student();
			s1.name = "Jamie";
			System.out.println("Student Name:" + s1.name); //instance variable
			System.out.println("Student age:" + s1.age); // instance variable
			System.out.println("Student instituteCode: "   + s1.instituteCode); // static variable
			System.out.println("Discount price: " + s1.getDiscount(1000));
			
			Student s2 = new Student();
			
			Student s3 = new Student();
			
			Student s4 = new Student();
			
			
			
		}
}
