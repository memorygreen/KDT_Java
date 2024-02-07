package day03;

public class Ex01Opr {
	public static void main(String[] args) {
	
	// 2. 대입 연산자 ( '=' )
	int a; //변수의 선언
	a = 1; //정수 1을 변수 a에 대입
	
	// 특징 : = 우항(오른쪽)이 먼저 실행된다!!
	// 우항(오른쪽)의 결과가 좌항(왼쪽)에 대입(저장)된다
	
	
	// 변수 b를 선언하고
	// b에 2를 대입(저장)해주세요
	int b;
	b = 2;
	
	
	// b에 원래 b보다 2 더한 값을 대입(저장)해주세요
	b = b + 2;
	
	// 복합 대입 연산자
	b += 2;//b = b + 2;
	
	// 정수형 변수 age를 선언
	// age에 나의 액면가를 대입(예를 들어 예호쌤은 21살)
	
	// 생일이 지났을 때, 1살 증가한 결과를 
	// 다시 age에 대입
	// 그 age를 출력
	
	int age;
	age = 25;
	age = age + 1; //age += 1;
	System.out.println(age);
	
	// +=
	// -=
	// *=
	// /=
	// %=
	
	int num = 10;
	num += 1; // num : 11
	num -= 3; // num : 8
	num *= 2; // num : 16
	num /= 3; // num : 5
	num %= 2; // num : 1
	
	
	}	
	
}
