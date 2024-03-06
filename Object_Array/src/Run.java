
public class Run {

	/*
	 * 
	 * 객체배열
	 * - 객체를 저장하는 배열로 일반적인 배열과 다르게
	 * 배열의 각 요소가 참조변수로 이루어져 있다. ->사용을 위해서는 각 요소마다 객체 생성이 필요하다.
	 * 
	 * [표현법]
	 * 클래스 명[] 배열명 = new 클래스 명[크기]; -> 크기가 n개인 참조변수 배열 생성
	 * 배열명[index] = new클래스 명(); -> 각 인덱스 객체생성
	 */
	
	
	public static void main(String[] args) {
		/*
		Human [] HumanArr = new Human[3]; // -> [0,0,0]
		human[0] = new Human("최지원", 21,'i');
		humanArr[1] = new Human("김수민", 44,'j');
		humanArr[2] = new Human("강호동", 12, 'k');
		
		for (int i = 0; i < arr.length; i++) {
			humanArr[i].print();
			System.out.println();
		}
		
		Human[] humanArr2 = {new Human("최지원", 21,'i'),
				               new Human("김수민", 44,'j'),
				               new Human("강호동", 12, 'k')};
		*/
		
		
		
		// ===========================================================================
		
		/*
		 * 
		 * 우리는 도서관에서 책을 관리하는 프로그램을 만든다고 가정한다.
		 * 해당 클래스는 도서관에 책을 등록할 때 사용하는 book객체를 생성할 Book클래스이다.
		 * 필요하다고 생각하는 데이터와 기능을 구현해보자
		 * 
		 * Book book1 = new Book (초기화 변수);
		 * 
		 */
		
		
		/*
		Lib = new lib ("")
		lib.show();
		
		*/ //====my
		
		// 사용자로부터 제목, 장르, 저자, 책번호를 입력받아
		// book객체를 생성하고 생성죈 객체의 toString메소드를 호출하여 정보를 확인해 주세요.
		//
		
		Book[] BoodArr = new Book[100];
		String title, genre, author; //제목
		int number, count = 0;
		boolean tobeContinue = true;
		
		
		while(tobeContinue) {
			System.out.println("==========도서관리프로그램=========");
			System.out.println("1. 도서등록");
			System.out.println("2. 도서목록출력");
			System.out.println("9. 종료");
			System.out.println("메뉴 선택 : ");
			menu = sc.nextInt();
	
	switch (menu)		
	case 1:		
		int number;	
		String title, genre, author; //제목	
		System.out.print("도서 제목 : ");
		title = sc.next();
		
		
		System.out.print("장르 : ");
		genre = sc.next();
		
		System.out.print("저자 : ");
		author = sc.next();
		
		System.out.print("책 번호 : ");
		number = sc.nextInt();
		
		bookArr[count] = new Book(title, genre, author, number);
		System.out.println("도서등록 완료 : " + bookArr[count++].toString());
	} break;
		
		
		
		//문자열.toLowewCase() => 모든 문자를 소문자로 변경
		System.out.print("계속 등록하시겠습니까?(y/n):");
		tobeContinue = sc.next(). toLowerCase().charAt(0) =='y' ? true : false;
		}
		
		
		
	}
		//배열에 bookArr에 등록된 모든 도서 정보 출력
		//===================등록된 도서정보==============
		//Book [title=홍깅동전, genre=소설, author = 박지원, number = 1]
	
	System.out.println('=======등록된 도서정보===========');
	for (int i = 0; i < bookArr.length && bookArr[i] !=null; i++) {
		if(bookArr[i] == null)
			break;
		
		
		
		System.out.println(bookArr[i]. toString());
	}
	
}
