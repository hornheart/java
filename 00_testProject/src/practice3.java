import java.util.Scanner;
public class practice3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		/*
		 * 키보드로 가로, 세로 값을 실수형으로 입력받아 사각형의 면적과 둘레를 계산하여 출력하세요.
		 * 공식) 면적 : 가로 * 세로
		 *      둘레 : (가로 + 세로)*2
		 *      
		 */
		
		Scanner s = new Scanner(System.in);
		float width, height;
		
		System.out.println("가로 길이 : ");
		width = s.nextFloat();
		s.nextLine();
		
		System.out.println("세로 길이 : ");
		height = s.nextFloat();
		s.nextLine();
		
		System.out.println("면적 : " +(width*height));
		System.out.println("둘레 : " + ((width + height)*2));
		
		
		
		
	}

}
