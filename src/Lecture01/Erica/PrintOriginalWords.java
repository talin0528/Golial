package Lecture01.Erica;
/*
 * Problem URL
 * https://www.acmicpc.net/problem/11719
 */

import java.util.Scanner;
public class PrintOriginalWords {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNextLine())
		{
			String str = in.nextLine();
			System.out.println(str);
		}
	}
}