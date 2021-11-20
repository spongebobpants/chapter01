package com.javaex.ex05;
import java.util.Random;

public class multi_array {
	public static void main(String []args) {
		
		
		Random r =new Random();//랜덤 값 선언 
		int[][] practice2=new int[3][3];
		
		for(int i=0; i<practice2.length; i++) {
			for(int j=0; j<practice2.length; j++) {
				practice2[i][j]=-1;
			}
		}
	}

}
