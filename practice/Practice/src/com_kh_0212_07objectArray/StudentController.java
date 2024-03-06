package com_kh_0212_07objectArray;

import java.util.Scanner;

public class StudentController {
	
	Student [] sArr = new Student[5];
	Scanner sc = new Scanner(System.in);
	
	public int CUT_LINE = 60;
	/*
	 * name;
		this.subject = subject;
		this.score = score;
	 */
	
	public StudentController {
		/*
		sArr [0] = new name ("김길동", "자바", "100");
		sArr [1] = new name ("박길동", "디비", "50");
		sArr [2] = new name ("이길동", "화면", "85");
		sArr [3] = new name ("정길동", "서버", "100");
		sArr [4] = new name ("홍길동", "자바", "20");
		*/		

		System.out.println("========== 학생 정보 입력 ==========");
	
		
		String name, subject;
		int score;
		
		System.out.println("이름 : ");
		name = sc.next();
		System.out.println("과목 : ");
		subject = sc.next();
		System.out.println("점수 : ");
		score = sc.nextInt();
		
	}
	
	public Student [] printStudent() {
		/*
		System.out.println("========== 학생 정보 입력 ==========");
	
		
		String name, subject;
		int score;
		
		System.out.println("이름 : ");
		name = sc.next();
		System.out.println("과목 : ");
		subject = sc.next();
		System.out.println("점수 : ");
		score = sc.nextInt();
		*/
		
		//return null;
	}
	
	public int sumScore () {
		return 0 ;
	}
	
	public double[] avgScore() {
		return  () / 5.0;
	}
	
	

}
