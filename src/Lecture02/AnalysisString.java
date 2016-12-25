package Lecture02;
/*
 * Problem URL
 * https://www.acmicpc.net/problem/10820
 */

import java.util.Scanner;
public class AnalysisString {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNextLine())
		{
			int lowerCase = 0, upperCase = 0, number = 0, blank = 0;
			String str = in.nextLine();
			for(int i = 0; i < str.length(); i++)
			{
				char curChar = str.charAt(i);
				if(Character.isDigit(curChar))
					number++;
				else if(Character.isUpperCase(curChar))
					upperCase++;
				else if(Character.isLowerCase(curChar))
					lowerCase++;
				else
					blank++;
			}
			System.out.println(lowerCase+" "+upperCase+" "+number+" "+blank);
		}
	}
}
