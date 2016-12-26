/*
 * Problem URL
 * https://www.acmicpc.net/problem/8393
 */
import java.util.Scanner;

public class MinMax {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int count = in.nextInt();
		int min = 1000000;
		int max = -1000000;
		for(int i = 0; i < count; i++)
		{
			int num = in.nextInt();
			min = Math.min(min, num);
			max = Math.max(max, num);
		}
		System.out.println(min + " " + max);
	}
}
