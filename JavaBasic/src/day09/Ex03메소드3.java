package day09;

public class Ex03메소드3 {

	public static void main(String[] args) {

		getName(); //자영 : 호출값 가지고만 있고 출력은x 콘솔창에 안 나타남
		System.out.println(getName()); //출력됨 : 김자영
		
		
	}
	
	// 매개변수 x, 리턴값 o
	public static String getName() { //자영 : 입력값(매개변수) 無 -> () 안 비어있음
		return "김자영";
	}
	
	

}
