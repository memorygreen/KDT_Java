package day02;

public class Ex08String {

	public static void main(String[] args) {

//		String name = new String("김자영"); //레퍼런스타입은 키워드 new 들어감
		String name = "김자영"; // new String 안써도 컴파일러가 발견하면 붙여줌 (Java 1.1 부터 사용가나능, C나 C++은 문자열 기능 없다)
		
		
		// String 데이터 타입
		// Java 1.0 버전 당시
		char word1 = '김';
		char word2 = '자';
		char word3 = '영';
		System.out.print(word1);
		System.out.print(word2);
		System.out.print(word3);
		
	}

}
