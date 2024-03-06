import 

public class Operator04 {
	
	
	/*
	 * 비교연산자/관계연산자 (이상연산자)
	 * 두 값을 비교하는 연산자
	 * 비교연산자는 조건을 만족하면 true(참), 만족하지 않으면 false(거짓)를 반환
	 * 즉, 비교연산의 결과는 논리값!!
	 * 
	 * 대소비교연산자 : <> <= >=
	 * 동등비교 연산자 : == !=
	 * 
	 * 원시타입의 일반변수 => 동등비교 ==로
	 * 
	 * String(문자열)은 단순하게 ==로 동등비료할 수 없다.
	 * 이유는 객체이기 때문에
	 * 
	 * String 비교할 때
	 * 문자열.equals(문자열);
	 * 
	 */

	public static void main(String[] args) {
		int a = 10;
		int b = 25;
		
		System.out.println("a == b : " + (a == b));
		System.out.println("a <= b : " + (a <= b));
		
		boolean result = (a > b);
		System.out.println("result : " + result);
		
		// 산술연산 + 비교연산
		System.out.println((a * 2) > (b / 5));
		
		System.out.println("a가 짝수인가: "+ ( a % 2 == 0));
		System.out.println("a가 홀수인가: "+ ( a % 2 != 0));
		System.out.println("a가 홀수인가: "+ !( a % 2 == 0));
		
		// 두수를 입력받아 어떤 숫자가 더 큰지를 출력하는 프로그램
		
		// 첫번째 정수 : ()
		// 두번째 정수 : ()
		
		// 첫번째가 두번째 보다 큽니다. : (true/false)
		// 첫번째 정수는 짝수 입니다. : (true/false)
		
		
		//Scanner sc = new Scanner (System.in);
		
	//	System.out.print("첫번째 정수 : ")
	//	int num1 = sc. nextInt();
	//	sc.nextLine();
		
	//	System.out.print("두번째 정수 : ")
	//	int num2 = sc. nextInt();
	//	sc.nextLine();
		
	//	System.out.println("첫번째가 두번째보다 큽니다 : " + (num1 > num2));
	//	System.out.println("첫번째 정수는 짝수입니다 : " +(num1 % 2 ==0));
		
		
		//특이케이스(문자와 숫자간의 대소비교 가능!!)
	//	System.out.println('A' > 60);
	//	System.out.println('A' > 70);
		// 'A' ~ 'Z' 65 ~ 90까지의 숫자로 연달아 나열되어있다.
		
		
		String str1 = new String ("a");
		String str2 = new String ("a");
		
		System.out.println(str1 == str2);
		System.out.println("as" == "as");		
				
		
	
		
		
		
		
		// TODO Auto-generated method stub

	}

}
