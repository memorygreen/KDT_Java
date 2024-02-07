package day11;

public class PeopleMain {

	public static void main(String[] args) {

		// People 이라는 설계도에 의해서 객체(Object)가 만들어지는 클래스
		
		// 1. 객체(사람) 생성
		// 객체를 생성할 때 new 키워드 사용
		// (자영 : ex. 스캐너 만들때 사용! 스캐너도 클래스라서 불러온거다!)
		// 변수 앞 키워드 ->데이터 타입(클래스)
		// (자영 : new 키워드로 클래스를 import(불러와야) 해야한다!)
//		Scanner sc = new Scanner(System.in);
		
		//(자영 : 첫번째 사람)
		// 클래스명 변수명 = new 클래스();
		People p1 = new People();//자동완성 //클래스이름 == 데이터타입
		
		// (자영 : 특징) =>필드
		p1.name = "김자영"; //자영 : String
		p1.height = 158; //자영 : double
		p1.gender = "여자"; //자영 : String 

		System.out.println(p1.name);
		System.out.println(p1.height);//자영 : 기본데이터타입 변수는 null값을 가질 수 없다 //정수형배열은 기본값 null 아닌 0 들어있다//double이라서 0.0
		System.out.println(p1.gender);//자영 : 레퍼런스변수는 기본값으로 null값 들어감
		
//		System.out.println(p1);//변수명 앞은 항상 데이터타입!! 기본데이터타입 아님!!->레퍼런스 변수//자영 : 레퍼런스변수는 주소값 가짐!! //출력 : day11.People@123a439b
		
		// (자영 : 기능) => 메소드
		p1.coding();
		p1.sleep();
		p1.talk();
		
		
		//(자영 : 두번째사람)
		People p2 = new People();
		
		p2.name = "임창현";
		p2.gender = "남자";
		p2.height = 176;
		System.out.println(p2.name);
		System.out.println(p2.gender);
		System.out.println(p2.height);
		
		p2.coding();
		p2.sleep();
		p2.talk();
		
		
		//(자영 : 생성자  만들고나서 세번째 사람 만들기)
		People p3 = new People("홍길동", 180, "남자");
		System.out.println(p3.name); //(자영 : 바로 호출 가능함!)
		System.out.println(p3.gender);
		System.out.println(p3.height);
		p3.coding(); //(자영 : 바로 호출 가능함!)
		p3.sleep();
		p3.talk();
		
		
	}

}
