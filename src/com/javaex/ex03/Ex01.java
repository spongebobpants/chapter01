package com.javaex.ex03;
import java.util.Scanner;

public class Ex01 {
	
	public static void main(String []args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("점수: ");
		int num=sc.nextInt();
		
		if (num>=60) {//60점 이상이니?
			//질문이  true일 때만 실행되는 영역 
			System.out.println("합격입니다");
		}else {
			//질문이  false일 때만 실행되는 영역 
			System.out.println("불합격입니다 ");
		}

		
		System.out.println("프로그램 종료 ");
		
		sc.close();	
	}
}
