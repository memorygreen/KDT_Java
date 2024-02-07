import java.util.Scanner;

public class Ex16_240122 {

	public static void main(String[] args) {
		// 16번(2024.01.22. 16:40~16:45)
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		String str = sc.next();
//		int num = sc.nextInt();
		char[] ch = str.toCharArray();
		
		int sum = 0;
		for(int i = 0 ; i < ch.length ; i++) {
			sum = sum + (int)ch[i] - '0'; //0 == 아스키코드 48
		}
		System.out.println("합은 " + sum + "입니다.");
		
	}

}
