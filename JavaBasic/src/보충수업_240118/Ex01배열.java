package 보충수업_240118;

public class Ex01배열 {

	public static void main(String[] args) {

		//1. 배열 참조변수 선언 : 배열의 참조값을 저장할 공간만 만들어라!
		int[] arr;
		
		//2. 배열 생성(5)
		arr = new int[5]; //크기 지정 필수!
		
		System.out.println(arr);//배열을 찾아갈 수 있는 참조값(주소값) 확인//출력 : [I@3d012ddd
		
		
		arr[0] = 1; //0번 인덱스에 값 할당
		arr[1] = 2; 
		arr[2] = 3; 
		arr[3] = 4; 
		arr[4] = 5; 
		//arr[5] = 6; 
		
		
		//** 연속적인 공간을 할당 받는다! ->순서를 가지고 있다
		// => 반복문(for) -> 범위가 정해져있음(0~)
//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//		System.out.println(arr[2]);
//		System.out.println(arr[3]);
//		System.out.println(arr[4]);
		
//		for(int i = 0 ; i <5 ; i++) {
//			System.out.println(arr[i]);
//		}
		
		
		// for문
		for(int i = 0 ; i <= arr.length - 1 ; i++) {
			System.out.println(arr[i]);
		}
		
		//for each문 (무조건 0번부터 시작)
		for(int num : arr) {
			System.out.println(num);
			
		}
		
		
	}

}
