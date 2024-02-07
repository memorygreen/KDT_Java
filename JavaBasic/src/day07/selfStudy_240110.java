package day07;

public class selfStudy_240110 {

	public static void main(String[] args) {


		// for문 예제 12 : 1~1000 중 완전수 찾기
		// 1~1000까지 숫자 중 완전수인 숫자를 모두 출력하세요.
		// (완전수 = 자신의 약수 중에서 자신을 제외한 모든 약수의 합이 자신과 같다면 완전수)
		// ex. 6의 약수 : 1,2,3,6
		// - 자신을 제외한 약수의 합 1+2+3==6  =>6은 완전수
		// - 자신과 자신을 제외한 약수의 합이 같다
		
		int sum = 0;
		for(int i = 1; i <= 1000 ; i++) {
			System.out.print(i + "의 약수 : ");
			
			for(int j = 1; j < i ; j++) {
				if(i % j == 0) {
					sum = sum + j;
					System.out.print(j + " ");
					
				}
				System.out.println(i + "의 총합 : " + sum);
				
				
		}System.out.println();
			
		}
		
	}

}
