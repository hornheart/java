package com.kh.Test240123;

import com.kh.Test0122.Human;

public class Run {
	public static void main() {
		
		
		/*
		String name;
		int math, korean, english;
		
		System.out.print("이름 : ");
		name = sc.next();
		
		System.out.print("수학점수 : ");
		math = sc.nextInt();
		
		System.out.print("국어점수 : ");
		korean = sc.nextInt();
		
		System.out.print("영어점수 : ");
		english = sc.nextInt();
		
		System.out.println( "평균 : " + (math + korean + english) / 3.0);
	*/ //====> 쌤
	// 사용자로부터 이름 수학점수 / 국어점수 / 영어점수를 입력받아
	// 평균을 실수로 구하세요.
	
	
	
	
	
	// 위에서 입력받은 정보로 객체를 생성할 수 있는 Student클래스를 작성하세요.
	// 평균을 구하는 메소드를 포함하여 작성합니다.
	
	// 해당하는 프로그램을 작성합니다.
	// ==============성적관리 프로그램=================
	// 1. 성적입력
	// 2. 모든학생 성적확인
	// 3. 학생성적검색
	// 9. 종료
	// 메뉴를 입력하세요 :
	// -> 1번 입력시 이름 / 수학점수 / 국어점수 / 영어점수를 입력받아 객체배열에 저장
	// -> 2번 입력시 객체배열에 저장된 모든 객체정보 표시
	// -> 3번 입력시 이름을 입력받아 해당 이름의 학생 검색 후 정보출력
	// -> 9번 입력시 종료
	
	/*
	public static void main(String[] args) {
		
		Human[] humanArr = new Human[random];
		humanArr[] = new Human();
		
		for (int i = 0; i < humanArr.length; i++) {
			humanArr[i].print();
			System.out.print();
		}
		
		Human[] humanArr
		
		*/ //====my
	
		
	Student[] stAtt = new Student [100];	
	int select;
	
	System.out.println("========성적관리 프로그램=========");
	System.out.println("1.성적입력");
	System.out.println("2. 모든 학생 "
			System.out.println(
			
			System.out.println(
					
					
					
					
	switch
	
	case 1 : {
		String name;
		int math, korean, english;
		
		System.out.print("이름 : ");
		name = sc.next();
		
		System.out.print("수학점수 : ");
		math = sc.nextInt();
		
		System.out.print("국어점수 : ");
		korean = sc.nextInt();
		
		System.out.print("영어점수 : ");
		english = sc.nextInt();
		
		int i = 0;
		boolean isTrue = false; //중복이 존재하면 true/ 존재하지 않으면 false로 유지
		while(stArr[i] ! = null) {
			if (stArr[i]. getName().equals(name)) {// 배열에 저장된 객체의 이름과 입력받은 이름이 동일 할 때
				System.out.println("해당 이름으로 저장된 성적이 존재합니다.");
				isTrue = true;
				break;
			
			}
		}
		if(!isTrue ) { //모든 학생의 성적확인
			stArr[index] = new Student(name, math, korean, english);
			System.out.println("성적 저장 완료 : " + stArr[index].toString());
		}
		
		
		
	} break;
	
	case 2 : { //모든 학생의 성적확인
		System.out.println("==========모든 학생 성적 확인 =======");
		for (int i = 0; stArr[i] !=null; i++) {
			System.out.print(st)
		}
				. toString());
				
	}
	
	}
	
	
	
	

}
