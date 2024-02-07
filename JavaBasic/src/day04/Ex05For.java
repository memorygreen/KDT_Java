package day04;

public class Ex05For {

	public static void main(String[] args) {

		// for(초기화구문; 조건식; 반복 후 작업){
		// 실행문장;
		// }

//		for(int i = ??; i ?? ; ??) {
//			
//		}//i는 for {} 안쪽에서만 쓰이는 지역변수

		// 자영 : 만약 for문이 없다면?
//		System.out.println(1);//()안 규칙 갖고 있는 부분 확인
//		System.out.println(2);
//		System.out.println(3);
//		System.out.println(4);
//		System.out.println(5);

		// i 1->2->3->4->5->6
//		int i; //2. 지역변수는 {}안에서만 활용가능=>밖에서 만들어야 밖에서 활용가능
		for (int i = 1; i <= 5; i++) { // 반복하고자하는 숫자의 처음이 1이니까 초기화1인것!
			System.out.println(i);// 반복되는 문장
		}
//		System.out.println(i); //1. 지역변수라서 {} 안에서만 바라볼수있음 안쪽에서 쓰이고 버려짐 //3. =>6출력됨

		// for( i = ?; i ?? ; ?)
		// Q. 21 ~ 57까지 출력
//		System.out.println(21 + " ");
//		System.out.println(22 + " ");
//		System.out.println(23 + " ");
//		// ...
//		System.out.println(55 + " ");
//		System.out.println(56 + " ");
//		System.out.println(57 + " ");

		for (int i = 21; i <= 57; i++) { // (x) 자영변수는 i로 쓰자
			System.out.print(i + " ");

		}

		// 21~ 57 까지 중 홀수만 출력

		System.out.println();

		System.out.println(21 + " ");
		System.out.println(23 + " ");
		System.out.println(25 + " ");
		// ...
		System.out.println(53 + " ");
		System.out.println(55 + " ");
		System.out.println(57 + " ");

		for (int i = 21; i <= 57; i += 2) {
			System.out.print(i + " ");
		}

		// 22 ~ 57가지 중 홀수만 출력
		for (int i = 22; i <= 57; i++) {// (x)자영 틀림 : 22~57까지 일단 다 출력->반복후 실행문i++//개발자들:웬만하면 반복후실행문은 i++로 두자!!!
			if (i % 2 == 1) {
				System.out.print(i + " ");
			}
		}
		
		// 다른방법 (자영이도 생각한 방법이었다=>하지만 초기i=22가 짝수라서 바로 종료됨=>false)
//		for (int i = 22; i % 2 == 1 && i <= 57; i++) {// 반복후 실행문i++
//			System.out.print(i + " ");
//		}

		
		System.out.println();
		// 1~ 100까지 숫자 중 3의 배수를 가로로 출력(3,6,9)
		for(int i = 1; i <= 100 ; i++) {
			if(i % 3 == 0) { //출력전에 검사! =>조건식 사용!
				System.out.print(i + " "); //(x) ln빼야지
			}
		}	
		
		System.out.println();
		// 57부터 21가지 거꾸로 출력
		for(int i = 57;i >=21 ; i--) {
			System.out.print(i + " ");
		}
		System.out.println();
		
//		sol 2)수학적테크닉 사용! i++ 사용가능!
		for(int i = 21; i <=57; i ++) {
			System.out.print(78 - i + " ");
		}
		
		
	}

}
