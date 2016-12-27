package goliath_1;
import java.util.Scanner;

public class Golial_PrintN {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int n = N;

		while(n-- > 0)
		{
			System.out.println(N - n);
		}
	}

}
