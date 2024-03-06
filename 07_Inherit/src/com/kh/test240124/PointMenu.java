package com.kh.test240124;

import java.util.Scanner;

public class PointMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		private Scanner sc = new Scanner (System.in);
		private CircleController cc = new CircleController;
		private RectangleController rc = new RectangleController;
		
		public void mainMenu() {
			while(turn) {
			System.out.println("====메뉴====");
			System.out.println("1. 원");
			System.out.println("2. 사각형");
			System.out.println("9. 끝내기");
			System.out.println("메뉴 번호 : ");
			
			int menuNum = sc.nextInt();
			
			switch(munuNum) {
			case 1 :
				circleMenu();
				break;
			
			case 2 :
				rectangleMenu();
				break;
			case 9 :
				System.out.println("종료합니다.");
				return;
				
			default :
				System.out.println("잘 못 입력하셨습니다. 다시 입력해 주세요.");
			}	
		}
				

	}
	public void circleMenu () {
		while(turn) {
			System.out.println(" 원 메뉴 ");
			System.out.println("1. 원 둘레 ");
			System.out.println("2. 원 넓이 ");
			System.out.println("9. 메인으로 ");
			System.out.print("메뉴 번호 : ");
			
			int menuNum = sc.nextInt();
			
			switch(menuNum ) {
			case 1 :
				calcCircum();
				break;
				
			case 2 :
				calcCircleArea();// 원넓이
				break;
				
			case 9 :
				System.out.println("메인으로 돌아갑니다.");
				return;
				
			default:
				System.out.println("잘 못 입력하셨습니다. 다시 입력해 주세요.")
			}
			
		}
	}
	public void calcCircum() {
		System.out.print("x좌표 : ");
		int x  = sc.nextInt();
		System.out.print("y좌표 : ");
		int y = sc.nextInt();
		System.out.print("반지름 : " );
		int radius = sc.nextInt();
		
		System.out.println(cc.calcCircum (x, y, radius));
	
	}
	public void calcCirleArea() {
		System.out.print("x좌표 : ");
		int x  = sc.nextInt();
		System.out.print("y좌표 : ");
		int y = sc.nextInt();
		System.out.print("반지름 : " );
		int radius = sc.nextInt();
		
		System.out.println(cc.calcArea (x, y, radius));
	}
	
	public void rectangleMenu() {
		while(true ) {
			System.out.println(" 원 메뉴 ");
			System.out.println("1. 원 둘레 ");
			System.out.println("2. 원 넓이 ");
			System.out.println("9. 메인으로 ");
			System.out.println("메뉴 번호 : ");
			
			int menuNum = sc.nextInt();
			switch(menuNum) {
			case 1 :
				calcPerimeter();
				break;
				
			case 2 :
				calcRectArea();
				break;
				
			case 9 :
				System.out.println("메인으로 돌아갑니다.");
				return;
				
			default:
				System.out.println("잘 못 입력하셨습니다. 다시 입력해 주세요.")
			
			}
		}
	}
	
	public void calcPerimeter() {
		System.out.print("x좌표 : ");
		int x  = sc.nextInt();
		System.out.print("y좌표 : ");
		int y = sc.nextInt();
		System.out.print("높이 : " );
		int height = sc.nextInt();
		System.out.print("너비 : " );
		int width = sc.nextInt();
		
		System.out.println(cc.calcPerimeter (x, y, height, width));
	}
		
	public void calcRectArea() {
		
	
		
	
		System.out.print("x좌표 : ");
		int x  = sc.nextInt();
		System.out.print("y좌표 : ");
		int y = sc.nextInt();
		System.out.print("높이 : " );
		int height = sc.nextInt();
		System.out.print("너비 : " );
		int width = sc.nextInt();
		
		System.out.println(cc.calcArea (x, y, height, width));
	}
	
	
	
		
	

}
