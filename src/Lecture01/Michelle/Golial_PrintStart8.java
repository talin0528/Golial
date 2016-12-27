package goliath_1;

import java.util.Scanner;

public class Golial_PrintStart8 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int n_line = 2*n-1;
		
		for (int i = 1; i<=n_line ; i++)
		{
			int star_c = i%n;
			int ave_flag = 0;
			if (star_c==0)
				ave_flag = 1;
				
			if (i/n >0)
				star_c = i/n*n - star_c; 
					 
			for (int j = 1; j<=star_c ; j++)
				System.out.print("*");
			
			for(int j = star_c+1;j<=n_line-star_c; j++ )
				System.out.print(" ");
			
			
			for (int j = n_line-star_c+1; j<=n_line-ave_flag; j++)
				System.out.print("*");
			System.out.print("\n");
		}
	}
}
