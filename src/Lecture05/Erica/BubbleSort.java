package Lecture05.Erica;
/*
 * Problem URL
 * https://www.acmicpc.net/problem/1377
 */

import java.util.Scanner;
public class BubbleSort {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		
		long [] A = new long[N+1];
		for(int i = 1; i <= N; i++)
			A[i] = in.nextInt();
		
		System.out.println(sortCount(A, N));
	}
	
	public static int sortCount(long [] A, int N) {
		int count = 0, sameNumber = 0;
		for (int i = 1; i <= N; i++){
			if(i == N)
				count++;
			else if(A[i] == A[i+1])
				sameNumber++;
			else if(A[i] > A[i+1])
			{
				count += sameNumber + 1;
				sameNumber = 0;
			}
		}
		return count;
	}
}
