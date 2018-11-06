package chapter01;

public class Swap {

	public static void main(String[] args) {
		int n1 = 40;
		int n2 = 30;
		
		
		//Q1: n1값이 항상 큰값이 되도록 만드는 예제
				//  만약 n1값이 작으면 두 값을 교체하는 문제
				if(n1 < n2) {
					// swap
					int temp = n1;
					n1 = n2;
					n2 = temp;
					
				}
				
				System.out.println( "n1:" + n1 );
				System.out.println( "n2:" + n2 );
		
		//Q2: 최대값을 판별하는 조건을 완성해 보세요.
		
		int a1 = 20;
		int a2 = 10;
		int a3 = 50;
		
		if( a1>= a2) {
		} else {
		}

	}

}
