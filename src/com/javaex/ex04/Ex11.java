package com.javaex.ex04;

public class Ex11 {
	public static void main(String []args) {
//		for(int i=1; i<=20; i++) {
//			if(i%2==0 || i%3==0) {//찍지 않게 해야함 
//				continue;
//			}
//			System.out.println(i);
//		}
		
		
//		for(int i=1; i<=20; i++) {
//			if(i%2==0 || i%3==0) {
//				System.out.println("");
//			}else {
//				System.out.println(i);
//			}
//		}

		for(int i=1; i<=20; i++) {
			if(!(i%2==0 || i%3==0)) {
				System.out.print("");
			}else {
				System.out.println(i);
			}
		}
		
	}

}
