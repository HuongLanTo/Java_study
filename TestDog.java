package com.huonglanto.studyjava;

class Animal1 {
	public void move() {
		System.out.println("Animals can move");
	}
	public void bark() {
		System.out.println("Dogs can bark");
	}
}

class Dog1 extends Animal1 {
	public void move() {
		super.move();
		System.out.println("Dogs can walk and run");
	}
}

public class TestDog {
	public static void main(String args[]) {
		Animal1 a = new Animal1();
		Animal1 b = new Dog1();
		
		a.move();
		b.move();
		b.bark();
	}
}