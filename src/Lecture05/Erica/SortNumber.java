package Lecture05.Erica;
/*
 * Problem URL
 * https://www.acmicpc.net/problem/2004
 */

import java.util.Arrays;
import java.util.Scanner;
public class SortNumber {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		
		int [] array = new int[number];
		for(int i = 0; i < number; i++)
			array[i] = in.nextInt();
		
		Arrays.sort(array);
		for(int i = 0; i < number; i++)
			System.out.println(array[i]);
	}
}
