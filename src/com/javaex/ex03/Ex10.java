package com.javaex.ex03;
import java.util.Scanner;

public class Ex10 {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("select class ");
		System.out.println("1.JAVA 2.C 3.C++ 4.Python");
		
		System.out.print("class: ");
		int code=sc.nextInt();
		switch(code) {
		case 1: 
			System.out.println("R101");
			break;
		case 2:
			System.out.println("R202");
			break;
		case 3:
			System.out.println("R303");
			break;
		case 4:
			System.out.println("R404");
			break;
		default:
			System.out.println("call service");
			break;
		}
		
		
		
		sc.close();
	}

}
