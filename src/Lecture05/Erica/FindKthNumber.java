package Lecture05.Erica;
/*
 * Problem URL
 * https://www.acmicpc.net/problem/11004
 */

import java.util.Arrays;
import java.util.Scanner;
public class FindKthNumber {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int K = in.nextInt();
		
		int [] numArray = new int[N];
		for(int i = 0; i < N; i++)
			numArray[i] = in.nextInt();
		
		Arrays.sort(numArray);
		
		System.out.println(numArray[K-1]);
	}
}