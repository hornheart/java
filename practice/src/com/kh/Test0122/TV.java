package com.kh.Test0122;

public class TV {
	//필드
	String brand;
	int year;
	int inch;
	private int price;

	public TV(String brand, int yeat, int inch, int price) {
		// 
		this.brand = brand;
		this.year = year;
	
		this.inch = inch;
		this.price = price; 

	}
	//메소드
	
	
	public void show() {
		System.out.println(this.brand + "에서 만든" + this.year + "년형" + this.inch + "인치TV");
	}

}
