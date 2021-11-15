package com.javaex.ex03;
import java.util.Scanner;

public class Ex02 {
	public static void main(String []args) {
	Scanner sc = new Scanner(System.in) ;
	
	System.out.println("숫자를 입력해주세요 ");
	System.out.print("숫자 : ");
	
	int point=sc.nextInt();
	
	if(point>0) {
		System.out.println("양수");
	} else if(point<0) {
		System.out.println("음수 " );
	}else {
		System.out.println("0");//모두 해당하지 않는 것 
	}
	
	sc.close();
	}
	
}
