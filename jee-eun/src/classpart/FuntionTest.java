package classpart;

public class FuntionTest {

	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 20;
		
		int sum = add(num1, num2);
		System.out.println(num1 + " + " + num2 + " = " + sum + "입니다.");
		// TODO Auto-generated method stub

	}
	
	public static int add (int n1, int n2) { //add() 함수
		int result = n1 + n2;
		return result;//결과값 반환
	}
	


}
