package day11;

public class People {
	// 창조주가 되어서 사람을 만들 수 있는 '설계도' 만들기
	// 설계도 = 클래스(Calss)
	// (자영 : main method가 없는 클래스(calss))
	// 클래스 구조
	// 1. 필드 = 속성, 특성, 정의할 수 있는 데이터
	// 이름, 키, 몸무게, 성별...
	String name; // 필드 접근제한자 생략돼있음 //public 생략가능
	double height;
	String gender;
	
	
	// 생성자 메소드(default constructor, 기본생성자)
	// 생성자가 없는 클래스는 X
	// 기본 생성자 메소드 이외의 또다른 생성자 메소드를 만들면 사라짐
	// (자영 : 구조 - 접근제한자... 
	// (자영 : main 메소드 없으니 static 안써도됨)
	// 리턴타입x(void 자체도 없음)
	// 생성자 메소드 이름 = 클래스이름
	
	// 생성자 메소드도 오버로딩이 가능
	
	public People() {
		
	}// (자영 :생성자 이름은 클래스 이름과 같다)
	
	
	//this -> 현재 메소드가 존재하는 클래스의 필드값을 가리킴
	public People(String name, double height, String gender) {// 자영 : 생성자 생성 시 체크했던 필드명 똑같이 들어옴
// 소괄호 안은 매개변수 = 이 메소드 안에서만 사용 가능한 지역변수		
		super(); //(자영 : 없어도 됨. super는 상속개념. 상위 클래스를 가리킴)
		this.name = name;//자영 : this ->현재 이 메서드가 존재하고 있는 People이라는 클래스의 필드값을 가리킨다!! 
		this.height = height;
		this.gender = gender;
	}

	// 2. 메소드
	// 말하기, 걷기, 코딩하기, 잠자기...
	// main() 가 없는 곳에서는 static 키워드 사용x

	public void talk() { // (자영 : 여기는 정의만 하는 곳! 다른클래스에서 호출=>public) //main 메소드 없으니 static 안 붙인다
		System.out.println("재잘재잘 말하기~");
	}

	public void coding() {
		System.out.println("뚝딱뚝딱 개발하기!");
	}

	public void sleep() {
		System.out.println("Zzzzz.....");
	}

}
