package day08;

import java.util.Random;
import java.util.Scanner;

public class Ex07비정방형배열2 {

	public static void main(String[] args) {
		
		// 2차원배열 - 비정방형배열도 {} 중괄호로 만들 수 있다
		
		String[][] fList = { {"대접", "청춘뚝배기", "해뜨는집", "그냥집밥", "신신식당", " 명덕식당" },
							 {"쿠로시로", "마시타", "런오프타마고", "전부"},
							 {"1515", "황금성", "열도지"},
							 {"수김밥", "고봉민김밥", " 한솥도시락", "엄마의식탁"} };
		Scanner sc = new Scanner(System.in);
		
		Random ran = new Random();
		
		while(true) {
			System.out.print("1. 분야별 추천 2.전체 랜덤 추천 3. 종료 >> ");
			int menu = sc.nextInt();
			
			if(menu == 1) {// 분야별 추천
				System.out.println("====분야별 추천 ====");
				System.out.println("원하는 분야를 선택해주세요.");
				System.out.print("1.한식 2.일식 3.중식 4.분식 >> ");
				int choice = sc.nextInt();
				
				
				//문제1
				// 한식, 일식, 중식, 분식 선택에 따른
				// 2차원 fList에서 해당 분야 음식을 랜덤으로 출력해주세요
				
				
				
				//쌤풀이
//				fList[choice - 1][0~5]
				
				int row = choice - 1;//random row //실제 행은 0보다시작하니까 choice보다 1 작을것
				int col  = ran.nextInt(fList[row].length);//random column
				System.out.println(fList[row][col]);
				
				
				
				//문제1
				// 한식, 일식, 중식, 분식 선택에 따른
				// 2차원 fList에서 해당 분야 음식을 랜덤으로 출력해주세요
				
				// 자영 풀이
				
//				if( choice == 1 ) { //1.한식의 경우


					
//					int korean = ran.nextInt(fList[0].length);
////					System.out.println(korean); //test
//					System.out.println(fList[0][korean]);
//					
//				}else if ( choice == 2 ) { // 2. 일식의 경우
//					int japan = ran.nextInt(fList[1].length);
////					System.out.println(japan);//test
//					System.out.println(fList[1][japan]);
//					
//				}else if (choice == 3) {//3. 중식의 경우
//					int china = ran.nextInt(fList[2].length);
////					System.out.println(china);//test
//					System.out.println(fList[2][china]);
//					
//				}else if(choice == 4) {//4. 분식의 경우
//					
//					int snack = ran.nextInt(fList[3].length);
////					System.out.println(snack);//test
//					System.out.println(fList[3][snack]);
//					
//				}else { //1~4 이외의 숫자를 입력한 경우
//					System.out.println("정확한 숫자를 입력해주세요.");
//				}
				
				
				
			}else if(menu == 2) { //전체 랜덤 추천
				
				System.out.println("====전체 랜덤 추천 ====");
				
				//문제
				
				
				//쌤풀이
				int row = ran.nextInt(fList.length); //Random은 0부터 뽑음
				int col = ran.nextInt(fList[row].length);
				System.out.println(fList[row][col]);
				
				
				
				
				//자영 풀이				
//				int row = ran.nextInt(fList.length);
////				System.out.println(row);
//				int col = ran.nextInt(fList[row].length);
//				
//				System.out.println(fList[row][col]);

				
				
				
				
				
				
				
			}else if(menu == 3) {
				System.out.println("프로그램을 종료합니다.");
				break;//가장 가까운 반복문 1개 끝내는 키워드
				
			}else {
				System.out.println("정확한 숫자를 입력해주세요.");
			}
		} //while문 끝
		
		
		
		
		
		
		
	}

}
