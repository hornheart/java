package com.kh.test240124;

public class Circle extends Point {
	private int radius;
		
		
		
		
		

	public Circle(int x, int y, int radius) {
			super(x, y);
			this.radius = radius;
		}




	

	@Override
	public int getX() {
		// TODO Auto-generated method stub
		return super.getX();
	}

	@Override
	public void setX(int x) {
		// TODO Auto-generated method stub
		super.setX(x);
	}

	@Override
	public int getY() {
		// TODO Auto-generated method stub
		return super.getY();
	}

	@Override
	public void setY(int y) {
		// TODO Auto-generated method stub
		super.setY(y);
	}

	@Override
	public String toString() {
		return "Circle [getClass()=" + getClass() + ", getX()=" + getX() + ", getY()=" + getY() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

}
