package Lecture03.Erica;
/*
 * Problem URL
 * https://www.acmicpc.net/problem/11053
 */
import java.util.Scanner;
public class LongestSequence {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int number = in.nextInt();
		int [] a = new int[number];
		int [] d = new int[number];
		
		for(int i = 0; i < number; i++)
			a[i] = in.nextInt();
		
		for(int i = 0; i < number; i++)
		{
			d[i] = 1;
			for(int j = 0; j < i; j++)
			{
				if(a[j] < a[i])
					d[i] = Math.max(d[j] + 1, d[i]);
					
			}
		}
		
		int maxLength = 0;
		for(int i = 0; i < number; i++)
		{
			if(maxLength < d[i])
				maxLength = d[i];
		}
		
		System.out.println(maxLength);
	}
}
