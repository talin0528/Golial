package Lecture02.Erica;
/*
 * Problem URL
 * https://www.acmicpc.net/problem/11656
 */

import java.util.Arrays;
import java.util.Scanner;
public class SuffixArray {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		StringBuilder strBuilder = new StringBuilder(in.nextLine());
		
		int strLength = strBuilder.length();
		String [] strArray = new String[strLength];
		for(int i = 0; i < strLength; i++)
			strArray[i] = strBuilder.substring(i);
		
		Arrays.sort(strArray);
		for(int i = 0; i < strLength; i++)
			System.out.println(strArray[i]);

	}
}
