package day03;

import java.util.Scanner;

public class Ex07Opr {

	public static void main(String[] args) {

		// 사용자로부터 정수를 입력 받아
		// 만약, 20이상이라면(20보다 크거나 같다면)
		// "성인입니다" 문구 출력
		// 20미만이라면(20보다 작다면)
		// "미성년자입니다" 문구 출력

		//문제정의
		// 1. 입력받기 위한 도구 Scanner 생성
		Scanner sc = new Scanner(System.in);
		
		// 2. 출력 문구 "나이를 입력하세요 : "
		System.out.print("나이를 입력하세요 : ");//(x)자영 틀린 부분 //ln도 지워야해
		
		// 3. 입력 받은 값을 int age에 저장
		int age = sc.nextInt();		
		
		// 4. 만약, age가 20 이상이라면 "성인입니다"
		// age가 20미만이라면 "미성년자입니다" 라는 무나졍ㄹ을
		// String result에 저장
		// (조건식) ? (true) : (false)
		String result = (age >= 20) ? ("성인입니다") : ("미성년자입니다"); //자영 아쉬운부분 (true) (false) 괄호쓰기!!
//		String result = (age >= 20) ? ("성인입니다") : ((age < 8) ? ("유아입니다") : ("미성년자입니다")); //가능하다
				
		// 5. result 출력!
		System.out.println(result);
		

	}

}
