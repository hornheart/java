package com.kh.test240124;

public class Rectangle extends Point {

	
		private int width;
		private int heigth;
		
		
		
		public Rectangle() {
			super();
		}	
		
		
		public Rectangle (int x, int y, int width, int height) {
			super(x,y);
			this.width = width;
			this.height = height;
		}
		
		
		

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
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString(); + ","+height + "," +width
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}

}
