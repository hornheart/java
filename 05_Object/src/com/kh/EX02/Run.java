package com.kh.EX02;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		
		/*
		// choi객체 생성 최지원, 15살, 영어 : 60, 수학 : 70, 국어 : 80
		// choi객체 생성 김도현, 17살, 영어 : 95, 수학 : 85, 국어 : 80
		
		Student choi = new Student("최지원", 15, 70, 60, 80);
		Student kim = new Student("김도현", 17, 85, 95, 80);
		
		//choi의 모든 과목의 평균을 출력해라
		System.out.println(choi.getName() + "님의 평균 : " + (choi.getEvg());
		
		//kim의 모든 과목의 평균을 출력해
		System.out.println(kim.getName() + "님의 평균 : " + (kim.getEvg());
		*/
		
		//사용자로부터 이름, 나이, 영어점수 수학점수 국어점수를 입력받아 
		//평균을 구하고 출력하는 프로그램 작성
		//예) 이름 : 최정원
		//   나이 : 15
		//   영어 : 80
		//   수학 : 100
		//   국어 : 75
		// 최정원님의 평균 : 85
		
		/*
int ko, ma, en;
int ko, ma, en;
		System.out.println("국어, 수학, 영어 점수를 입력해 주세요");
		ma = sc.nextInt();
		en = sc.nextInt();
		ko = sc.nextInt();
		
		int evg = (this. )
*/
		
		/*
		Scanner sc = new Scanner(System.in);
		String name;
		int age, en, ko, math;
		
		System.out.print("이름 : ");
		name = sc.next();
		
		System.out.print("나이 : ");
		age = sc.nextInt();
		
		System.out.print("영어 : ");
		en = sc.nextInt();
		
		System.out.print("수학 : ");
		math = sc.nextInt();
		
		System.out.print("국어 : ");
		ko = sc.nextInt();
		
		Student st1 = new Student(name, age, math, en, ko);
		
		*/
		
		//kh대학교, evgCut : 75, enCut : 60, koCut : 객체 생성
		University kh = new University("KH대학교", 75, 60, 60);
		Student choi = new Student("최지원", 15, 70, 60, 80 );
		
		//choi학생객체는 kh대학교에 입학이 가능한지 검사하여
		//가능하다면 "합격입니다"
		//불가능하다면 "불합격입니다"
		//를 출력하는 프로그램 작성
		
		/*
		 * 

		Scanner sc = new Scanner(System.in);
		
		int ma, en, ko;
		
		System.out.println("수학, 영어, 국어 점수를 입력해 주세요.");
		ma = sc.nextInt();
		en = sc.nextInt();
		ko = sc.nextInt();
		
		if ((ma + en + ko) / 3 >= 75 ) {
			System.out.println("합격입니다.");
		} else {
			System.out.println("불합격입니다.");
		*/ //====>my
		
		
		if (choi.getEnScore() >= kh.getEvgCut() &&
				choi .getenScore() >= kh.getenCut() &&
				choi .getkoScore() >= kh.getkoCut()) {
			
			System.out.println("합격입니다.");
			
		
		} else {
		
	}

}
