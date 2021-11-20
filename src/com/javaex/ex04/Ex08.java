package com.javaex.ex04;

public class Ex08 {
	public static void main(String []args) {
		int i=0;
		
		while(true) {
			i++;
			if((i%6==0) && (i%14==0)) {
				System.out.println(i);
				break;//탈출구를 만들어야만 끝난다. 
			}//블록처리를 해야만 

		}//조건식이 거짓이 돌 때까지 구문 1 (i++)을 계속 실행한다 
		//while  문 조건에 항상 참이 되는 식을 넣으면 된다. 
		
		
	}

}
