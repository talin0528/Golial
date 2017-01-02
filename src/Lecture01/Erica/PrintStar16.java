package Lecture01.Erica;
/*
 * Problem URL
 * https://www.acmicpc.net/problem/10991
 */
import java.util.Scanner;

public class PrintStar16 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		for(int i = 1; i <= num; i++)
		{
			for(int j = num - i; j >= 1; j--)
				System.out.print(" ");
			
			for(int j = 1; j <= i; j++)
			{
				System.out.print("*");
				if(j != i)
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}
