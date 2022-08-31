package com.array;

public class TwoD_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int marks [] [] = {{50,65,70},
				{55 ,68,75},
				{57,61,78},
				{59 ,60,71}};
		        //print the marks
		for(int i=0; i<marks.length; i++) {
			System.out.println("Student"+ i +" ");
		 for(int j=0; j<3; j++) { //or we can say, for(int j=0; j<marks[i].length; j++). Here the length of "j" is 3.
			 System.out.println(marks[i][j] + " ");
		 }
		System.out.println(); //The purpose of this statement is to have space b/n lines. 
		}
	}

}
