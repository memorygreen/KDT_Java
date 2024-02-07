package day05;

public class Ex02양수와음수 {

	public static void main(String[] args) {
		
		// 1Step - 1부터 100까지 옆으로 한 칸 씩 띄면서 출력
		
		// 2Step - 1부터 100까지 숫자 중 홀작 판별
		
		// 3Step - 짝수 출력할 때만 앞에 -붙이거나, -1를 곱해서 출력
		//		   홀수는 그냥 출력
		
		for(int i = 1 ; i <= 100; i++) {
			if(i % 2 == 1) {
				System.out.print(i+ " ");
			}else { //else if 도 사용가능
				System.out.print("-" + i + " ");
//				System.out.print(-1 * i + " "); //-1 곱하는 것도 가능
			}
		}System.out.println();
		
		//자영 풀이
		for(int i=1;i<=100;i++) {
			
			if(i % 2 == 1) {
				System.out.print(i+" ");
			}else {
				System.out.print(i*(-1)+" ");
			}
			
		}
			
	}

}
