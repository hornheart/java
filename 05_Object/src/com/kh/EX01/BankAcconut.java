package com.kh.EX01;

public class BankAcconut {

	
		// 필드(클래스의 데이터를 정의)
		int balance = 0;
		String accNumber;
		String ssNumber;
		
		//생성자(데이터 초기화 : 특수목적 메소드)
		//생성자는 class와 동일한 메소드이다.
		//반환형이 존재하지 않는다.
		// 아무것도 만들지 않으면 컴파일러가 자동으로 기본 생성자를 만들어 줌
		
		public BankAccount() {
			
		}
		
		public BankAccount(String) {
			System.out.println("객체생성);
		}
		  
		  
		  
		 
		
		
		public BankAccount() {
			
		}
		
		// 데이터 초기값 세팅을  위한 메소드 생성
		public void initAccount(String acc, String ss, int bal) {
				accNumber = acc;
				ssNumber = ss;
				balance = bal;
		}		
	
		public int deposit (int amount) {
			balance += amount;
			return balance;
		}
		
		public int withdraw(int amount) {
			balance -= amount;
			return balance;
		}
		
		public int checkMyBalance() {
			System.out.println("잔액 :  " + balance );
			return balance;
		}
		
		public boolean balanceEquals(BankAccount act01) {
			if(balance == act01.balance) {
				return true;
				
			} else {
				return false;
			}
		}

	}


