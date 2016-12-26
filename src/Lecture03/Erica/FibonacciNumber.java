package Lecture03.Erica;
/*
 * Problem URL
 * https://www.acmicpc.net/problem/1003
 */

import java.util.Scanner;
public class FibonacciNumber {
	public static void fibonacci(int number, int[] zero, int[] one) {
		if(number == 1)
		{
			one[number]++;
		}
		else if(number == 0)
		{
			zero[number]++;
		}
		else
		{
			if(zero[number] == 0 && one[number] == 0)
			{
				fibonacci(number-1, zero, one);
				fibonacci(number-2, zero, one);
				zero[number] += zero[number-1];
				one[number] += one[number-1];
			}	
		}
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		for(int i = 0; i < T; i++)
		{
			int number = in.nextInt();
			int [] zero = new int[number+1];
			int [] one = new int[number+1];
			fibonacci(number, zero, one);
			System.out.println(zero[number] + " " + one[number]);
		}
	}
}
