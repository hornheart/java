package com.kh.HomeWork;

public class H_w012601 {
	/*
	package ifexample;
	
	public class IfExample1 {
		public static void main (String [] args) {
			int age = 7;
			if (age >= 8) {
				System.out.println("학교에 다닙니다.");
			} else {
				System.out.println("학교에 다니지 않습니다.");
			}
		}
	}
	*///===>질문하기!!!!!!!
	
	//public IfExample1 {
		/*public static void main(String[] args) {
			char gender = 'F';
			if (gender == 'F' ) {
				System.out.println("여성입니다");
				
			} else {
				System.out.println("남성입니다.");
			}
			
		}
	}
	*/
	/*
	public static void main(String [] args) {
		int age = 9;
		int charge;
		
		if(age < 8) {
			charge = 1000;
			System.out.println("취학 전 아동입니다.");
			
			
		}
		else if(age < 14 ) {
			charge = 2000;
			System.out.println("초등학생입니다.");
		} else if (age < 20){
			charge = 2500;
			System.out.println("중,고등학생입니다.");
		} else {
			charge = 3000;
			System.out.println("일반인입니다.");
		}
		System.out.println("입장료는" + charge + "원입니다.");
	}
	*/ //p.98
	/*
	public static void main(String [] args) {
	int age = 9;
	int charge;
	 
	if(age < 8) {
		charge = 1000;
		System.out.println("취학 전 아동입니다.");
		
	}
	if (age <14) {
		charge = 2000;
		System.out.println("초등학생입니다.");
		
		
	}
	if(age < 20 ) {
		charge = 2500;
		System.out.println("중,고등학생입니다.");
	} else {
		charge = 3000;
		System.out.println("일반인 입니다.");
	}
	System.out.println ("입장료는 " + charge + "원입니다.");
	
	}
	*/ //p.99
	public static void main(String [] args) {
		
		/*
		int ranking = 1;
		char medalColor;
		switch(ranking) {
			case 1 : medalColor = 'G';
				break;
			case 2 : medalColor = 'S';
				break;
			case 3 : medalColor = 'B';
				break;
			default :medalColor = 'A';			
			
			
		}
		System.out.println(ranking + "등 메달의 색깔은 " + medalColor + "입니다.");
		*/
		/*
		int ranking = 1;
		char medalColor;
		
		switch(ranking) {
		case 1 : medalColor = 'G';
		
		case 2 : medalColor = 'S';
			
		case 3 : medalColor = 'B';
			
		default :medalColor = 'A';	 
		}
		System.out.println(ranking + "등 메달의 색깔은 " + medalColor + "입니다.");
		*/ //p.104
		/*
		
		String medal="Gold";
		
		switch(medal) {
			case "Gold":
				System.out.println("금메달 입니다.");
				break;
			case "Sliver":
				
				System.out.println("은메달 입니다.");
				break;
			case "Bronze":
				System.out.println("동메달 입니다.");
				break;
			default:
				System.out.println("메달이 없습니다.");
				break;
				*/
		
		
		//}
		/*
		String model="5F";
				
		switch(model) {
			case "1F" :
				System.out.println("1층은 약국");
			case "2F" :
				System.out.println("2층은 정형외과");
			case "3F" :
				System.out.println("3층은 피부과");
			case "4F" :
				System.out.println("4층은 치과");
			case "5F" :
				System.out.println("5층은 헬스클럽");
		}
		*/ //p.106
		
		/*
		int num = 1;
		num += 2;
		num += 3;
		num += 4;
		num += 5;
		num += 6;
		num += 7;
		num += 8;
		num += 9;
		num += 10;
		
		System.out.println("1부터 10까지의 합은 " + num + "입니다.");
		*/
		/*
		int dan;
		int times;
		
		for(dan=2; dan<=9; dan++) { 
			for (times = 1; times <=9; times++) {
				System.out.println(dan + "X" + times + "=" + dan * times);
			}
			System.out.println();
		} 
		*/
		
		/*
		int total = 0;
		int num;
		
		for(num=1; num<=100; num++) { 
			if (num % 2 == 0) 
				continue;
			total += num;
		}
						
			System.out.println("1부터 100까지의 홀수의 합은 : " + total + "입니다.");
		 
		*/
		/*
		int sum = 0;
		int num = 0;
		
		for(num=0; sum<100; num++) { 
			
				sum += num;
			
		}
						
			System.out.println("num: " + num);
			System.out.println("sum: " + sum);
			*/
		/*
		int sum = 0;
		int num = 0;
		
		for(num=0; ; num++) { 
			
				sum += num;
			if (sum>=100)
				break;
		}
						
			System.out.println("num: " + num);
			System.out.println("sum: " + sum);
			*/
		//연습문제p123//
		//Q1
		
			
		int num1=10;
		int num2=2;
		char operator = '+';
		
		if(operator==12) {
			operator = 10 + 2;
			System.out.println("계산이 맞습니다.");
		}
		else {
			operator  10+2;
			System.out.println("계산이 틀렸습니다.");
		}
				
			
	}	
	
	
	
}	
	

