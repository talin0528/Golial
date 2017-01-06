package Lecture04.Erica;
/*
 * Problem URL
 * https://www.acmicpc.net/problem/2609
 */

import java.util.Scanner;
public class GCDAndLCM {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num1 = in.nextInt();
		int num2 = in.nextInt();
		
		int GCD = findGCD(num1, num2);
		int LCM = num1 * num2 / GCD;
		System.out.println(GCD+"\n"+LCM);
	}
	
	public static int findGCD(int num1, int num2) {
		while(num2 > 0) {
			int remainder = num1 % num2;
			num1 = num2;
			num2 = remainder;
		}		
		return num1;
	}	
}