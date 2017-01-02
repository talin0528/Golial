package Lecture01.Erica;
/*
 * Problem URL
 * https://www.acmicpc.net/problem/2442
 */
import java.util.Scanner;

public class PrintStar5 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		for(int i = 1; i <= num; i++)
		{
			for(int j = i; j < num; j++)
				System.out.print(" ");
			
			int starCount = 2 * i - 1;
			for(int j = 1; j <= starCount; j++)
				System.out.print("*");
			
			System.out.println();
		}
	}
}
