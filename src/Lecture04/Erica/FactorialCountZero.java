package Lecture04.Erica;
/*
 * Problem URL
 * https://www.acmicpc.net/problem/1676
 */

import java.util.Scanner;
public class FactorialCountZero {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		int count = 0;
		for(int i = 1; i <= number; i++)
		{
			if(i % 5 == 0)
			{
				int fiveCount = 0;
				int curNum = i;
				while(curNum % 5 == 0)
				{
					fiveCount++;
					curNum /= 5;
				}
				count += fiveCount;
			}
		}
		
		System.out.println(count);
	}
}
