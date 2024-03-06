

import java.util.Scanner;

public class Test240119 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in); // 마지막에 삽입 sc.close(); 반드시 닫아주자!!!
		
		// 정수형 변수 age를 입력받아 7세 이하이면, 어린이, 19세이하이면 청소년 20세 이상이면 성인을 출력하세요.
		
		// 정수 num1, num2 두 개를 입력받아 두 수 사이에 3의 배수의 모든 합을 구하세요.
		
		// 정수 num1과 num2를 입력받아 두 수 사시에 있는 모든 홀수의 합과 짝수의 합을 각각 구하세요.
		
		/*
		int num1, num2, sum1=0, sum=0;
		System.out.print("정수 두개 입력 : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		for (int i = (num1 < num2 ? num1 : num2); i <= (num1 > num2 ? num2 : num1); i++) {
			if ( i % 2 == 1) {
				sum1 += i;
				
			} else {
				sum2 = i;
			}
		}
		System.out.println("홀수의 총합 : " + sum1);
		System.out.println("짝수의 총합 : " + sum1);
		*/ //쌤꺼!!
		
		// 첫째줄에 데이터의 개수 n개를 입력받고
		// 사용자로부터 n개의 정수를 입력받아 입력받은 반대로 출력하세요.
		// ex ) 정수 입력 : 5
		// 숫자 입력 : 1 7 5 9 4
		// 반대로 출력 : 4 9 5 7 1
		
		/*
		int size;
		System.out.print("개수 입력 : ");
		size = sc.nextInt();
		
		int [] arr =  new int[size];
		for (int i = 0; i < arr.length; i++) {
			System.out.print(i + "번째 정수 입력 : ");
			arr[i] = sc.nextInt();
		}
		*/
		//
		//
		//
		
		/*
		Scanner sc = new Scanner (System.in); // 마지막에 삽입 sc.close(); 반드시 닫아주자!!!
		*/
		
		
		/*
		//1번 문제
		int age;
		
		System.out.println("나이 (정수만) 입력 : ");
		age = sc.nextInt();
		
		
		if (age <= 7) {
			System.out.println("어린이");
		} else if (age <= 19) {
			System.out.println("청소년");
		} else {
			System.out.println("성인");
		}
		*/
		
		/*
		int num1, num2 ;
		System.out.println("첫번째 정수 입력 : ");
		num1 = sc.nextInt();
		System.out.println("두번째 정수 입력 : ");
		num2 = sc.nextInt();
		// ====> 2번 내가 한거
		*/
		
		/*
		int num1, num2 ; //min, max;를 먼저 구해도 됨
		System.out.println("정수 2개 입력 : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		//반복문 for(?)
		for () {
		*/ //참고용
		/*
		int num1, num2 ; //min, max;를 먼저 구해도 됨
		System.out.println("정수 2개 입력 : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		min = num1 < num2 ? num1 : num2;
		max = num1 < num2 ? num1 : num2;
		
		for (int i = min; i <= max; i++) {
			if (i %3 ==0) {
				sum += i;
				//3의 배수 누적
			}
		}
		System.out.printf("%d와 % 사이의 3의 배수의 총 합 : %d", min, max, sum );
		*/
		
		//
		//
		//
		
		// 마지막  문제
		// 사용자에게 행의 크기를 입력 받고 그 수 만큼의 반복을 통해 열의 크기도 받아
		// 문자형 가변 배열을 선언 및 할당하세요.
		// 그리고 각 인덱스에 'a'부터 총 인덱스의 개수만큼 하나씩 눌러 저장하고 출력하세요.
		
		int row, col;
		System.out.print("행의 크기 : ");
		row = sc.nextInt();
		
		char[][] arr = new char[row][];
		for (int i = 0; i < arr.length; i++) {
			System.out.println(i + "행의 열 크기 : " );
			col = sc.nextInt();
			
			arr[i] = new char[col];
		}
		
		char ch = 'a';
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = ch++;
				
			}
			
			
			
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println(arr[i][j] + " ");
			}
			

	}
		System.out.println();

}
}
