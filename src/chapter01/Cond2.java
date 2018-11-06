package chapter01;

public class Cond2 {

	public static void main(String[] args) {
		int a1 = 20;
    	int a2 = 10;
		int a3 = 50;
			
		//Q2: 최대값을 판별하는 조건을 완성해 보세요.
		//output: 최대값은 50입니다.
		//Sol:
		if( a1 > a2) {
			if( a1 > a3 ) {
    System.out.println( "최대값은" + a1 + "입니다." );	
    System.out.println( "최대값은" + a3 + "입니다." );
   			} else {
   				
   			}
		//-> ? a2 <> a3
	}
