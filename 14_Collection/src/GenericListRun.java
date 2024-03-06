import java.util.ArrayList;

public class GenericListRun {

	public static void main(String[] args) {
		
		
		ArrayList<Music> list = new ArrayList<>();
		
		list.add(new Music("cake", "Itsy"));
		list.add(new Music("365", "알리"));
		list.add("끝");
		
		System.out.println(list);
		
		for (Music tmp : list) {
		// TODO Auto-generated method stub
			System.out.println(tmp);
	}
		
		
		/*
		 * 
		 *  *제네릭 < >을 사용하는 이유
		 *  1. 명시된 타입의 객체 만을 저장하도록 제한을 둘 수 있음
		 *  2. 컬렉션에 저장 된 객체를 열어서 사용할 때 매번 형변환하는 절차를 없애기 위해
		 */

}
