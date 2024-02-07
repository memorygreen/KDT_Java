package day02;

public class Ex12Opr {

	public static void main(String[] args) {
	
	// 문제!!
	// 백의 자리 미만을 버리는 코드를 만들자
	// 456 -> 400
	// 111 -> 100
	// 1234 -> 1200
	// System.out.println(num ??); //400
	
	int num = 456;
	System.out.println(num / 4); //400
	System.out.println(num - (num & 100)); //400
	System.out.println(num / 100 +"0"+"0");//400(문자열)

	}	
}
