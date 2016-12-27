package goliath_1;

import java.util.Scanner;

public class Golial_MinMax {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int c = s.nextInt();
		int min=1000000, max=1;
		
		while(c--> 0)
		{
			String in = s.next();
			int i = Golial_2007Y.AtoI(in);
			
			if (i<min)
				min = i;
			if (i>max)
				max = i;
			
		}
		
		System.out.printf("%d %d", min, max);
	}

}
