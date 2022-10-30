package com.test;

class MethodDefineAndCall {

	public static void addition(int a, int b) {
		// code or implementation addition method
		int c = a + b;
		System.out.println(c);
	}

	public void substraction(int a, int b) {

		int c = a - b;
		System.out.println("Substraction of two integer is : " + c);
	}

	static public void main(String[] args) {
		System.out.println("main with string args");
		
		MethodDefineAndCall obj = new MethodDefineAndCall();
		//In case of static method we can call method by 3 one way
				//by creating object
				// class.method name
				//method name
		addition(20, 30);
		MethodDefineAndCall.addition(54, 78);
		obj.addition(87, 98);
		// but in case of non-static method we can call method by only one way
		//by creating object
		obj.substraction(20, 30);
	}

	// we can overload the main method
	// we can overload static method
	static public void main(int[] args) {
		System.out.println("main with int args");
	}

}

/*
 * OUTPUT********* Hello world....
 */