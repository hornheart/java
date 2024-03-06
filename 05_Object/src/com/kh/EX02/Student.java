package com.kh.EX02;
//이름 나이 수학점수 영어, 국어를 데이터로 가지고 있는 객체를 만들기 위하 클래스 작성
		// 데이터는 직접 접근 허용 않고 모두 간접적으로 set/get해줄 수 있도록
		//모든 데이터를 매개변수로 받아 초기화하면서 객체를 생성할 수 있는 생성자를 작성


public class Student {
	
	// 필드 영역 (데이터)
	private String name;
	private int age;
	private int mathScore;
	private int enScore;
	private int koScore;
		
	// 생성자 영역
	public Student(String name, int age, int mathScore, int enScore, int koScore ) {
		this.name = name;
		this.age = age;
		this.mathScore = mathScore;
		this.koScore = koScore;
		this.enScore = enScore;
				
		
	}
	
	// 메소드 영역
	// getter / setter
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public int getMathScre() {
		return this.mathScore;
	}
	
	
	
	
	public int getEvg() {
		int evg = (this.enScore + this.koScore + this.mathScore ) /3;
	}

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		

	}

}
