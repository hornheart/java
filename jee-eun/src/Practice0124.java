import java.util.Scanner;

public class Practice0124 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		/*
		System.out.println("성별(M/F) : ");
		char gender = sc.next().charAt(0);
		
		
		boolean res = gender =='f'|| gender =='F';
		
		System.out.println("사용자가 여자입니까 : " + res);
		// TODO Auto-generated method stub
*/
		System.out.println("성별 (F/M) : ");
	
		char gender = sc.next().charAt(0);
		
		boolean res = gender == 'f' || gender == 'F';
		
		System.out.print("사용자가 여자입니까 :" + res);
		
	}

}


////사용자에게 성별은 입력받은 후 여자인지 확인 (* 소문자 f 대문자 F 모두 가능)
// 성별(M/F) :
// 사용자가 여자입니까 : (true/false)


//성별입력
//보이기

// 성별

//사용자가 여자 입니까?
