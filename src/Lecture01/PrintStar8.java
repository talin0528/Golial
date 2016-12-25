/*
 * Problem URL
 * https://www.acmicpc.net/problem/2445
 */
import java.util.Scanner;

public class PrintStar8 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		for(int i = 1; i <= num; i++)
		{
			for(int j = 1; j <= i; j++)
				System.out.print("*");
			
			int blankCount = (num - i) * 2;
			for(int j = 1; j <= blankCount; j++)
				System.out.print(" ");
			
			for(int j = 1; j <= i; j++)
				System.out.print("*");
			
			System.out.println();
		}
		for(int i = 1; i < num; i++)
		{
			int starCount = num - i;
			for(int j = 1; j <= starCount; j++)
				System.out.print("*");
			
			int blankCount = i * 2;
			for(int j = 1; j <= blankCount; j++)
				System.out.print(" ");
			
			for(int j = 1; j <= starCount; j++)
				System.out.print("*");
			
			System.out.println();
		}
	}
}
