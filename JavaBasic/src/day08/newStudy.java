package day08;

public class newStudy {

	public static void main(String[] args) {

		// 버블 정렬 (Bubble Sort)
		int[] array = { 9, 5, 1, 6, 7 };

		int temp = 0;

//		// 1STEP
//		// 0,1
//		if (array[0] > array[1]) {
//			temp = array[1];
//			array[1] = array[0];
//			array[0] = temp;
//		}
//
//		// 1,2
//		if (array[1] > array[2]) {
//			temp = array[2];
//			array[2] = array[1];
//			array[1] = temp;
//		}
//		// 2,3
//		if (array[2] > array[3]) {
//			temp = array[3];
//			array[3] = array[2];
//			array[2] = temp;
//		}
//
//		// 3,4
//		if (array[3] > array[3]) {
//			temp = array[4];
//			array[4] = array[3];
//			array[3] = temp;
//		}
//
//		// 2STEP
//		// 0,1
//		if (array[0] > array[1]) {
//			temp = array[1];
//			array[1] = array[0];
//			array[0] = temp;
//			}
//		// 1,2
//		if (array[1] > array[2]) {
//			temp = array[2];
//			array[2] = array[1];
//			array[1] = temp;
//			}
//		// 2,3
//		if (array[2] > array[3]) {
//			temp = array[3];
//			array[3] = array[2];
//			array[2] = temp;
//			}
//		
//		// 3STEP(2번 돌기)
//		// 0,1
//		if (array[0] > array[1]) {
//			temp = array[1];
//			array[1] = array[0];
//			array[0] = temp;
//			}
//		
//		// 1,2
//		if (array[1] > array[2]) {
//			temp = array[2];
//			array[2] = array[1];
//			array[1] = temp;
//			}
//		
//		
//		// 4STEP(1번 돌기)
//		// 0,1
//		if (array[0] > array[1]) {
//			temp = array[1];
//			array[1] = array[0];
//			array[0] = temp;
//			}
//		
//		
//		// 1STEP -> for문 (4번 돌음)
//		for (int j = 0; j < array.length - 1; j++) {
//			if (array[j] > array[j + 1]) {
//				temp = array[j + 1];
//				array[j + 1] = array[j];
//				array[j] = temp;
//			}
//		}
//		
//		// 2STEP -> for문 (3번만 돌면됨)
//		for (int j = 0; j < array.length - 2; j++) {
//			if (array[j] > array[j + 1]) {
//				temp = array[j + 1];
//				array[j + 1] = array[j];
//				array[j] = temp;
//			}
//		}
//		
//		// 3STEP -> for문 (2번만 돌면됨)
//		for (int j = 0; j < array.length - 3; j++) {
//			if (array[j] > array[j + 1]) {
//				temp = array[j + 1];
//				array[j + 1] = array[j];
//				array[j] = temp;
//			}
//		}
//		
//		// 4STEP -> for문 (1번만 돌면됨)
//		for (int j = 0; j < array.length - 4; j++) {
//			if (array[j] > array[j + 1]) {
//				temp = array[j + 1];
//				array[j + 1] = array[j];
//				array[j] = temp;
//			}
//		}
//		
		
		
		// 전체 for문
		//내림차순
		for(int i = 1 ; i < array.length ; i++) {
			
			for (int j = 0; j < array.length - i; j++) {
				if (array[j] < array[j + 1]) {
					temp = array[j + 1]; //(x)선생님은 여기서 int 선언하심
					array[j + 1] = array[j];
					array[j] = temp;
				}
			}
			
		}
		
		
		// 확인용 출력
		for (int j = 0; j < array.length; j++) {
			System.out.print(array[j] + " ");
		}

	}

}
