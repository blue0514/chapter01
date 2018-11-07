package chapter01;

import java.util.Scanner;

public class PowerOfTwo02 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int result = 1;
	
		System.out.print("승수:");
		
		int power = scanner.nextInt();
		
		
		int i = 0;
		while(i < power) {
			result = result * 2;
			i = i + 1;
		}

		//아래의 for 문을 작성하시오.
		
		
		System.out.println("2의" + power + "제곱근은" + result + "입니다.");
	}

}
