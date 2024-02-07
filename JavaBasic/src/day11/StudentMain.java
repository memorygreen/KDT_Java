package day11;

public class StudentMain {

	public static void main(String[] args) {
		
		// Student 클래스 불러오기 / 객체 생성
		Student s1 = new Student(); //자영 : 생성자 추가로 만들면 에러생김->기본생성자메소드 Student() 만들어줘야 에러 해결됨!
		
		s1.name = "이주희";
		s1.number = "152548";
		s1.age = 27;
		s1.scoreJava = 100;
		s1.scoreWeb = 100;
		s1.scoreAndroid = 40;

		Student s2 = new Student("박병관","000000",100,100,100,100);
		//자영 : 또다른 생성사 메서드를 만들어야 에러가 안 남

		s1.show();
		s2.show();
		
		
		
		//자영풀이
//		Student s3 = new Student("김자영", "20231229", 25, 100, 95, 90);
//		s3.show2();
//		
//		Student s4 = new Student("홍길동", "2021-12-28", 20, 100, 80, 60);
//		4.show2();
		
		
	}

}
