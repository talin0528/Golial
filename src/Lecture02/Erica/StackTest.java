package Lecture02.Erica;
/*
 * Problem URL
 * https://www.acmicpc.net/problem/10828
 */

import java.util.Scanner;
import java.util.Stack;

public class StackTest {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Stack<String> st = new Stack<String>();
		int num = Integer.parseInt(in.nextLine());
		for(int i = 0; i < num; i++)
		{
			String[] arrStr = in.nextLine().split(" ");
			if(arrStr[0].equals("push"))
			{
				st.push(arrStr[1]);
			}
			else if(arrStr[0].equals("pop"))
			{
				if(st.empty())
					System.out.println(-1);
				else
					System.out.println(st.pop());
			}
			else if(arrStr[0].equals("size"))
			{
				System.out.println(st.size());
			}
			else if(arrStr[0].equals("empty"))
			{
				if(st.empty())
					System.out.println(1);
				else
					System.out.println(0);
			}
			else // top
			{
				if(st.empty())
					System.out.println(-1);
				else
					System.out.println(st.peek());
			}
		}
	}
}
