package com.javaex.ex04;

public class Ex01 {

	public static void main(String[] args) {

		//반복문에는 초기화 조건식 증감식 이 필요함		
		int i = 0;

		while(i<5) {			
			System.out.println("I like java" + i);
			i++;
		}	
		//반복구간
		// i=0   0<5  --> true   출력    0-->1
		//       1<5  --> true   출력    1-->2
		//       2<5  --> true   출력    2-->3
		//       3<5  --> true   출력    3-->4
		//       4<5  --> true   출력    4-->5
		//       5<5  --> false   OUT
	
	}
}
