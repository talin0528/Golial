package Lecture03.Erica;
/*
 * Problem URL
 * https://www.acmicpc.net/problem/11726
 */

import java.util.Scanner;
public class TwoMultiplyNTiling {
	public static final int MOD = 10007;
	
	public static int makeTiling(int[] d, int number)
	{
		if(number <= 1)
			return 1;
		else if(d[number] > 0)
			return d[number];
		else
		{
			d[number] = (makeTiling(d, number - 1) + makeTiling(d, number - 2)) % MOD;
			return d[number];			
		}
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int number = in.nextInt(); // N
		int [] d = new int[number+1];
		System.out.println(makeTiling(d, number));
	}
}
