package 상속2;

public class SmartPhone extends Phone{
	
	
	// 스마트폰 클래스
	
	//쌤풀이
	public void playMusic() {
		System.out.println("신나는 음악 둠칫둠칫");
	}
	
	public void internet() {
		System.out.println("유튜브 보기");
	}
	
	
	
	
	
	// 오버라이딩
//	@Override //@ -> 어노테이션 : 주석은 주석인데 기능을 하는 주석
//	//자영 : 에러 안남. 오버라이딩 잘됨
//	public void call() {//자영 : 매개변수 다르면 초록색 산 없어짐
//		System.out.println("부모클래스 상속받은 call()");
//	}
	
	
	@Override
	public void call() {
		System.out.println("오버라이딩 된 call!!");
		// TODO Auto-generated method stub //자영 : 아무것도 안적으면 super.call() 호출하겠다!!!
//		super.call();// super->상위의
	}
	
	// 오버라이딩 된 메소드가x(매개변수 다름)
//	@Override //자영 : 에러나면 오버라이딩 안된다는걸 알려주는 기능함
	public void call(int a) {//자영 : 오버라이딩x 오버로딩o (매개변수만 다르니까)
		System.out.println("영상통화 걸기");
	}
	

	//자영풀이
	public void playMusic2() {
		System.out.println("음악 재생하기");
	}
	
	public void interNet2() {
		System.out.println("인터넷하기");
	}
	
}
