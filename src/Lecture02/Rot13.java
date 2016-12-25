package Lecture02;
/*
 * Problem URL
 * https://www.acmicpc.net/problem/2743
 */
import java.util.Scanner;
public class Rot13 {
	static final int ROT_NUM = 13;
	static final int ALPHA_COUNT = 26;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		StringBuilder changeBuilder = new StringBuilder(str);
		for(int i = 0; i < str.length(); i++)
		{
			char curChar = str.charAt(i);
			if(Character.isAlphabetic(curChar))
			{
				char newChar;
				if(Character.isUpperCase(curChar))
				{
					newChar = (char)((curChar - 'A' + ROT_NUM) % ALPHA_COUNT + 'A');
				}
				else
				{
					newChar = (char)((curChar - 'a' + ROT_NUM) % ALPHA_COUNT + 'a');
				}
				changeBuilder.setCharAt(i, newChar);
			}
		}
		System.out.println(changeBuilder.toString());
	}
}
