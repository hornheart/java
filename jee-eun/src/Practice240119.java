import java.util.Scanner;	

public class Practice240119 {


	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 
		
		int age; //';'  반드시 기입 필요
		String type = " "; // 글자 'String' 잊지 말기 
		
		System.out.print(" 나이를 입력 하세요. : ");
		age = sc.nextInt();
		sc.nextLine();
		
		if (age <= 13) {
			type = "어린이";
		}
		
		if (13 < age && age <= 19) {
			type = "청소년";
		}
		
		if (19 < age ) {
			type = "성인";
		}
		
		System.out.println(age + " 세는 " + type + " 에 속합니다.");

	}

}

// 나이 (정수)
// 글자 타입



// 정수 입력
// 정수 (sc
// 수 화면 표기

// 13세 이하라면
// "어린이" 타입

// 13세 초과이고 19세 이하라면
// 청소년

// 19세 초과라면
// 성인

// ~세는 (타입)~에 속합니다.

