package day07;

public class Ex01배열 {

	public static void main(String[] args) {
		
		//배열
		// - 동일한 자료가 순차적으로 저장된 것
		// - 저장된 데이터를 가져오거나 넣기 위해 번호 매김 (인덱스)
		// - 인덱스 0부터시작하고 길이는 1부터 시작함
		// - 배열의 길이는 배열을 생성할 때 지정하며 변경할 수 없다
		
		// 정수를 저장할 수 있는 길이가 5인 배열 array생성
		int array[] = new int[5];
		
		
		// 배열의 길이를 알 수 있는 방법
		// 배열이름.length
		
		//각 인데스 안에 1~5까지 저장 (자영 :길이==5 =>마지막인덱스 : 길이-1)
		array[0] = 1;
		array[1] = 2;
		array[2] = 3;
		array[3] = 4;
		array[4] = 5;
//		array[5] = 3; //자영 : 배열은 길이가 고정! 에러!
		
		//쌤풀이 - for문으로 값넣기
		
		
//		for(int i = 0 ; i < 5 ; i++) {
		for(int i = 0 ; i < array.length ; i++) { //배열 길이 바껴도 자동으로 적용
			array[i] = i + 1;
		}
		
		//각 인덱스 앞에 값 출력
		//쌤 풀이 - for문(길이 고정돼있으니까!)으로 값 출력하기
		for(int i = 0 ; i < array.length ; i++) {
//		for(int i = 0 ; i < 5 ; i++) {
			System.out.println(array[i]);
		}
		
//		System.out.println(array[0]);
//		System.out.println(array[1]);
//		System.out.println(array[2]);
//		System.out.println(array[3]);
//		System.out.println(array[4]);
//		
		
		//자영 : for문 - 값 넣기
//		for(int i = 0 ; i<=4 ; i++) {
//			array[i] = i+1;
//		}
		
		//자영 : for문 - 값 꺼내기
//		for(int i = 0; i <= 4 ;i++) {
//			
//			System.out.println(array[i]);
//		}
		
	}

}
