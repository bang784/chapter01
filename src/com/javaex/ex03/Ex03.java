package com.javaex.ex03;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
	
	System.out.println("숫자를 입력하세요.");
	System.out.print("숫자:");

	Scanner sc = new Scanner(System.in);
	
	int number = sc.nextInt();
	
	if(number>0) {System.out.println("양수입니다.");
	
	}
	
	else if(number<0) {System.out.println("음수입니다.");
	
	}
	
	else{System.out.println("0입니다.");}
	
	
	
	
	sc.close();
	
	}

}
