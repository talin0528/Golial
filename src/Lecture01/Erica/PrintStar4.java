package Lecture01.Erica;
/*
 * Problem URL
 * https://www.acmicpc.net/problem/2441
 */
import java.util.Scanner;

public class PrintStar4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		for(int i = 1; i <= num; i++)
		{
			for(int j = i; j > 1; j--)
				System.out.print(" ");
			
			for(int j = i; j <= num; j++)
				System.out.print("*");
			System.out.println();
		}
	}
}
