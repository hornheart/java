
import java.util.Scanner;

public class Practice0123 {

	public static void main(String[] args) {
		// 
		
		
		/*
		 * a = 5
		 * b = 10
		 * c = (++a) + b
		 * d = c / a
		 * e = c % a
		 * f = e++
		 * g = (--b) + (d--)
		 * h = 2
		 * i = (a++) + b / (--c / f ) * ( 11 - 1 ) % ( 6 + 2 )
		 * 
		 */
		
		/*
		 int a = 5;
		 int b = 10;
		 int c = (++a) + b;
				// 6+10=16
		 int d = c / a; // 16 / 5 = 3.
		 int e = c % a; // 16 / 5 = 3......1 
		 int f = e++; //1 e=2
		 int g = (--b) + (d--); // 9+3=12   d=2
		 int h = 2;
		 int i = (a++) + b / (--c / f) * (11 -1) % (6+2);
				 //(6+10) / (15/1)*10%8
				 //16/7*10%8
				 
				 System.out.println("a : " + a );
		 System.out.println("b : " + b );
		 System.out.println("c : " + c );
		 System.out.println("d : " + d );
		 System.out.println("e : " + e );
		 System.out.println("f : " + f );
		 System.out.println("g : " + g );
		 System.out.println("h : " + h );
		 System.out.println("i : " + i );
		 */
		
		Scanner sc = new Scanner(System.in);
		
		String fruit;
		
		System.out.print("구매하고 하는 과일 (사과(1000), 바나나(2000), 딸기(3000)) 입력 :  ");
		fruit = sc.next();
		
		switch(fruit) {
		case "사과" :
			System.out.println("사과의 가격은 1000원 입니다.");
			break;
		case "바나나" :
			System.out.println("바나나의 가격은 2000원 입니다.");
			break;
		case "딸기" :
			
			System.out.println("딸기의 가격은 3000원 입니다.");	
			break;
		default 
		case "바나나" :
		
			System.out.println("잘 못 입력하였습니다.")
			
			
		}
				

	}

}
