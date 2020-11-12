package com.javaex.ex03;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {

		
		int pay; //급여 --> 위에 선언한 이유 고민해볼것
		 
		Scanner sc = new Scanner(System.in);
		
		System.out.print("근무시간:");
		
		int worktime = sc.nextInt();
		
	
		if(worktime>8) //pay = 8*10000+(worktime-8)*15000;}
		{pay=8*10000+(worktime-8)*((int)(10000*1.5));}
			else {pay = worktime * 10000;}
		
		System.out.println("임금은 " + pay + " 입니다.");
		
		sc.close();
		
		

	}

}
