package 계산기;

public class Rectangle implements Figure{
	
	//실습
	//자영 풀이
	
//	double width;
//	double height;
	
	private double width;
	private double height;
	
	public Rectangle(double width, double height) {
	
		this.width = width;
		this.height = height;
	}
	
	public double calArea() {
		return width * height;
	}
}
