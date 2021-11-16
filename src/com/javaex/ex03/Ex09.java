package com.javaex.ex03;
import java.util.Scanner;

public class Ex09 {
public static void main(String []args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("과목을 선택하세요 ");
	System.out.println("1.자바 2.c 3.c++ 4.파이썬 ");
	System.out.print("과목번호: ");
	
	int room=sc.nextInt();
	if (room==1) {
		System.out.println("R101");
	}else if(room==2) {
		System.out.println("R202");
	}else if(room==3) {
		System.out.println("R303");
	}else if(room==4) {
		System.out.println("R404");
	}else {
		System.out.println("상담원에게 문의하세요 ");
	}
	
	sc.close();
}
	
}
