package goliath_1;

import java.util.Scanner;

public class Golial_2007Y {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int M = 0;
		int D = 0;
		
		while(M>12 || D>31 || M==0 || D ==0 )
		{
			String m = s.next();
			String d = s.next();
			M = Golial_2007Y.AtoI(m);
			D = Golial_2007Y.AtoI(d);
		}
		
		String day = Golial_2007Y.getDay(M, D);
		
		System.out.println(day);
	}
	
	static int AtoI(String s)
	{
		int m_len = s.length();
		
		int M = 0;
		if (m_len == 2)
		{
			int M0 = s.charAt(1) - '0';
			int M1 = (s.charAt(0) - '0') * 10;
			M = M1 + M0;
		}
		else if (m_len == 1)
		{
			M = s.charAt(0) - '0';
		}
		
		return M;
	}
	
	static String getDay(int m, int d)
	{
		int[] m_days ={31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; 
		String[] days = {"MON", "TUES", "WEND", "THUR", "FRI", "SAT", "SUN"};
		
		int days_sum = 0;
		int M = m;
		while(m-- >1)
		{
			days_sum += m_days[M-m-1] ;
		}
		days_sum += d;
		
		int target_day = days_sum % 7 - 1;
		
		return days[target_day];
	}

}
