package goliath_1;

import java.util.Scanner;

public class Golial_AplusB_1 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int A = 0;
		int B = 10;
		while(A<=0 || B>=10)
		{
			System.out.printf("Enter a number(A>0)");
			A = s.nextInt();
			System.out.printf("Enter a number(B<10)");
			B = s.nextInt();
		}
		
		System.out.printf("A[%d] + B[%d]  = %d", A, B, A+B);
	}
}
