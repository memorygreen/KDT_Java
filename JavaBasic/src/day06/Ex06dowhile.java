package day06;

public class Ex06dowhile {

	public static void main(String[] args) {

		// do-while로 하는 나무 찍기
		//(while보다 do while이 더 적합)
		
		int treeHp = 100;
		int axPower = 50;
		int cnt = 0;
		do {
			// 반복작업 코드를 작성할 부분
			// 이 안에 작성된 코드는 무조건 1회 실행
			System.out.println("으씨야앗!");
			treeHp = treeHp - axPower;
			System.out.println("나무의 hp : " + treeHp);
			
			cnt++;
			
			
			
		} while (treeHp > 0);
		
		System.out.println(cnt + "번 만에 나무가 쓰러졌다.");
		
		
	}

}
