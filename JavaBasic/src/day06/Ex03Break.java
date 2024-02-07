package day06;

public class Ex03Break {

	public static void main(String[] args) {
		
		
		// 쌤풀이
		int cnt = 0;
		while (true) {
			cnt++;
			System.out.println(cnt + "안녕");
			if(cnt == 10) {
				break;
			}
			// break는 가장 가까운 반복문 1개를 끝낸다
		}
		System.out.println("끝!");
		
		// 자영풀이 ->틀림
//		int cnt = 0;
		while(true) {
			if(cnt == 10) {
				cnt++;
				System.out.println(cnt + "안녕");
				break;
			}else {
				cnt++;
				System.out.println(cnt + "안녕");
				
			}
			
			// break는 가장 가까운 반복문 1개를 끝낸다
		}
		System.out.println("끝!");
		
	}

}
