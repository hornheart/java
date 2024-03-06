package com.kh.EX01;

public class Student {// 학생을 추상화해서 만든 클래스이다.
	//필드영역
	//접근제한자 자료형 변수명;
	// 옵션 자료형 변수명;
	/*
	 * 필드를 public 접근제한자로 작성
	 * => 필드에 직접적으로 접근해서 값을 대입하거나 값을 가져올
	 * =>
	 */
	
	
	
	
	String name;  //public String name;
	int age;      // public int age;
	double height; // public double height;
	
	//생성자영역
	//매개변수가 있는 생성자 작성시 기본생성자 생성 안해준다.
	
	public Student() {
	//옵션 클래식명(초기와하고자하는 값을 담은 매개변수들)  {초기화}
	public Student(String name, int, age, double height) {
		this.name = name;
		this.age = age;
		this.height = height;
	}
	
	//getter, setter
	//getter : 해당필드에 값을 가지고 오기 위한 메소드
	//setter : 해당필드에 값을 대입 시키기 위항 메소드
	
	public Student(String name, int age) {     //public int getAge() {
		this(name, age, 0);                    //return this.age;      
		this.name = name;                      //}
		this.age = age;
		this.height = height;
		this.age 
	}
	
	
	// 메소드 영역
	/* 
	 * <표현법>
	 * 옵션 메소드명 (매개변수) {
	 *      가능코드 
	 * }
	 * 
	 * 매개변수 : 해당 메소드 호출시 전달값(인지)를 받아주기 위한 변수 선언문 (해당 메소드 내에서 만 사용)
	 * 
	 * 
	 * 
	 */
	
	public void print(String gender) {
		System.out.print("안녕하세요. " + this.age + "살 " + this.name + "이고 성별은" + gender + "입니다. ");
	}
	
	
	//메소드 오버로딩
	// 동일한 이름의 메소드가 있을 때 매개변수의 개수 또는 자료형에 따라 메소드를 구분할 수 있다.

	public static void main(String[] args) {
		// 
		/*
		 * 
		 * 
		 *  
		 *  ** class구조
		 *  
		 *  옵션 class 이름 {
		 *      // 필드 영역
		 *            {사용할 데이터들을 선언}
		 *          
		 *     // 생성자영역 
		 *            {데이터를 초기화해주는 특수목적의 메소드인 생성자를 정의하는 영역}
		 *            
		 *     // 메소드영역
		 *            {클래스의 기능을 정의하는 영역}
		 *            
		 *  }                       
		 *  
		 *  *접근제한자 : 해당구조에 접급할 수 있는 범위를 제한한다.
		 *  public > protected > default > private
		 *  
		 *  클래스에 사용 가능한 접근제한자 2가지
		 *  default, public
		 *  
		 *  필드에서 또는 메소드에서 사용할 수 있는 접근제한자 4가지
		 *  public : 어디서든 (같은 패키지, 다른 패키지 모두 ) 접근 가능
		 *  protected : 같은 패키지에서 또는 다른 패키지일 경우 상속구조(부모자식 같은..)에서 만 접근
		 *  default : 같은 패키지에서 만 접근 가능
		 *  private : only 해당 클래스에서 만 접근 가능
		 *  
		 *  
		 */
		
		
		
		
		
		
		
		

	}

}
