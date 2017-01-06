package Lecture01.Erica;
/*
 * Problem URL
 * https://www.acmicpc.net/problem/10953
 */

import java.util.Scanner;
public class APlusB6 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testCase = Integer.parseInt(in.nextLine());
		while(testCase-- > 0) {
			String [] numArray = in.nextLine().split(",");
			int a = Integer.parseInt(numArray[0]);
			int b = Integer.parseInt(numArray[1]);
			System.out.println(a+b);
		}
	}
}