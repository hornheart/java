package com.kh.inherit;

import java.util.Scanner;

public class BusinessManagement { // 학생관리프로그램
	Scanner sc;
	Student[] seArr; // 학생목록
	
	public StudentManagement() {
		super ();
		this.sc = Scanner(System.in);
		this.stArr = new Student[100];

	}
	
	public void startProgram() {
		int select = 0;
		while (select ! = 9) {
			select = this.printMenu();
			
			switch(select ) {
			case 1 : // 성적입력
				this.insertGrade();
				break;
			case 2 : 
				this.printAllGrade();
				break;
			case 3 :
				this.searchGradeByName();
				break;
			case 4 ;
			    this.lastGradsDelete();
			
			
			}
		}
	}

}
