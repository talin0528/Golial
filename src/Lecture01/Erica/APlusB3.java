package Lecture01.Erica;
/*
 * Problem URL
 * https://www.acmicpc.net/problem/10950
 */

import java.util.Scanner;
public class APlusB3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testCase = in.nextInt();
		while(testCase-- > 0) {
			int a = in.nextInt();
			int b = in.nextInt();
			System.out.println(a+b);
		}
	}
}