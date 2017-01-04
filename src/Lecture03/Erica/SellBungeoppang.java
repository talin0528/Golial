package Lecture03.Erica;
/*
 * Problem URL
 * https://www.acmicpc.net/problem/2193
 */

import java.util.Scanner;
public class SellBungeoppang {
	public static int maxProfit(int [] d, int [] p, int number) {
		if(number == 1)
		{
			d[number] = p[number];
			return d[number];
		}
		else if(d[number] > 0)
			return d[number];
		else
		{
			int maximum = 0;
			for(int i = 1; i < number; i++)
				maximum = Math.max(maximum, maxProfit(d, p, number - i) + p[i]);
			maximum = Math.max(maximum, p[number]);
			
			d[number] = maximum;
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
		
		maxProfit(d, p, number);
		System.out.println(d[number]);
	}
}
