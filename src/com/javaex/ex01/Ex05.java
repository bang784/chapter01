package com.javaex.ex01;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//일반적인 경우
		final double pi = 3.14;
		double result01 = pi*5*5;
		System.out.println(result01);
	
		//pi값을 변경하는 경우
		
		// pi=3.141519; //final이 되어있는데 상수로 정의되면 오류발생
		
		double result02 = pi*5*5;
		System.out.println(result02);
	
		System.out.println(pi);

	
	
		//상수정의 --> 보통 대문자로포기한다.
		final double PI = 3.14;
		
		double result03 = PI*5*5;
				System.out.println(result03);
	
	
	}
}
