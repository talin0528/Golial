package Extra.Erica;
/*
 * Problem URL
 * https://www.acmicpc.net/problem/1159
 */

import java.util.Scanner;
public class Trainer {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int number = Integer.parseInt(in.nextLine());
		final int ALPHA_COUNT = 26;
		int [] alphabetArr = new int[ALPHA_COUNT];
		for(int i = 0; i < number; i++) {
			final int index = in.nextLine().charAt(0) - 'a';
			alphabetArr[index]++;
		}

		boolean hasMember = false;
		for(int i = 0; i < ALPHA_COUNT; i++) {
			if(alphabetArr[i] >= 5) {
				final char curAlphabet = (char) (i + 'a');
				System.out.print(curAlphabet);
				hasMember = true;
			}
		}
		
		if(hasMember == false)
			System.out.print("PREDAJA");
		System.out.println();
	}
}
