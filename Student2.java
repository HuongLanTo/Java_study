package com.huonglanto.studyjava;

public class Student2 {  
    int id;
    String name;
    String city;
    
    Student2(int id, String name) {
    	this.id = id;
    	this.name = name;
    }
    Student2(int id, String name, String city) {
    	this(id, name);
    	this.city = city;
    }
    void display() {
    	System.out.println(id + " " + name + " " + city);
    }
    
    public static void main(String args[]) {
    	Student2 e1 = new Student2(111, "Hoang");
    	Student2 e2 = new Student2(222, "Thanh", "Nam Dinh");
    	e1.display();
    	e2.display();
    }
}  

