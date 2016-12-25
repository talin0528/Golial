/*
 * Problem URL
 * https://www.acmicpc.net/problem/8393
 */
import java.util.Scanner;

public class PrintSum {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int num = in.nextInt();
		int sum = num * (num + 1) / 2;
		System.out.println(sum);
	}

}
