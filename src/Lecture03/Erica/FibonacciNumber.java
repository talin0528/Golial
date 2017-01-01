package Lecture03.Erica;
/*
 * Problem URL
 * https://www.acmicpc.net/problem/1003
 */

import java.util.Scanner;
public class FibonacciNumber {
	public static int countZeroAndOne(int [] zero, int [] one, int [] d, int number)
	{
		if(number == 0)
		{
			zero[number] = 1;
			d[number] = 0;
			return 0;
		}
		else if(number == 1)
		{
			one[number] = 1;
			d[number] = 1;
			return 1;
		}
		else
		{
			if(d[number] > 0)
				return d[number];
			
			d[number] = countZeroAndOne(zero, one, d, number-1) + countZeroAndOne(zero, one, d, number-2);
			zero[number] = zero[number - 1] + zero[number - 2];
			one[number] = one[number - 1] + one[number - 2];
			
			return d[number];
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
			int [] d = new int[number+1];
			countZeroAndOne(zero, one, d, number);
			System.out.println(zero[number] + " " + one[number]);
		}
	}
	
}
