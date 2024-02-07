package 계산기;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 도형의 넓이를 계산해주는 프로그램
		// 다양한 도형을 확장할 수 있게 설계
		
		Scanner sc = new Scanner(System.in);
		

		// 계산기 객체 생성
		AreaCalculrator cal = new AreaCalculrator();
		
		
		//자 : 업캐스팅
		Figure f = null;
	
		
		while(true) {
			
			System.out.print("1.삼각형 2.사각형 3.원 4.종료 >>");
			int choice = sc.nextInt();
			
			if(choice == 1) {
				//삼각형 넓이 계산 -> 밑변*높이/2
				System.out.print("밑변 입력 : ");
				double width = sc.nextDouble();
				System.out.print("높이 입력 : ");
				double height = sc.nextDouble();
//				System.out.println("넓이 : " + width * height / 2); //자:우리는 메소드호출할 것
			
//				Triangle cal = new Triangle(); //자:생성자 만들면 기본생성자 에러남
				
//				Triangle cal = new Triangle(width, height); //자:생성자
				f = new Triangle(width, height); //자:업캐스팅
//				double result = cal.calArea();
				
				//자:공통부분 밖으로
//				double result = cal.calArea(f); //자:업캐스팅->코드 간결화하는 중
//				System.out.println("넓이 : " + result);
				
				
				
			}else if(choice ==2) {
				// 사각형 넓이 계산 -> 가로*세로
				System.out.print("가로 입력 : ");
				double width = sc.nextDouble();
				System.out.print("세로 입력 : ");
				double height = sc.nextDouble();
				
				
				// 실습
//				Rectangle cal = new Rectangle(width, height);
				f = new Rectangle(width, height);
//				double result = cal.calArea();
				
				//자:공통부분 밖으로
//				double result = cal.calArea(f);
//				System.out.println("넓이 : " + result);
				
			}else if(choice ==3) {
				// 원 넓이 계산 -> 반지름*반지름*3.14
				System.out.print("반지름 입력 : ");
				double radius = sc.nextDouble();
				
				
				f = new Circle(radius); //자:figure 클래스로 업캐스팅해서 담아주기!
				
			}else if(choice == 4) {
				// 종료
				System.out.println("프로그램 종료!");
				break;
				
			}else {
				System.out.println("올바른 숫자를 입력해주세요.");
			}
			
			double result = cal.calArea(f); //자: : 껍데기는 figure지만 실제 알맹이는 triangle, rectangle, circle... 
			System.out.println("넓이 : " + result);
		}


	}

}
