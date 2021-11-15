package com.javaex.ex03;
import java.util.Scanner;

public class Ex05 {
	public static void main(String []args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("근무시간: ");
		int num=sc.nextInt();
		if (num<=8) {
		System.out.println(num*10000);
		} else{
		System.out.println("임금은 "+(num*10000+2000)+"원 입니다.");
		}
		sc.close();
}
}
