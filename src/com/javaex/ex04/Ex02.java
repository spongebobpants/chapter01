package com.javaex.ex04;
import java.util.Scanner;

public class Ex02 {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("단을 입력해주세요 ");
		System.out.println("단: ");
		int dan=sc.nextInt();//입력값 
		int i=1;
		while(i<10) {//<=9
			System.out.println(dan+"*"+i+"=" +dan * i);
			i++;//i=i+1;..3...5->증가의 텀을 늘릴 수 있다 
		}
		
		
		sc.close();
	}

}
