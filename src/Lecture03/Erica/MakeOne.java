package Lecture03.Erica;
/*
 * Problem URL
 * https://www.acmicpc.net/problem/1463
 */
import java.util.Scanner;
public class MakeOne {
	public static int makeMinimumOne(int [] d, int number)
	{
		if(number == 1)
			return 0;
		if(d[number] > 0)
			return d[number];
		
		d[number] = makeMinimumOne(d, number - 1) + 1;
		if(number % 2 == 0)
		{
			int temp = makeMinimumOne(d, number / 2) + 1;
			if(temp < d[number])
				d[number] = temp;
		}
		
		if(number % 3 == 0)
		{
			int temp = makeMinimumOne(d, number / 3) + 1;
			if(temp < d[number])
				d[number] = temp;
		}
		
		return d[number];
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		int [] d = new int [number+1];
			
		System.out.println(makeMinimumOne(d, number));
	}
	
}
