package com.kh.Test2401232;

import java.util.Scanner;

public class Library { //Library 의 객체가 생성된다면
	
	Book[] bookArr; // 
//도서관리 프로그램
	Scanner sc;
	
	public Library() {
		this.bookArr = new Book[100]; // bookArr는 Book 참조변수 100개를 가지고 있는 배열
		this.sc = new Scanner (System.in);
	}
	
	public void startLibrary () {
		int choice = 0;
		while(choice !=9) {
		
		System.out.println("==========도서관리프로그램==========");
		System.out.println("1.도서등록");
		System.out.println("2. 모든 도서 출력");
		System.out.println("9. 종료");
		System.out.println("메뉴 입력 : ");
		choice = sc.nextInt();
		
		switch (choice) {
		case 1 : // 도서등록
			this.insertBook();
			
			break;
			
		case 2 : //모든 도서출력
			this.allPrintBook();
			break;
			
			
		}
		
	
	
		
	}
		
	}	
	public void insertBook() {

		String title, author, date;
		int number;
		
		System.out.print("제목 :  ");
		title = sc .next();
		
		System.out.print("작가 :  ");
		author = sc .next();
		
		System.out.print("발행일 :  ");
		date = sc .next();
		
		System.out.print("책 번호 :  ");
		number = sc .nextInt();
		
		
		// 제목이 똑같은 책이 있다면 생성하지 말고 "이미 등록된 도서 입니다." 출력 후 넘어가기
		
		boolean isEquals = false; //->중복이 있냐 없냐를 저장하기 위한 변수 false ->중복없음
		int i = 0;
		while(bookArr[i] !=null) { // bookArr[i] == null => bookArr[i]가 가르키는 메모리가 존재하지 
			if (bookArr[i].getTitle().equals(title)) {//사용자가 입력한 title과 
				isEquals = true;
				break;
				
			}
		// index	
			i++;//다음 인덱스 값을 검사하기 위해  i->1증가
		}
		
		// isEquals : false -> 중복이 없다. -> 생성해야한다.
		// isEquals : true -> 중복이 있다.
		if(!isEquals) {// flase 중복이 없다면 객체 추가생성
		bookArr[i] = new Book(title,author, date, number );
		System.out.println("도서 등록 완료");
		System.out.println("도서 정보  : " + bookArr[i].toString());
				
		} else {
			System.out.println("해당 도서는 이미 존재합니다.");
		}
		
	}
	public void allPrintBook() {	
		System.out.println("=====모든 도서 목록=======");
		for (int i = 0; i < bookArr.length; i++ ) {
			if (bookArr[i] == null) {
				break;
			}
			System.out.println(bookArr[i].toString());
		}
	
	}
	

	

}
