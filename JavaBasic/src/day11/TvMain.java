package day11;

public class TvMain {

	public static void main(String[] args) {

		Tv tv = new Tv();
		
		tv.channel = 5;
		tv.color = "red";
		
		//쌤풀이
		tv.channelUp();
		tv.channelUp();
		tv.channelDown();
		
		System.out.println("채널번호 : " + tv.channel);
		System.out.println("채널색깔 : " + tv.color);
		
		
		//자영풀이
//		tv.channelUp2();
//		tv.channelUp2();
//		tv.channelDown2();
//		
//		System.out.println("채널번호 : " + tv.channel);
//		System.out.println("채널색깔 : " + tv.color);
	}

}
