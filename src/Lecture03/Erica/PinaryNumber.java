package Lecture03.Erica;
/*
 * Problem URL
 * https://www.acmicpc.net/problem/2193
 */

import java.util.Scanner;
public class PinaryNumber {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int number = in.nextInt();
		long prev01 = 1, prev02 = 1;
		long pinaryNumber = 0;
		for(int i = 1; i <= number; i++)
		{
			if(i == 1)
				pinaryNumber = prev02;
			else if(i == 2)
				pinaryNumber = prev01;
			else
			{
				pinaryNumber = prev01 + prev02;
				prev02 = prev01;
				prev01 = pinaryNumber;
			}
		}
		
		System.out.println(pinaryNumber);
	}
}
