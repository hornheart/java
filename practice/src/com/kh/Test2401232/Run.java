package com.kh.Test2401232;

public class Run {
	
	/*
	 * java는 모두 class로 이루어져 있다.
	 * Run Class를 만들어서 main문을 실행하는 용도로 사용하는 이유
	 * 
	 * main ->컴파일러에게 시작 위치를 알려주는 역할을 하는 메소드
	 */

	public static void main(String[] args) {
	//	Book myBook1 = new Book ("불멸의이순신", "김개똥", "2202-02-24", 1);
		
	//	Book myBook2 = new Book ("날아라슈퍼보드", "최지원", "1999-02-01", 2);
		
	//	Book [] myBookArr = new Book[3]; // 참조변수를 객체배열로 만 만든상태 -> 실제로 null인 상태
	//	myBookArr[0] = new Book ("불멸의이순신", "김개똥", "2202-02-24", 1);
    //   myBookArr[1] = new Book ("불멸의이순신", "김개똥", "2202-02-24", 1); 

		
		//객체를 만든다
		
		
		Library lib = new Library();
		lib.startLibrary();

		
		
	}

}
