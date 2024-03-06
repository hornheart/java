package exercise;

import java.util.Scanner;

public class Exercise0214 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		/*		
		System.out.println("양의 정수 입력 : ");
		
		
		int n = sc.nextInt();
		
		if ( n % 2 == 0 ) {
			
			System.out.println("짝수 : " + n );
			
		} else {
			
			System.out.println("홀수 : " + n );
			
		}
		*/
		/*
		int [ ] arr = new int [ 5 ];
		for ( int i = 0; i < arr.length; i++ ) {
			
			arr [ i ] = ( int ) (Math.random()* 5 + 0);
					
		//} if (arr[i] % 2 == 0 ) {
			
			System.out.println(arr[ i ] + "");
			}*/
		
		int [] arr = new int [10];
		for ( int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random()*100+0);
			if(arr[i] % 2 == 0) {
				System.out.println(arr[i] + "");
			}
		}
	}

}
