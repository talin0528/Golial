package Lecture02.Erica;

import java.util.Scanner;

/*
 * Problem URL
 * https://www.acmicpc.net/problem/10809
 */
public class FindAlphabet {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int [] alphabet = new int[26];
		
		for(int i = 0; i < alphabet.length; i++)
			alphabet[i] = -1; //1. init array
		
		String str = in.nextLine();
		for(int i = 0; i < str.length(); i++)
		{
			int curIdx = str.charAt(i) - 'a';
			if(alphabet[curIdx] == -1)
				alphabet[curIdx] = i; //2. find alphabet
		}
		
		for(int i = 0; i < alphabet.length; i++)
			System.out.print(alphabet[i] + " "); //3. print alphabet
		System.out.println();
	}
}
