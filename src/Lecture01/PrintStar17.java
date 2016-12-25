/*
 * Problem URL
 * https://www.acmicpc.net/problem/10992
 */
import java.util.Scanner;

public class PrintStar17 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		for(int i = 1; i <= num; i++)
		{
			for(int j = num - i; j >= 1; j--)
				System.out.print(" ");
			
			int maxCount = 2 * i - 1;
			for(int j = 1; j <= maxCount; j++)
			{
				if(j > 1 && j < maxCount)
				{
					if(i == num)
						System.out.print("*");
					else
						System.out.print(" ");
				}
				else
					System.out.print("*");
			}
			System.out.println();
		}
	}
}
