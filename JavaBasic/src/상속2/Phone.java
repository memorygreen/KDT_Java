package 상속2;

public class Phone {
	

	//쌤풀이
	//자영 : 필드
//	public String number; //public 접근 제한자->캡슐화에 위배됨
	protected String number; //protected 접근 제한자->같은 패키지 내 사용가능
	
	//자영 : 메소드
	public void call() {
		System.out.println("뚜르르르 전화받으세요~!");
	}
	
	public void callBack() {
		System.out.println("철컥! 전화받았습니다~!");
	}
	
	
	// 자영풀이
	public void call2() {
		System.out.println("전화 걸기");
	}
	
	public void callBack2() {
		System.out.println("전화 받기");
	}
	
	
	
}
