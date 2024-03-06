package com.kh.EX02;

public class University {

	
	// 이름 (name), 평균 합격컷(evgCut), 국어최저점수(koCut), 영어최저점수(enCut)
	// 모든 데이터를 매개변수로 받아 초기화하는 생성자 정의
	private String name;
	private int evgCut;
	private int koCut;
	private int enCut;
	
	public University(String name, int evgCut, int koCut, int enCut) {
		this.name = name;
		this.evgCut = evgCut;
		this.koCut = koCut;
		this.enCut = enCut;
	} 
	
	public String getName(String name) {
		return this.name;
	}
	
	public int getEvgCut(int evgCut) {
		return this.evgCut;
	}
	
	public int getEnCut(int enCut) {
		return this.enCut;
	}
	
	public String getName() {
		return this.name;
	}
		
	
	
	
	
	
	
	
	//합격했다면 true / 불합격했다면 false 리턴
	public boolean isEvaluate(Student st) {
		if (st.getEvg() >= this.evgCut && 
				st.getEnScore() >= this.enCut &&
				st.getKoScore() >= this.koCut) {
	}

	

}
