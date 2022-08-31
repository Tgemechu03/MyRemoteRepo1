package com.array;

public class ArrayAvg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double [] marksOfStudent = {67,78,80,95,55,77};
		
		double total = 0;
		double avg;
/*		
      // using for loop
		for (int i=0; i<marksOfStudent.length; i++) {
			total = total + marksOfStudent[i]; // 0+67+78+80+95+55+77
		}
		avg = total/marksOfStudent.length;
		System.out.println("Total of Student Mark: "+ total);
		System.out.println("Average of Student Mark: "+ avg);
	}
*/
		//using for-each loop
	for(double elt: marksOfStudent) {
		System.out.println(elt + " ");
		total = total + elt;
		}
	avg = total/marksOfStudent.length;
	System.out.println("Total of Student Mark: "+ total);
	System.out.println("Average of Student Mark: "+ avg);
	}
}
