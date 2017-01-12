package Lecture05.Erica;
/*
 * Problem URL
 * https://www.acmicpc.net/problem/11652
 */

import java.util.Arrays;
import java.util.Scanner;
public class PrintMostHaveCards {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		long [] numArray = new long[N];
		for(int i = 0; i < N; i++)
			numArray[i] = in.nextLong();
		
		Arrays.sort(numArray);
		
		int maxCount = 0, curCount = 0;
		long maxNumber = numArray[0];
		for(int i = 0; i < N; i++)
		{
			curCount++;
			if(i == N - 1 || numArray[i] != numArray[i+1])
			{
				if(curCount > maxCount)
				{
					maxNumber = numArray[i];
					maxCount = curCount;
				}
				curCount = 0;
			}
		}		
		System.out.println(maxNumber);
	}
}