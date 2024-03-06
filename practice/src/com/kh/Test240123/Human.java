package com.kh.Test240123;

public class Human {

	private String name;
	private int mathscore;
	private int koscore;
	private int enscore;
	
	
	public Human(String name, int mathscore, int koscore, int enscore ) {
		this.name = name;
		this.mathscore = mathscore;
		this.koscore = koscore;
		this enscore = enscore;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getMathScore() {
		return this.mathscore;
	}
	
	public int getKoScore() {
		return this.koscore;
	}
	
	public int getEnScore() {
		return this.enscore;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void getMathScore(int score) {
		this.score = score;
	}
	
	public void getKoScore(int score) {
		this.score = score;
	}
	
	public void getEnScore(int score) {
		this.score = score;
	}
	
	public void print() {
		System.out.printf(".", this.enscore, this.koscore, this.mathscore, this.name);
	}
}

	}

}
