package day06;

public class Ex01While {

	public static void main(String[] args) {

		// while, do-while
		// - 반복횟수가 정해지지 않았을 때 주로 활용
		
		// 나무 넘어뜨리기
		int treeHP = 100;
		int axPower = 30;
		int cnt = 0;
		
		while(treeHP > 0) {
			
			System.out.println("웃쌰!");
			treeHP = treeHP-axPower;
			cnt++;
					
		}System.out.println(cnt + "번 만에 나무가 쓰러졌다!!!!");
		
	}

}
