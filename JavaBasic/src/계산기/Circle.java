package 계산기;

public class Circle implements Figure{
	
	//자영풀이
	
	//자:필드생성
	private double radius;
	
	//자:생성자 메소드 생성
	public Circle(double radius) {
		this.radius = radius;
		
	}
	
	//자:계산메소드 생성
	public double calArea() {
		return radius * radius * 3.14;
	}

}
