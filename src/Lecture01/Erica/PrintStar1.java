package Lecture01.Erica;
/*
 * Problem URL
 * https://www.acmicpc.net/problem/2438
 */
import java.util.Scanner;

public class PrintStar1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		for(int i = 1; i <= num; i++)
		{
			for(int j = 1; j <= i; j++)
				System.out.print("*");
			System.out.println();
		}
	}
}
