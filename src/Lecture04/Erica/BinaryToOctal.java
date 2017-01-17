package Lecture04.Erica;
/*
 * Problem URL
 * https://www.acmicpc.net/problem/1373
 */

import java.util.Scanner;
public class BinaryToOctal {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String binaryString = in.nextLine();
		StringBuilder octString = new StringBuilder();
		int endIndex = binaryString.length();
		while(endIndex > 0) {
			int startIndex = Math.max(0, endIndex - 3);
			int count = 0;
			int octNumber = 0;
			for(int i = endIndex - 1; i >= startIndex; i--) {
				int curNumber = binaryString.charAt(i) - '0';
				octNumber += curNumber * Math.pow(2, count);
				count++;
			}
			octString.append(octNumber);
			endIndex -= 3;
		}
		System.out.println(octString.reverse());		
	}
}
