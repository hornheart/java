import java.util.Scanner;

public class A_Array03 {

	public static void main(String[] args) {
		
		/*
		// 1. 크기가 10인 정수형 배열 생성 후
		int[] arr == new int[10];
		
		
		
		
		// 2. 반복문을 활용해서 0번 인덱스부터 마지막 인덱스까지 순차적으로 접근하면서 값을 대입
		//    매번 1 ~ 100 사이의 랜덤값
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 100 + 1);
		}
		
		// 3. 반복문을 활용해서 해당 배열의 0번 인덱스 ~ 마지막 인덱스까지 담겨있는 값을 전부 출력
		// arr[X] : xx
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "] : " + arr[i]);
		}
		
		
		
		
		/*  //1번 my
		int [] iArr = new int [10];
		
		for (int i = 0; i < 11; i++) {
			System.out.print(iArr[i] + " ");
		}
		*/  //======my
		
		// 1. 사용자에게 배열의 길이를 입력받은 후
		// 해당 크기의 문자열 배열을 생성
		/*
		 * int[] cha == 
		 */ // my
		/*
		int size;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("배열의 길이: ");
		size = sc.nextInt();
		sc. nextLine();
		
		String[] strArr = new String[size];
		
		
		
		
		// 2. 반복문을 활용해서 매번 사용자에게 과일명을 입력받아 그 값을 매 인덱스자리에 대입 ( 0 ~ 마지막인덱스 )
		for (int i = 0; i < strArr.length; i++ ) {
			System.out.print("좋아하는 과일을 입력하세요. : ");
			strArr[i ] = sc.next();
		}
		
		
		// 3. 반복문을 이용해서 0 ~ 마지막인덱스까지 담긴 값을 출력
		for(int i = 0; i < strArr.length; i++) {
			System.out.println(strAtt[i]);
		}
		*/
		
		// 사용자에게 문자열 하나 입력받은 후
		// 각각의 인덱스에 있는 문자들을 char배열에 옮겨담기
		
		// 1. 사용자에게 문자열 한 개 입력받기
		
		// 2. char 배열 생성해두기 ( 배열의 길이 == 문자열의 길이 )
		
		// 3. 반복문을 통해서 해당 문자열에서 각각 인덱스별 문자를 char배열에 각 인덱스에 대입
		
		// 4. 반복문을 이용해서 해당 배열의 0 ~ 마지막인덱스까지 담긴 값을 출력
		
		
		
		
		// 1. //
		/*
		int [] achar
		*/ //=== my
		
		/*
		int size;
		Scanner sc = new Scanner (System.in)
		*/ //===my
		/*
		Scanner sc = new Scanner (System.in);
		
		System.out.print("문자열 입력 : ");
		String str = sc.next(); // ex :hello
		
		//2. //
		char[] chArr = new char[str.length()];
				
		//3.//
		for (int i=0; i < chArr.length; i++) {
			chArr[i] = str.charAt(i);
			
		}
		 
		// 4. //
		for (int i=0; i < chArr.length; i++) {
			System.out.println(chArr[i]);
		}
		*/
		
		
		// 1. 사용자에게 배열의 길이를 입력받은 후 해당 크기만큼의 정수배열 생성
		 
		// 2. 반복문 활용해서 0 ~ 마지막 인덱스까지 매번 1 ~ 100 사이의 랜덤값 발생시켜 대입
		
		// 3. 반복문을 활용해서 배열에 담긴 모든 값을 출력함과 동시에 
		      짝수인 값들의 총 합을 구해라
		      
		// 4 . 위에서 구한 짝수 값의 총합을 출력
		      
		      
		// 1. //
		/*
		      int[] arr;
		      arr = new int [random]
		      
		  */ //====my
		 
		  /*    
		  Scanner sc = new Scanner (System.in);
		  System.out.print("정수 배열의 길이 : ");
		  size = sc.nextInt();
		  
		  // 2. //
		  for (int i=0; i < arr.length; i++) {
			  arr[i] = (int)(Math.random() * 100 + 1 );
					  
		  }
		  
		  // 3. //
		  for (int i = 0; i < arr.length; i++) {
			  System.out.println(arr[i]);
			  
			  if (arr[i] % 2 == 0) {
				  sum +=arr[i];
			  }
		  }
		  
		  // 4. //
		  System.out.println("짝수의 총 합 : " + sum);
		  */
		      
		  
		      
		      
		      
		      
		      
		      
		
		
		
		
		
		
		
		
	

	}

}
