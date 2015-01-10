package com.fethica;

public class NIWExample {

	public static void main(String[] args) {
		
		// Number to convert
		int number = 123456789;
		
		// Check the number length
		int length = String.valueOf(number).length();
		
		if (length > NIW.MAXLENGTH) {
			System.out.print("The number is too big to be converted! Max length = 9.");
		} else {
			System.out.print(NIW.toEnglish(number));
		}	

	}

}
