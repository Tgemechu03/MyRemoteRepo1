package com.array;

public class ArrayAvg1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
		  double[] studMark = { 67.5, 78, 80, 95.9, 55, 77, 100, 81, 67, 83 };
		  
		 double returnAvg = findAverage(studMark);
		  System.out.println("The average mark of the student: " + returnAvg);
		  
		  }
		  
		  public static double findAverage(double[] mark) { // TODO Auto-generated
		  method stub
		  
		  double total = 0; 
		  double avg;
		  
		for (int i = 0; i < mark.length; i++) { total = total + mark[i]; } avg =
		  total / mark.length;
		  
		  return avg; }
*/
		
		double[][] studMark = { { 67.5, 78, 80, 95.9, 55, 77 }, { 59, 78, 80, 95.9, 75, 77, 90, 81 },
				{ 75, 78, 80, 59, 55, 77, 100, 81, 67, 78 } };
		double total = 0;
		double avg;
        
		for (int i = 0; i < studMark.length; i++) {

			for (int k = 0; k < studMark[i].length; k++) {

				System.out.print(studMark[i][k] + " ");

				total = total + studMark[i][k];
				System.out.println();
				}
			avg = total/studMark.length;
		
			System.out.println("Total of Student Mark: "+ total);
			System.out.println("Average of Student Mark: "+ avg);
		}

	}
}
