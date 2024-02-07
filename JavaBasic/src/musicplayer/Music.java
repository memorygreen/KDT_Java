package musicplayer;

public class Music {
	//Class는 내가 저장하고 싶은 데이터를 저장할 수 있는 데이터 타입이다
	
	
	// 자영 : 필드==전역변수
	private String singer; //가수
	private String title;//제목
	private int time;//시간
	private String path;//실제 노래 경로
	
	//자영 :  기본생성자
//	public Music() {
//		
//	}
	
	//자영 : 사용자지정(사용자정의) 생성자
//	public Music(String singer, String title, int time) {
////		super(); //자영 : 상속
//		this.singer = singer;
//		this.title = title;
//		this.time = time;
//	}
	// 자영 : 이제 setter 메소드 써야할 일이 없다!!!!
	
	public Music(String singer, String title, int time, String path) {
//		super(); //자영 : 상속
		this.singer = singer;
		this.title = title;
		this.time = time;
		this.path = path;
	}	
	
	
	
	public String getPath() {
		return path;
	}


	public void setPath(String path) {
		this.path = path;
	}

	public String getSinger() { //자영 : 그냥 가져오면되니까 매개변수필요x
		return singer; 
		// 자영 : 데이터 보호 가능(ex. 주민등록번호 뒷자리는 삭제해서 리턴...)
	}

	public String getTitle() {
		return title;
	}

	public int getTime() {
		return time;
	}
	
	// 자영 : 나중에 뉴진스가 이름 바꾸면 setSinger() 메소드 사용하는거다!!!
	public void setSinger(String singer) {
		// 보안
		this.singer = singer; //자영 : 매개변수와 필드의 변수명 같을때 ?=>this ==현재 클래스를 의미
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public void setTime(int time) {
		this.time = time;
	}

}
