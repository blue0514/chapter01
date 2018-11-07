package chapter01;

import java.util.Scanner;

public class WhileTest2 {

	public static void main(String[] args) {
		

		int total = 0;
		int value = -1;
		
		while(true) {
			System.out.println("숫자입력[0 to quit]:");
		    
			Scanner scanner = new Scanner(System.in);
		    value = scanner.nextInt();
		    if( value == 0 ) {
		     break;
		    }
		     total += value;
		      		
		}
	}

}
