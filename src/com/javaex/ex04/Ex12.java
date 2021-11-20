package com.javaex.ex04;
import java.util.Scanner;

public class Ex12 {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요 (0이면 종료)");
		
		int num;//변수 목숨의 범위는 중괄호 안 
		int sum=0; //초기값. 계산에 영향을 줌 안그러면 계속 0이 넣어짐 
		
		/*do {
			//여기서 sum을 선언하면 괄호가 사라지면 넘겨지지가 않는다 목숨 길게 
			num=sc.nextInt();
			sum=sum+num;
			System.out.println("합계= "+sum); //한 사이클 ,  한 번은 무조건 실행되어야 하는 영역
		}while(num!=0);//0이 아니면 계속 계산한다 (정수면 다시 위로 올라감.) 
		System.out.println("종료 ");
		sc.close();*/
		
		
		while(true) {
			num=sc.nextInt();
			sum=sum+num;
			System.out.println("합계= "+sum);
			
			if(num==0) {
				break;
				//num=0이면 끝낸다 =while 문을 나가라 ->break 	
				//num=0 <- 0을 num에 대입하라 
			}
		}
		System.out.println("종료 ");
		sc.close();
			
		}//true는 무한으로 도는 것

}
