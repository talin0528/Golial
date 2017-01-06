package Lecture04.Erica;

/*
 * Problem URL
 * https://www.acmicpc.net/problem/9613
 */

import java.util.Scanner;
public class SumGCD {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testCase = in.nextInt();
		while(testCase-- > 0) {
			int numCount = in.nextInt();
			long [] numArray = new long[numCount];
			for(int i = 0; i < numCount; i++)
				numArray[i] = in.nextLong();
			
			int sumOfGCD = 0;
			for(int i = 0; i < numCount-1; i++) {
				for(int j = i + 1; j < numCount; j++) {
					sumOfGCD += findGCD(numArray[i], numArray[j]);
				}
			}
			System.out.println(sumOfGCD);
		}	
	}
	
	public static long findGCD(long num1, long num2) {
		while(num2 > 0) {
			long remainder = num1 % num2;
			num1 = num2;
			num2 = remainder;
		}		
		return num1;
	}
}
