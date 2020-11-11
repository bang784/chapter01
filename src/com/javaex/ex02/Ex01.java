package com.javaex.ex02;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 2345;
		double d = 3.14;
		String str = "굿모닝";
		char c = '한';
		String s = "한";
		
		String name = "남궁찬";
		
		
		System.out.println("안녕하세요.");
		System.out.println(str);
		
		System.out.print("안녕");
		System.out.print("하세요!");
		System.out.println("11/11");	
		
		System.out.println(2+5);
		System.out.println(i+i);
		
		System.out.println(i+d); // 정수+실수임 결국엔 실수가됨
		double result = i+d;
		System.out.println(result);
		
		// + 기호
		
		System.out.println(str+str+str);
		System.out.println(str+i);
		System.out.println(str+d);
		
		String result01 = str+d;
		System.out.println(result01);
		
		// 굿모닝 랑 2345 <-- 이렇게 출력 됬음 좋겠다.
		System.out.println(str + " 랑 " + i);
		
		// char 형 - char형은 코드값을 가지고 문자를 나타냄으로 + 는 숫자로 인식을 하게 됨.
		System.out.println(c);
		System.out.println(c+c);
		System.out.println(c+s);
		
		// 제이름은 남궁찬 입니다.
		System.out.println("제이름은 " + name + " 입니다.");
		System.out.println(name); // 메모리 공간의 이름
		System.out.println("name"); // name 이라는 문자열
		
		// 안녕하세요
		System.out.println("안녕하세요");
		
		// 안녕"하"세요
		System.out.println("안녕\"하\"세요");
		
		// 안녕\하\세요
		System.out.println("안녕\\하\\세요");
		
		// 안녕		하세요
		System.out.println("안녕\t하세요");
		
		// 줄바꿈
		System.out.println("안녕\n하\n세요");
		
		//줄바꿈 같은표현
		System.out.println("안녕");
		System.out.println("하");
		System.out.println("세요");
		
		
		
	}

}
