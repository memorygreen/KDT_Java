package day11;

public class Student {

	// 학생정보 관리하는 프로그램
	// 필드 ->6개
	String name; // 이름
	String number; // 학번
	int age; // 나이
	int scoreJava; // Java점수
	int scoreWeb; // Web점수
	int scoreAndroid; // Android점수

	// 쌤풀이
	// 모든 필드값을 생성과 동시에 초기화 해줄 수 있는 생성자 메소드
	// 자영 : 생성자메소드 만들기=>빈공간 우클릭-소스-필드(아래에서3번째)
	public Student(String name, String number, int age, int scoreJava, int scoreWeb, int scoreAndroid) {
		super();
		this.name = name;
		this.number = number;
		this.age = age;
		this.scoreJava = scoreJava;
		this.scoreWeb = scoreWeb;
		this.scoreAndroid = scoreAndroid;
	}
	
	//기본 생성자 메소드
	public Student() {
	
	}
	
	// 메소드-> show()
	// 자영 : 기본 메소드는 리턴타입있다! (리턴값 안 쓸거면 void)
	public void show() {
		System.out.println(name + "님 안녕하세요.");
		
		// 자영 : prinf (f포맷팅)
		//[ number, age 살]
//		System.out.println("[" + number + ", " + age + "살]");
		System.out.printf("[%s, %d살]\n", number, age);
		System.out.println(name + "님의 Java점수는 " + scoreJava + "점 입니다.");
		System.out.println(name + "님의 Web점수는 " + scoreWeb + "점 입니다.");
		System.out.println(name + "님의 Android점수는 " + scoreAndroid + "점 입니다.");
		System.out.println("======================================");
		
	}
	
	
	
	
	// 자영풀이
//	Student(String name, String number, int age, int scoreJava,int scoreWeb,int scoreAndroid ){
//		this.name = name;
//		this.number = number;
//		this.age = age;
//		this.scoreJava = scoreJava;
//		this.scoreWeb = scoreWeb;
//		this.scoreAndroid = scoreAndroid;
//	}

	// 메소드 -> show()
	public void show2() {
		System.out.println(name + "님 안녕하세요.");
		System.out.println("[" + number + ", " + age + "살]");
		System.out.println(name + "님의 Java점수는 " + scoreJava + "점입니다.");
		System.out.println(name + "님의 Web점수는 " + scoreWeb + "점입니다.");
		System.out.println(name + "님의 Android점수는 " + scoreAndroid + "점입니다.");
		System.out.println("===================================");
	}

}
