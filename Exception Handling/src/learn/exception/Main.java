package learn.exception;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the dividend ");
		int num1 = sc.nextInt();
		System.out.println("Please enter the divisor ");
		int num2 = sc.nextInt();
		try {
			System.out.println("The answer is "+Div(num1,num2));
		} catch (Exception e) {
			System.out.println("Oops! "+ e.getMessage());
		}
		sc.close();
	}
	
	public static int Div(int dividend, int divisor) {
		if(divisor == 0) {
			throw new ArithmeticException("The number cannot be divided by 0");
		}else {
			return dividend/divisor ;		}
	}
}
	



