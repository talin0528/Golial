/*
 * 문제 경로
 * https://www.acmicpc.net/problem/2741
 */

import java.util.Scanner;

public class PrintN {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		for(int i = 1; i <= num; i++)
			System.out.println(i);
	}
}
