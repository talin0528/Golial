package Lecture02.Erica;
/*
 * Problem URL
 * https://www.acmicpc.net/problem/10809
 */

import java.util.Scanner;
public class FourNumbers {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String [] strArray = in.nextLine().split(" ");
		int AB = Integer.parseInt(strArray[0] + strArray[1]);
		int CD = Integer.parseInt(strArray[2] + strArray[3]);
		System.out.println(AB + CD);
	}

}
