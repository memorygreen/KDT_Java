package day12;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex01ArrayList {

	public static void main(String[] args) {

		//1. 선언 및 생성
		// 배열
		// 자영 : 배열은 import 안 하고 사용
		int[] arr = new int [5]; //자영 : 길이 =5
		//자영 : 배을의 길이? 클래스x 키워드 length 로 길이 알 수 있음
		
		// ArrayList(가변리스트)
		// ArrayList<데이터타입> 변수명 = new ArrayList<생략가능>();
		// 자영 : () 붙는 이유? 메서드 통해서 ArrayList 생성 // ArrayList도 하나의 클래스다!//import필요
		
//		Scanner sc= new Scanner(System.in);
		// 자영 : Scanner 객체 만들고 싶으면 Scanner() 메소드 통해서 만들었었다!
		
		// Array리스트는 import 해야 사용 가능
		// 자영 : java.util.ArrayList 클래스이기 때문!
//		ArrayList<int> arrList = new ArrayList<>(); //자영 : 에러 (ArrayList<데이터타입> 데이터타입은 객체데이터타입만 가능 
		// 데이터타입은 객체(class)타입
		// 생성 시에 크기 지정x
		
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		// 자영 : ArrayList의 길이 알려면 메소드가 있어야함
		
		
		//자영 : 배열의 길이
		System.out.println("배열의 길이 : " + arr.length);
		
		// 자영 : ArrayList 길이 - size()
		System.out.println("ArrayList의 길이 : " + arrList.size()); //자영 : ArrayList는 가변 길이!! 넣으면 넣는대로 길이 변한다!!!
		
		
		// 2. 값을 추가
		// 배열
		arr[0] = 0;
		arr[1] = 1;
		arr[2] = 2;
		arr[3] = 3;
		arr[4] = 4;
		
		//ArrayList -> 변수명.add(값) : 순차적으로 인덱스에 추가
		//			-> 변수명.add(인덱스, 값) : 원하는 위치에 추가
		arrList.add(0); //자영 : 0은 인덱스번호 아닌 추가할 값!
		arrList.add(1);
		arrList.add(2);
		arrList.add(3);
		arrList.add(4);
		
		System.out.println("값 추가 후 ArrayList 크기 : " + arrList.size());
		
		//자영 : ArrayList 각 인덱스의 값 출력하기
//		System.out.println(arrList.get(0)); //0은 인덱스번호! //객체니까 메서드로 
//		System.out.println(arrList.get(1));
//		System.out.println(arrList.get(2));
//		System.out.println(arrList.get(3));
//		System.out.println(arrList.get(4));
		
		//자영 : for문으로 출력하기
		for(int i = 0 ; i < arrList.size() ; i++) {
			System.out.print(arrList.get(i) + " ");
		}System.out.println();
		
		
		
		// 3. 값 삭제 -> 변수명.remove(인덱스) or 변수명.remove(값)
		arrList.remove(0);//자영 : 0은 인덱스 번호
		
		// 자영 : 0번인덱스 값에 1번 인덱스 값이 이동했는지 확인!!
		System.out.println(arrList.get(0)); //값 조회 -> get(인덱스)
		System.out.println("삭제 후 ArrayList 크기 : " + arrList.size());
			
		arrList.clear(); //값 모두 삭제 ->removeAll() or clear()
		System.out.println("clear 후 ArrayList 크기 : " + arrList.size());
		
		
	}

}
