package 계산기;

public class Triangle implements Figure{//자:인터페이스 구현
	
//	double width; //밑변
//	double height; //높이
	
	private double width; //밑변
	private double height; //높이
	
	
	//자:생성자(자동완성)
	public Triangle(double width, double height) { //생성자
		super();
		this.width = width;
		this.height = height;
	}

	//자:계산기 메소드
	public double calArea() {
		return width * height / 2;
	}
}
