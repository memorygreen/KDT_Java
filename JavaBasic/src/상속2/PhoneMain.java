package 상속2;

public class PhoneMain {

	public static void main(String[] args) {
		
		//쌤풀이
		PayPhone pp = new PayPhone();
		pp.call();
		pp.callBack();
		pp.coin(); //동전넣고 전화걸기~
//		System.out.println(pp.number);//자영 : 필드명도 상속받으면 ->접근 가능
		
		SmartPhone sp = new SmartPhone();
		sp.call(); //자영 : 오버라이딩 //출력 : 부모클래스 상속받은 call() 
		sp.call(5); //자영 : 오버로딩 //출력 : 영상통화 걸기
		sp.callBack();
		sp.internet();
		sp.playMusic();
//		System.out.println(sp.number);
		
		//자영 풀이
//		System.out.println("====전화====");
//		Phone p2 = new Phone();
//		p2.call2();
//		p2.callBack2();
//		
//		System.out.println("====스마트폰====");
//		SmartPhone sp2 = new SmartPhone();
//		sp2.call2();
//		sp2.callBack2();
//		sp2.playMusic2();
//		sp2.interNet2();
//		
//		System.out.println("====공중전화====");
//		PayPhone pp2 = new PayPhone();
//		pp2.coin2();
//		pp2.call2();
				
	}

}
