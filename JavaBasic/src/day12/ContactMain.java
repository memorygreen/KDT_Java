package day12;

import java.util.ArrayList;

public class ContactMain {

	public static void main(String[] args) {

		// 자: 기본생성자 ->일일이 적어야함
//		Contact contact0 = new Contact();//자: 기본생성자 메서드(이후 생성자 메서드 추가 후 에러 안나려면 설계도 클래스에 기본생성자 정의해야함! 클래스명(){}
//		contact0.name = "김가가";
//		contact0.age = 20;
//		contact0.tel = "010-1234-5678";

		Contact contact1 = new Contact("김가가", 20, "010-1111-1111");// 자영 : 생성과 동시에 필드값 넣고 싶다!=>생성자
		Contact contact2 = new Contact("박나나", 21, "010-2222-2222");
		Contact contact3 = new Contact("최다다", 22, "010-3333-3333");
		Contact contact4 = new Contact("강라라", 23, "010-4444-4444");
		Contact contact5 = new Contact("이마마", 24, "010-5555-5555");
		Contact contact6 = new Contact("임바바", 25, "010-6666-6666");

		ArrayList<Contact> contacts = new ArrayList<Contact>();// 자영: 데이터타입 중요! 객체!!

		contacts.add(contact1); // [0] //자: .add(추가할값)
		contacts.add(contact2); // [1]
		contacts.add(contact3); // [2]
		contacts.add(contact4); // [3]
		contacts.add(contact5); // [4]
		contacts.add(contact6); // [5]

//		// contact1
//		System.out.println(contacts.get(0).name);// 출력:김가가
//		System.out.println(contacts.get(0).age);// 출력:20
//		System.out.println(contacts.get(0).tel);// 출력:010-1111-1111
//
//		// ex. 이주희(20tp) : 010-3228-5850
//		// 자영 : printf 작성
//		String name = contacts.get(0).name;
//		int age = contacts.get(0).age;
//		String tel = contacts.get(0).tel;
//		System.out.printf("%s(%d세) : %s\n", name, age, tel);

		//실습
		// 자: for문으로 모든 사람 출력
		for (int i = 0; i < contacts.size(); i++) {
			String name1 = contacts.get(i).getName(); //자: getter 메서드로 호출 후 private한 필드값도 가져옴!
			int age1 = contacts.get(i).getAge();
			String tel1 = contacts.get(i).getTel();
			System.out.printf("%s(%d세) : %s\n", name1, age1, tel1);
		}
		
		
		
		//getter 메서드
		
		

	}

}
