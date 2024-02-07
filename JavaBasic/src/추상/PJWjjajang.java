package 추상;

public class PJWjjajang extends Pbkjjajang { 
	
//첫째아들 박종우 짜장면집 (미국)
	
	//종우 가게만 있는 짬뽕 만드는 기능
	public void makeJjambong() {
		System.out.println("신선한 해물(안익음)이 잔뜩 올라간 해물짬뽕!");
	}

	@Override //오버라이드 - 부모의 메소드를 자식클래스에서 다시 정의하는 것(재정의)
	public void makeJjajang() {
		System.out.println("파인애플이 잔뜩 올라간 짜장면");
		
//		super.makeJjajang(); //자영 : 부모것 안 쓰려고하는거니까 super :지워야함!
		
		
		
		
	}
	
	
	
}
