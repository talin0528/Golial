package Lecture04.Erica;
/*
 * Problem URL
 * https://www.acmicpc.net/problem/10430
 */

import java.util.Scanner;
public class Remainder {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int A = in.nextInt();
		int B = in.nextInt();
		int C = in.nextInt();
		
		int AplusB = (A + B) % C;
		int AmultiB = (A * B) % C;
		System.out.println(AplusB+"\n"+AplusB+"\n"+AmultiB+"\n"+AmultiB);
	}
}
