package com.huonglanto.studyjava;
class Caculation {
	int z;
	
	public void addition(int x, int y) {
		z = x + y;
		System.out.println("The sum of the given number:" + z);
	}
	
	public void Subtraction(int x, int y) {
		z = x - y;
		System.out.println("The difference between the given number:" + z);
	}
}

public class My_Caculation extends Caculation {
	public void multiplication(int x, int y) {
		z = x * y;
		System.out.println("The product of the given number:" + z);
	}
	
	public static void main(String args[]) {
		int a = 20, b = 10;
		My_Caculation demo = new My_Caculation();
		demo.addition(a, b);
		demo.Subtraction(a, b);
		demo.multiplication(a, b);
	}
}
