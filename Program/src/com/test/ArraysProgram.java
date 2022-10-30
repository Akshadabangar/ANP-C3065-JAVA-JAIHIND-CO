package com.test;

public class ArraysProgram {

	public static void main(String[] args) {

		// Arrays collection of similar(Homogeneous) data type into a single unit
		// Arrays always index based
		// index start from 0
		// arrays size: arr.length

		// Disadvantages: Arrays is fixed in size
		// Homogeneous data type store

		String[] array1 = new String[5];// Array declaration creation
		array1[0] = "reshma";
		array1[1] = "chakuli";
		array1[2] = "shiv";
		array1[3] = "akshu";
		array1[4] = "sonii";

		int[] array2 = { 23, 7, 89, 19, 20, 18 };// arraY2 CREATE
		int lengthOfArray2 = array2.length;
		System.out.println("Size Of Array1: " + lengthOfArray2);
		// System.out.println(array2);// It print garbage value

		// we can print arrays y traversing it
		for (int i = 0; i < array1.length; i++) {

			System.out.println(array1[i]);
		}

	}
}
