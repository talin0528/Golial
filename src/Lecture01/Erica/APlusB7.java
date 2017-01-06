package Lecture01.Erica;
/*
 * Problem URL
 * https://www.acmicpc.net/problem/11021
 */

import java.util.Scanner;
public class APlusB7 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testCase = in.nextInt();
		for(int i = 1; i <= testCase; i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			System.out.println("Case #"+i+": "+(a+b));
		}
	}
}