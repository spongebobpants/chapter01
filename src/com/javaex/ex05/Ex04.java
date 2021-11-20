package com.javaex.ex05;

public class Ex04 {
	public static void main(String []args) {
		
		int[]ball=new int[6];
		for(int i=0; i<=6; i++) {
			ball[i]=((int)(Math.random()*45))+1;
			System.out.println(ball[i]);
		}
	}
		
}