package Lecture03.Erica;
/*
 * Problem URL
 * https://www.acmicpc.net/problem/11057
 */

import java.util.Scanner;
public class AscentNumber {
	public static final int MOD = 10007;
	public static final int NUM_COUNT = 10;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int number = in.nextInt();
		
		int[][] p = new int[number+1][NUM_COUNT];
		for(int i = 0; i < NUM_COUNT; i++)
			p[1][i] = 1;
		
		for(int i = 2; i <= number; i++)
		{
			for(int j = 0; j < NUM_COUNT; j++)
			{
				for(int k = 0; k <= j; k++)
				{
					p[i][j] = (p[i][j] + p[i-1][k]) % MOD;
				}
			}
		}
		
		int ascentNum = 0;
		for(int i = 0; i < NUM_COUNT; i++)
			ascentNum = (ascentNum + p[number][i]) % MOD;
		System.out.println(ascentNum);

	}
}
