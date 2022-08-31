package com.array;

public class ArrayDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nameOfStudent[] = { "James", "Mark", "John", "Nick", "Soresa" };

		for (int i = 0; i < nameOfStudent.length; i++) { // for loop
			System.out.println(nameOfStudent[i] + " ");
		}
		for (String elt : nameOfStudent) { // for-each loop
			System.out.print(elt + " ");
		}

	}

}
