package day08;

public class Ex05forEach {

	public static void main(String[] args) {

		//2행 * 3열 2차원 배열
		String [][] list = { {"박병관", "황해도", "정봉균" }, 
							 {"선영표", "최영화", "김미희" } };
		//for문 2개로 꺼낼 수 있음
		//배열 안에 있는 모든 데이터  다 접근한다면? ->for each 사용 편리!
		
		for(String [] names : list) {
			for(String name : names) {
				System.out.print(name + " ");
			}
			System.out.println();
			
		}
		
		
		
	}

}
