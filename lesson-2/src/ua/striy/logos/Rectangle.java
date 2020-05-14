package ua.striy.logos;

public class Rectangle {

	private int length;
	private int width;
	
	Rectangle(){
		this.length = 40;
		this.width = 20;
	}
	
	Rectangle(int length, int width){
		this.length = length;
		this.width = width;
	}
	
	
	public void rectangle () {
		System.out.println("Площа прямокутника = " + width*length);
	}
	public void perimeter() {
		System.out.println("Периметр прямокутника = " + 2* (width+length));
	}

	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", width=" + width + "]";
	}
	
}
