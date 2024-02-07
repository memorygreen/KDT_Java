package day11;

public class Tv {
	
	//필드
	int channel;
	String color;
	
			
	//메소드
	// 쌤풀이
	public void channelUp() { //자영 : 접근제한자 =>다른클래스 접근해야함->public
		// return 타입 필요x ->void
		channel++;//channel += 1;
	}
	
	public void channelDown() {
		channel--;
	}
	
	
	// 자영풀이
	public void channelUp2() { 
		channel++;
		System.out.println("channel : +1");
	}
	
	public void channelDown2() {
		channel--;
		System.out.println("channel : -1");
	}
}
