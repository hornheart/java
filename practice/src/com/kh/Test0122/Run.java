package com.kh.Test0122;

import java.util.Scanner;

impotrt. java.until.Scanner;

public class Run {

	public static void main(String[] args) {
		
		
			
		
		// 정수 n(2~9)을 입력받아 2부터 n까지 중 짝수의 구구단을 출력하는 함수를 작성하세요.
		// 만약 2~9사이의 값을 입력하지 않았다면 '다시 입력하세요.'를 반복합니다.
		//
		Scanner sc = new scanner (System.in);
		
		
		/*
		*
		do {
		
		// 정수 n 입력받기
		System,out.print("정수를 이력하세요. : ");
		
		/*
		size = sc.next();
		
		for (int i < 9; i=>2; i++ ) {
			ar[i] = (int)(Math.random() * i)
		}
		*/ // ===>my
		
		int n = sc.nextInt();
		//반복문을 통해 2부터 n보다 작거나 같을 때까지 반복하며 구구단 출력(내부에서 1~9까지 반복문 하나더)
		for (int i = 2; i <= n; i++) {
			//2*1 2*2 2*3...2*9
			if (i % 2 ! = 0 ) {
				continue;
				
			}
			for (int j = 1; j < 10; j++) {
				System.out.printf("%d * %d = %d\n", i, j, i*j);
			}
			System.out.println();
		}
		break;
		
		} while (true)	;
		*/
		
		
		
		
		///아래는 내가 짜집기
		/*
		ic static void main(String[] args) {
			// 1이상 변수 num을 입력받고
			// 1부터 num의 숫자를 
			
			
			/*
			Scanner sc = new scanner ( System.in);
			
				
			
			System.out.print("1이상의 숫자를 입력하세요 : ");
			size = sc.next();
			
			for (int i = 0; i =< 4 ; i++) {
				arr[i] = (int)(Math.random() * i +1);
			}
			*/ //====my
			
			
			/*
			Scanner sc = new scanner ( System.in);
			int num;
			
			System.out.print("1이상의 숫자를 입력하세요 : ");
			num = sc.nextInt();
			
			if (num > 0 ) {
				for (int i = 1; i <=num; i++) {
					System.out.print(i + " ");
				}
				
			} else {
				System.out.println("1 이상의 숫자를 입력하세요");
			}
			
			*/
			
			//1미만의 숫자를 입력받았을 때
			//1이상의 숫자를 입력
			//정상적으로 입력할 때까지
		
		
		// 정수 n을 입력받기
		// 반복문을 통해 2부터 n보다 작거나 같을 때까지 반복하며 구구단 출력(내부에서 1~9까지 반복문 하나더)
		// 전체를 2~9사이의 값인지를 확인하는 반복문으로 감싸주기
		
		
		
		
		
		// 정수 num을 입력받아 크기가 num인 정수형 배열을 만들고 1~100 사이의 랜덤값으로 모든 배열의 값을 대입합니다.
		// 이후 모든 배열의 홀수이덱스의 값을 더한 값을 구하세요.
		
		/*
		//정수 num입력받아 배열 만들기
		int num = sc.nextInt (" 정수 입력 : ");
		//0~(num - 1 또는 배열의 길이 - 1) 까지 반복하며 Math.random() * 100 + 1 값 대입해주기
		int [] arr = new int[num];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 100 +1);
			System.out.print(arr[i] + " ");
			
		
		// 정수 num 입력 받아 크기가 num인 정수형 배열을 만들고 1~100사이의 랜덤값으로 모든 배열의 값을 대입합니다.
		*/ //다 못씀
		
		
		
		
		
		
		
		
		
		/*
		
		// 크기가 [8][9]인 2차원 배열 arr3을 작성하고 구구단 2~9단을 각 인덱스에 대입하고 출력해라
				// ex) arr3[0][0] = "2 * 1 = 2";
				/*
				String[][] arr3 = new String[8][9]
						
						
				for (int j = 0; j < arr3.length; j++) { // 0 1 2 3 4 5 6 7
					for (int i = 0; i < arr3[j].length; i++) { // 0 1 2 3 4 5 6 7 8
						int dan = j + 2;
						int su = i + 1;
						
						arr3[j][i] = dan + " * " + su + " = " + (dan * su);
					}
				}
					//구구단의 한 단을 배열에저장하는 반복문
				for (int i = 0; i < arr3.length; i++) {
					System.out.println("===" + (i +2) + "단====");
				}
					for (int j = 0; j < arr3[i]).length; j++) {
						
						System.out.println(arr3[i][j]);
					}
				}
				
					*/ //짜집기
		
		
		// 다음과 같은 코드를 실행했을 때 예시와 같은 결과가 출력되도록 TV클래스를 작성하세요.
		// TV myTV = new TV("삼성", 2020, 65);\
		// myTV.show();
		
		
		
		TV myTV = new TV("삼성", 2020, 65, 100000);
		myTV.show();
		TV myTV2 = new TV("LG", 2024, 85, 200000);
		myTV2.show();
		
		// => 삼성에서 만든 2020년형 65인치 TV

		
		// one이라는 Human객체를 생성하고
		// 해당객체로 myTV와 myTV2구매가 가능한지 확인
		Human one = new Human("최지원", 150000 );
		one.buy(myTV);
		one.buy(myTV2);
		
		
		
	}

}
