package com.array;

public class ArrayDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] ageOfStudent = new int[7]; //0-4
		ageOfStudent[0] = 23;
		ageOfStudent[1] = 20;
		ageOfStudent[2] = 33;
		ageOfStudent[3] = 31;
		ageOfStudent[6] = 25;
/*		
		System.out.println(ageOfStudent[0]);
		System.out.println(ageOfStudent[1]);
		System.out.println(ageOfStudent[2]);
		System.out.println(ageOfStudent[3]);
		System.out.println(ageOfStudent[4]);
		System.out.println(ageOfStudent[5]);
		System.out.println(ageOfStudent[6]);
		
	}
*/
		//for-each loop
		for(int elt: ageOfStudent) {  
		     System.out.print(elt + " ");	
		}
		System.out.println();
		//for loop
	    for(int i=0;  i<7; i++) {
	    	System.out.print(ageOfStudent[i] + " ");
	    }
		}
	
}
