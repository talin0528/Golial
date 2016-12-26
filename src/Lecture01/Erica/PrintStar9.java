/*
 * Problem URL
 * https://www.acmicpc.net/problem/2446
 */
import java.util.Scanner;

public class PrintStar9 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		for(int i = 1; i <= num; i++)
		{
			for(int j = 1; j < i; j++)
				System.out.print(" ");
			
			int starCount = (num - i) * 2 + 1;
			for(int j = 1; j <= starCount; j++)
				System.out.print("*");
			
			System.out.println();
		}
		for(int i = 2; i <= num; i++)
		{
			int blankCount = num - i;
			for(int j = 1; j <= blankCount; j++)
				System.out.print(" ");
			
			int starCount = i * 2 - 1;
			for(int j = 1; j <= starCount; j++)
				System.out.print("*");
			
			System.out.println();
		}
	}
}
