package Lecture02.Erica;
/*
 * Problem URL
 * https://www.acmicpc.net/problem/10808
 */

import java.util.Scanner;
public class CountAlphabet {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int [] alphabet = new int[26];
		
		String str = in.nextLine();
		for(int i = 0; i < str.length(); i++)
		{
			alphabet[str.charAt(i) - 'a']++;
		}
		
		for(int i = 0; i < alphabet.length; i++)
		{
			System.out.print(alphabet[i] + " ");
		}
		System.out.println();
	}
}
