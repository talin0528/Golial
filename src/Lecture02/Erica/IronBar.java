package Lecture02.Erica;
/*
 * Problem URL
 * https://www.acmicpc.net/problem/10799
 */

import java.util.Scanner;
import java.util.Stack;
public class IronBar {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String iron = in.nextLine();
		int pieceCount = 0;
		Stack<Integer> st = new Stack<Integer>();
		for(int i = 0; i < iron.length(); i++)
		{
			char curChar = iron.charAt(i);
			if(curChar == '(')
			{
				st.push(i);
			}
			else
			{
				int openIdx = st.pop();
				if(i - openIdx <= 1)
					pieceCount += st.size();
				else
					pieceCount += 1;
			}
		}
		System.out.println(pieceCount);
	}
}
