package day08;

public class self_study_240111 {

	public static void main(String[] args) {

		int[] array = { 9, 5, 1, 6, 7 };
		// 버블정렬
		for (int i = 1; i < array.length; i++) {
			for (int j = 0; j < array.length - i; j++) {
				if (array[j] > array[j + 1]) { // 부등호만 반대로 하면 내림차순된다!!
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
		
		
		// 버블정렬 종료
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		
		}
	}

}
