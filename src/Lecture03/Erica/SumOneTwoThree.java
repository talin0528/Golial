package Lecture03.Erica;
/*
 * Problem URL
 * https://www.acmicpc.net/problem/9095
 */

import java.util.Scanner;
public class SumOneTwoThree {
	public static int setOfOneTwoThree(int [] d, int number)
	{
		if(number <= 1)
			return 1;
		else if(number == 2)
			return 2;
		else
		{
			if(d[number] > 0)
				return d[number];
			
			d[number] = setOfOneTwoThree(d, number-1) + setOfOneTwoThree(d, number-2) + setOfOneTwoThree(d, number-3);
			return d[number];
		}
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testCase = in.nextInt(); //T
		while(testCase-- > 0)
		{
			int number = in.nextInt(); //N
			int [] d = new int[number+1];
			System.out.println(setOfOneTwoThree(d, number));
		}
	}
}
