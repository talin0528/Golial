/*
 * Problem URL
 * https://www.acmicpc.net/problem/2440
 */
import java.util.Scanner;

public class PrintStar3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		for(int i = 1; i <= num; i++)
		{
			for(int j = i; j <= num; j++)
				System.out.print("*");
			System.out.println();
		}
	}
}
