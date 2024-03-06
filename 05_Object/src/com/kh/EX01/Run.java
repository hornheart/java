package com.kh.EX01;

public class Run {
	
	public static void main(String[] args) {
		
		/*
		//두 개의 인스턴스 객체가 생성된다.
		BankAccount yoon = new BankAccount();// myAcnt1라는 BankAccount
		BankAccount choi = new BankAccount();
		
		// 각각의 인스턴스 대상으로 예금을 진행
		yoon.deposit(5000);
		choi.deposit(3000);
		
		//각각의 인스턴스 객체를 대상으로 출금 진행
		yoon.withdraw(2000);
		choi.withdraw(2000);
		
		//각각의 인스턴스 객체의 잔액을 조회
		yoon.checkMyBalance();
		choi.checkMyBalance();
		
		System.out.print(yoon.balanceEquals(choi));
		
		
		*/
		
		
		BankAccount choi = new BankAccount();

		Choi.initAccount("123-456-789", "123123-4567654" , 1000)
		Park.initAccount("321-456-789", "321432-4567654" , 1000)
	}

}
