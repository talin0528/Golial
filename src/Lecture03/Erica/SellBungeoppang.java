package Lecture03.Erica;
/*
 * Problem URL
 * https://www.acmicpc.net/problem/11052
 */

import java.util.Scanner;
public class SellBungeoppang {
	public static int maxProfit(int [] d, int [] p, int number) {
		if(number <= 1)
		{
			d[number] = p[number];
			return d[number];
		}
		else if(d[number] > 0)
			return d[number];
		else
		{
			for(int i = 1; i <= number; i++)
				d[number] = Math.max(d[number], maxProfit(d, p, number - i) + p[i]);

			return d[number];			
		}		
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		int [] d = new int [number + 1];
		int [] p = new int [number + 1];
		for(int i = 1; i <= number; i++)
			p[i] = in.nextInt();
		
		System.out.println(maxProfit(d, p, number));
		
	}
}
