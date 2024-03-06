
public class Practice240122 {

	public static void main(String[] args) {
		// 
		
		
		
		//Operator01
		/*
		 * true의 부정 + !true
		 * false의 부정 + !false
		 * 
		 * 
		 * b1 = true
		 * b1의 부정 + !b1
		 * 
		 * b3 = !
		 * b3 + b3 
		 */
		
		
		System.out.println("true의 부정 : " + !true);
		System.out.println("false의 부정 : " + !false);
		
		boolean b1 = true;
		System.out.println("b1의 부정 : " + !b1);
		
		boolean b2 = !b1;
		System.out.println("b2 : " + !b1);
		
		boolean b3 = ! (3<5);
		System.out.println("b3 : " + b3);
		
		boolean b4 = !! (4<5);
		System.out.println("b4 : " + b1);
		
		

	}

}
