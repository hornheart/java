
import java.util.ArrayList;
import java.util.List;

public class ArrayListRun {
	
	/*
	 * 컬렉션이란
	 * 자료구조 개념이 내장되어 있는 클래스로 자바에서 제공하는 "자료구조"를 담당하는 "프레임워크"이다.
	 * 
	 * - 자료구조 : 방대한 데이터를 보다 효율적으로 관리 ( 추가, 삭제, 조회, 정렬 등을 도와주는 개념)
	 * - 프레임워크 : 이미 만들어진 뼈대 (틀이나 구조)
	 * 
	 * * 배열의 단점과 컬렉션의 장점
	 * 배열의 단점 
	 *	 	1. 배열은 크기를 지정해야 한다!!! 한번 크기를 지정하면 변경할 수 없다.
	 * 		새로운 값을 추가하려면 새로운 크기의 배열을 만들고 기존의 값을 복사하는 코드를 작성해야한다.
	 *		2. 배열 중간 위치의 값을 추가하거나 삭제하는 경우 값을 매번 땡겨주는 복잡한 코드를 작성해야한다.
	 *		3. 한 공간에 한 타입의 데이터 만 저장이 가능하다.
	 *
	 *
	 *	>	컬렉션의 장점
	 *	1. 크기 지정할 필요없음 => 지정했다면 더 많은 데이커들이 들어와도 알아서 사이즈 늘림, 크키제약이 없다. 
	 *	2. 중간의 값을 추가하거나 삭제하는 경우 값을 땡겨주는 작업(알고리즘)을 직접 기술할 필요 없음!
	 *	   단지 메소드 호출 만으로 알아서 내부적으로 진행된다.
	 *	3. 한 공간에 여러 타입의 데이터를 저장할 수 있다 (단, 객체 만 가능 = Object)
	 *		한 타입 만 담도록 제한 할 수 있음 (generic)
	 *
	 * * 방대한 데이터들을 단지 보관 만 해두고 조회 만 할 경우 배열을 많이 사용한다.
	 *	 방대한 데이터들을 보관, 추가, 삭제 등의 과정이 빈번한 경우 컬렉션을 多用
	 */

	
	public static void main (String[] args) {
		
		ArrayList list = new ArrayList(); //크기를 정할 수 있음

		System.out.println(list); // 비워져 있는 상태
		
		//E ===> Element : 리스트에 담긴 데이터 (요소)
		
		// 1. add (E e) : 리스트 공간 끝에 전달 된 데이터를 추가시켜주는 메소드
		list.add(new Music("cake", "Itsy"));
		list.add(new Music("365", "알리"));
		list.add(new Music("눈 떠보니","미상"));
		list.add("끝");
		System.out.println(list);
		
		// 지정된 크기보다 더 많이 넣어도 오류가 발생하지 않는다. => 장점1. 크기 제약 없음
		// 다양한 타입의 데이터를 담을 수 있음 => 장점3. 여러타입 보관 가능
		// 
		
		System.out.println(list); // list의 특징 : 순서유지한면서 담김(0번 인덱스 부터 차곡차곡)
		
		//2. add(int index, E e ) : 직접 인덱스를 지정해서 해당 인덱스 위치에 데이터를 추가시켜주는 메소드
		
		list.add(1,new Music("진심이 담긴 노래", "케이시"));
		
		System.out.println(list);
		
		//3. remove(int index) : 해당 인덱스 위치의 데이터를 삭제켜주는 메소드
		list.remove(1);
		System.out.println(list);
		
		//4. set(int index
		list.set(0, new Music("모래 알갱이", "임영웅"));
		System.out.println(list);
		
		//5. size() : 리스트의 사이즈 반환해주는 메소드
		//(즉, 몇개의 데이터가 담겨 있는지)
		System.out.println("리스트의 사이즈 : " + list.size());
		
		//6. get(int index) : 해당 인덱스 위치의 객체를 반환시켜주는 메소드
		Music m = (Music)list.get(0);
		
		String s = (String)(list.get(3));
		
		System.out.println(m);
		System.out.println(s);
		System.out.println(list.get(1));
		System.out.println( ((Music)(list.get(1))).getTitlel() );
		
		//7. subList(int index1, int index2) : List =>추출해서 새로운  List로 반환
		List sub = list.subList(0, 2); //0부터 2인덱스 전 까지
		System.out.println(sub);
		
		//8.addAll(collection c) : 컬렉션을 통채로 뒤에 추가시켜주는 메소드
		list.addAll(list);
		System.out.println(list);
		
		//9. isEmpty() : boolea => 컬렉션이 비워져 있는지 묻는 메소드
		System.out.println(list.isEmpty());
		
		//10. clear() : 전부 비워주는 메소드
		list.clear();
		System.out.println(list.isEmpty());
		
		System.out.println("=========================================");
		//반복문을 이용해서 출력
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
			
			
		}
		System.out.println("=============");
		for(Object e : list ) {
			System.out.println(e);
		}
	}
	
}
