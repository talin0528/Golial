package Lecture04.Erica;
/*
 * Problem URL
 * https://www.acmicpc.net/problem/2004
 */

import java.util.Scanner;
public class CombinationCountZero {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		
		long zeroCount = 0;
		if(n > m && m != 0)
		{
			long fiveCount = countPrimeFactor(n, 5) - countPrimeFactor(m, 5) - countPrimeFactor(n-m, 5);
			long twoCount = countPrimeFactor(n, 2) - countPrimeFactor(m, 2) - countPrimeFactor(n-m, 2);
			zeroCount = Math.min(fiveCount, twoCount);
		}
	
		System.out.println(zeroCount);
	}
	
	public static long countPrimeFactor(long number, long factor) {
		long count = 0;
		for(long i = factor; i <= number; i*=factor)
			count += number/i;		
		return count;
	}
}