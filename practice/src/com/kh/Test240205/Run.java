package com.kh.Test240205;

public class Run {
	
	public static void main(String[] args ) {

	Human [] arr= new Human[5];
	
	aGroup[0] = new Human("지은",20);
	aGroup[1] = new Human("은지",20);
	aGroup[2] = new Human("은미",20);
	aGroup[3] = new Human("하은",20);
	aGroup[4] = new Human("혜은",20);
	
	
	//private void syso() 
		// TODO Auto-generated method stub
//(김철수 ,70) 를 추가하고 싶은때
	//aGroup = new Human[6];
	
	//Human[] tmp = new Human [6]
	Human[] tmp = new Human [aGroup.length + 1];

	
	  for (int i = 0;  i < aGroup.length; i++ ){
		  tmp[i] = aGroup[i];
	  }
	  tmp[5] = new Human("김철수",70);
	  
	  aGroup = tmp;
	  
	 
	
	fot(Human h : aGroup) {
		System.out.println(h);
	}
	
	for (int i=2; i<5; i++) {
		aGroup[i] = aGroup[i+1];
	}
	aGroup[5] =null;
	
	}
	
}
