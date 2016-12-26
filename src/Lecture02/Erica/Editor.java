package Lecture02.Erica;
/*
 * Problem URL
 * https://www.acmicpc.net/problem/1406
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
public class Editor {
	public static void main(String[] args) throws IOException {
		BufferedReader bufReader = new BufferedReader(new InputStreamReader(System.in)); // prevent time over
		
		Stack<Character> left = new Stack<Character>();
		Stack<Character> right = new Stack<Character>();
		
		String str = bufReader.readLine();
		for(int i = 0; i < str.length(); i++)
			left.push(str.charAt(i));
		
		int count = Integer.parseInt(bufReader.readLine());
		for(int i = 0; i < count; i++)
		{
			String command = bufReader.readLine();
			char firstCommand = command.charAt(0);
			if(firstCommand == 'L')
			{
				if(!left.isEmpty())
					right.push(left.pop());
			}
			else if(firstCommand == 'D')
			{
				if(!right.isEmpty())
					left.push(right.pop());
			}
			else if(firstCommand == 'B')
			{
				if(!left.isEmpty())
					left.pop();
			}
			else
			{
				left.push(command.charAt(2));
			}
		}
		
		while(!left.isEmpty())
			right.push(left.pop());
		
		StringBuilder sb = new StringBuilder();
		while(!right.isEmpty())
			sb.append(right.pop());
		System.out.println(sb.toString());

//		while(!right.isEmpty()) //Wrong Answer
//			System.out.print(right.pop());
//		System.out.println();
	}
}
