package Lecture02;
/*
 * Problem URL
 * https://www.acmicpc.net/problem/9012
 */

import java.util.Scanner;
public class ValidParenthesisString {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		in.nextLine(); //"\n"
		for(int i = 0; i < T; i++)
		{
			String str = in.nextLine();			
			int count = 0;
			for(int strIdx = 0; strIdx < str.length(); strIdx++)
			{
				if(str.charAt(strIdx) == '(')
				{
					count++;
				}
				else
				{
					count--;
					if(count < 0)
						break;
				}
			}
			
			if(count == 0)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}
}
