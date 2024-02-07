package day09;

public class Ex02메소드2 {

	public static void main(String[] args) {

		sumPrint(4, 7); //자영 : sum 쓰고 ctrl+space bar 하면 자동완성 됨		
		
		
	}
	//매개변수o 반환값x
	private static void sumPrint(int a, int b) {
		
		int result = a + b;
		System.out.println(result); //자영 : 출력하는 기능도 같이 있음! 호출만 해도 콘솔창에 결과 나타남!
	}
	//같은 클래스 내에서 접근하기때문에 private도 가능
	//return값 없을거니까 void 키워드
	//void 자리에 int 썼을때에는 {}안에 아무것도 없으면 에러났음 but return값 없으니 에러 안남
	//void 쓰고 return 쓰면 에러남(return값 없다고 했는데 썼으니까!!)



}
