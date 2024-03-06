
import java.util.Scanner;

public class Practice240118 {

	public static void main(String[] args) {
		// 
		Scanner sc = new Scanner(System.in);
		
		
		// 결과가 참일 경우 if-else 빠져나감
		// 거짓일 경울 코드2 수행
		
		
		/*
		// 정수 입력하시오 (="정수:") ==> 화면에 출력
		// int 숫자 
		// sc
		
		// if 사용 (양수)
		      // 화면에 출력
		// else
		     // if 사용 (음수)
		        // 화면에 출력
		     // else
		        // 화면에 출력 (0)
		*/
		
		System.out.print(" 정수를 입력하시요 : ");
		
		int num = sc. nextInt();
		sc. nextLine();
		
		if (0 > num) {
			System.out.println("음수이다.");
		} else {
			if ( 0 < num) {
				System.out.println("양수이다.");
			} else {
				System.out.println("0이다");
			}
			
		
		}
		
		/*		
		System.out.print("정수 : ");
		int num = sc. nextInt();
		sc. nextLine();
		
		if (num > 0) {
			System.out.println("양수이다.");
		} else { 
			if ( num < 0) {
				System.out.println("음수이다.");
			} else {
				System.out.println("0이다.");
			}
		}
		*/
	}

}
