package Lecture04.Erica;
/*
 * Problem URL
 * https://www.acmicpc.net/problem/1373
 */

import java.util.Scanner;
public class BinaryToOctal {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int decNumber = in.nextInt(2);
		StringBuilder octNumber = new StringBuilder();
		if(decNumber == 0) {
			System.out.println(0);
		}
		else {
			while(decNumber > 0) {
				octNumber.append(decNumber%8);
				decNumber /= 8;
			}
			System.out.println(octNumber.reverse());
		}		
	}
}
