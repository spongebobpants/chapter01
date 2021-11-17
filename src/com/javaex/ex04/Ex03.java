package com.javaex.ex04;
import java.util.Scanner;
//for문
public class Ex03 {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("단을 입력해주세요 ");
		System.out.println("단: ");
		int dan=sc.nextInt();
		
		for(int i=1 ; i<=9; i++) { 
			System.out.println(dan+"*"+i+"="+(dan*i));
			
		}
	
		sc.close();
	 }

}
