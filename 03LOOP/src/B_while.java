import java.util.Scanner;

public class B_while {
	
	/*
	 * while문
	 * 
	 * [초기식;]
	 * while(조건식){
	 *       반복적으로 실행할 코드;
	 *       [증감식;]
	 * }
	 * 
	 * 조건식의 결과가 true일 경우 해당 코드를 실행한다.     
	 *       
	 * 조건식 검사 --> true일 경우 실행코드 실행
	 * 조건식 검사 --> true일 경우 실행코드 실행
	 * 조건식 검사 --> false일 경우 실행코드 실행x => 반복문 탈출
	 * 
	 *       
	 *       
	 *       
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		
		//System.out.println("안녕하세요.");    ====>5번 출력
		/*
		for (int i = 0; i < 5; i++) {
			System.out.println("안녕하세요.");
		}
		*/
		
		
		/*
		int i = 0;
		while (i < 5) {
			System.out.println("안녕하세요.");
			i++;
		}
		*/
		
		// 1에서 부터 10사이의 홀수만을 출력
		// 1 3 5 7 9
		
		
		/*
		int i = 0;
		while (i < 10; i < str.length(); i++) {
			if (i %2 == 1) {
				Sys
			}
		}
		*/ //==============>my
		
		
		
		/*
		int i = 1;
		while(i < 10000) {
			if (i %2 == 1) { // 홀수 
				System.out.print(i + " ");
			}
			
			i++;
		}
		*/ //====이거나
		
		
		
		/*
		int i = 1;
		while(i < 10000) {
			if (i %2 == 1) {
				System.out.print(i + " ");
			}
			
			i++;
		}
		
		System.out.println("");
		
		
		while(i <= 10000) {
			System.out.println(i + " ");
			i += 2;
		}
		*/
		
		// 1부터 랜덤값 (1~100사이) 까지의 합계를 출력
		// 1에서부터 xx까지의 총 합계 : xxxx
		
		/*
		int (n < 100, sum = 0;)
		System.out.print(" random 값 입력 : ");
		n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			sum += i;
		}
		
		System.out.print(sum + "");
		*/ //====>내가
		

		/*
		int random = (int)(Marh.random() * 100 +1);
		int sum = 0;
		
		/*
		for (int i = 1; i <= random; i++) {
			sum += i;
		}
		System.out.print(sum);
		*/
		
		/*
		int i = i;
		while (i <= random ) {
			sum += i;
			i++;
			
		}
		
		System.out.print("1에서부터" + random + "까지의 총 합계 : "+ sum);
		*/
		
		
		
		
		// 사용자에게 문자열을 입력받아 
		// 해당 문자열의 짝수자리 글자만 출력
		// 문자열 입력 : hello
		// el
		
		
		/*
		String str = "hello" 
				int n, sum = 0;
		n = (int) (Math.random() * 10 + 1);
				
				for (int i = 0; i <= n ; i++) {
					System.out.println(str.charAt(i));
				}
		*/	
		
		String str;
		
		System.out.println("문자열 입력 : ");
		str = sc.next();
		
		
		int i = 0;
		while(i < str.length()) {
			if (i%2 == 1) {
			System.out.println(str.charAt(i));
			}
			i++;
		}

	}

}
