package com.javaex.ex01;

public class Ex07 {
	public static void main(String[] args){
		int a=7;
		int b=2;
		
		//변수 이름일 때는 숫자가 앞으로 오면 안되고 정 들어가야 하면 뒤에 넣기
		System.out.println("산술연산자");
		System.out.println(a+b); //9
		System.out.println(a-b); //5
		System.out.println(a*b); //14
		
		System.out.println(a/b); //3
		System.out.println(a%b); //1
		
		System.out.println("산술연산자");
		System.out.println(7.0/2.0);
		System.out.println(7.0%2.0);
		
		System.out.println("부호연산자");
		int var=-3;
		int pVar=+var;
		int mVar=-var;
		
		System.out.println(pVar); //-3
		System.out.println(mVar); //3
		
		//증감연산자
		System.out.println("증감연산자");
		System.out.println(a);//7
		System.out.println(++a);//8
		System.out.println(a);//8
		
		System.out.println(b);//2
		System.out.println(--b);//1
		System.out.println(b);//1
		
		System.out.println("retry");
		System.out.println(a);//8
		System.out.println(a++);//8
		System.out.println(a);//9
		
		System.out.println(b);//1
		System.out.println(b--);//1
		System.out.println(b);//0
		
		
	}
	
}

