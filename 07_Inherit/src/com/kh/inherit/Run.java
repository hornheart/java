package com.kh.inherit;

public class Run {

	public static void main(String[] args) {
		BusinessMan man = new BusinessMan( "kh", "강사", "지원");
		man.name = "00";
		man.tellYourName();
		
		man.company = "kh";
		man.position = "강사";
		man.tellYourInfo();

	}

}
