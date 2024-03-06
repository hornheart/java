package com.kh.inherit;

import java.util.Scanner;

public class BusinessMan extends Man {
	
	String company;
	String position;
	
	public BusinessMan() {
		super(name); // 인자로 문자열 하나를 전달 받을 수 있는 부모 생성자
		
		this.company = company;
		this.position = position;
	}
	
	public () {
		
		System.out.println("My name is " + company);
		System.out.println("My position is " + position);
		tellYourName();

	}

}
