package day07;

public class Ex03배열의복사 {

	public static void main(String[] args) {

		// 일반 변수의 복사
		int num1 = 100;
		int num2 = num1;
		
		// 길이가 3인 정수형 배열 값은 100 200 300이 들어간 배열 array 만들기
		
		int array0[] = new int[3];
		
		array0[0] = 100;
		array0[1] = 200;
		array0[2] = 300;
		
		//자영 혼자 시도하다 포기
//		for(int  = 0 ; i <= array.length ; i++) {
//			array0[i] = (i+1)*100;
//		}
		
		
		//배열을 만드는 두번째 방법(자영 : 값, 길이 정확히 알때사용)
		int[] array1 = { 100, 200, 300 };
//		int array1[] = { 100, 200, 300 }; //변수명 뒤에도 [] 사용가능!but 대부분의 개발자 자료형 뒤에 [] 사용!
		int[] array2 = array1; //array1복사->array2
		System.out.println(array2[0]);//100
		
		array2[0] = 999;//100->999로 바꾸자
		System.out.println(array2[0]);//999
		
		System.out.println(array1[0]);//999 (array1의 0번째까지 바뀜!!!)
		//reference 변수의 특징!
		
		System.out.println(array1); //배열의 주소 나옴 //[I@515f550a
		System.out.println(array2); // array1과 같은 주소 나옴//[I@515f550a
		
		
	}

}
