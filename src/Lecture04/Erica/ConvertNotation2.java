package Lecture04.Erica;
/*
 * Problem URL
 * https://www.acmicpc.net/problem/11005
 */

import java.util.Scanner;
public class ConvertNotation2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int B = in.nextInt();
		
		StringBuilder str = new StringBuilder();
		while(N > 0) {
			int remainder = N % B;
			if(remainder >= 10)
			{
				char curChar = (char) (remainder - 10 + 'A');
				str.append(curChar);
			}
			else
				str.append(remainder);
			
			N /= B;
		}
		System.out.println(str.reverse().toString());
	}
}
