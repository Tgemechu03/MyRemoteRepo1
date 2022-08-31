package com.array;

public class ArrayDemo3 {

	//Passing an array to a method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
		double[] studentMarks = { 67.234, 78, 45, 80, 95, 55, 77 };

		double returnVal = calcTotal(studentMarks);

		System.out.println("The sum studentMark is: " + returnVal);
	}

	private static double calcTotal(double[] Marks) {
		double total = 0;
		for (double elt : Marks) {
			total = total + elt;
		}
		return total;
	}
*/
		//Passing an array to a method
		double[]  studentMarks= {67.234,78.45,80,95,55,77};
		calcTotal(studentMarks);
		}
	public static void calcTotal(double[] marks) 
	{
		double total=0;
		for (int i= 0; i< marks.length; i++) {
			total = total + marks[i];
			}
		System.out.println("Total marks:"+ total);
	}
}
