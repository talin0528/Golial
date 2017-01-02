package Lecture01.Erica;
/*
 * Problem URL
 * https://www.acmicpc.net/problem/2742
 */

import java.util.Scanner;

public class PrintReverseN {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		for(int i = num; i >= 1; i--)
			System.out.println(i);
	}
}
