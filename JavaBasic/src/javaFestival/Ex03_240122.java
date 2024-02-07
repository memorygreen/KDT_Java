package javaFestival;

public class Ex03_240122 {

	public static void main(String[] args) {
		// 3번 2024.01.22. 08:45~
		
		int sum = 0;
		for(int i = 1 ; i <=100 ; i++) {
			
			if(i % 2 == 1) {
				System.out.print(i + " ");
				sum += i;
						
			}else {
				System.out.print("-" + i + " ");
				sum -=i;
			}
		}
		System.out.println();
		System.out.println("결과 : " + sum);
	}

}
