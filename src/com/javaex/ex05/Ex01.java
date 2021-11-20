package com.javaex.ex05;

public class Ex01 {
	public static void main(String []args) {
		
		
		/*
		System.out.println(n01);
		System.out.println(n02);
		System.out.println(n03);
		System.out.println(n04);
		System.out.println(n05);*/
		
		int[] ball= new int[6];
		for(int i=0; i<6; i++) {
		ball[i]=((int)(Math.random()*45))+1;
		System.out.println(ball[i]);
		}
	}
}
		
		
		//int apt[]를 만들라는 문법 ,new int[]-> 6칸 아파트 만들어라 	
//		ball[0]=((int)(Math.random()*45))+1;
//		ball[1]=((int)(Math.random()*45))+1;
//		ball[2]=((int)(Math.random()*45))+1;
//		ball[3]=((int)(Math.random()*45))+1;
//		ball[4]=((int)(Math.random()*45))+1;
//		ball[5]=((int)(Math.random()*45))+1;
//		
//		for(int i=0; i<6; i++) {
//			System.out.println(ball[i]);

