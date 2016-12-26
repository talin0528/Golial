package Lecture02.Erica;
/*
 * Problem URL
 * https://www.acmicpc.net/problem/1158
 */

import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
public class JosephusProblem {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int M = in.nextInt();
		
		Queue<Integer> josephus = new LinkedList<Integer>();
		for(int i = 1; i <= N; i++) //1. init
			josephus.add(i);
		
		System.out.print("<");
		int count = 0;
		while(!josephus.isEmpty()) //2. Print Josephus
		{
			int curNum = josephus.poll();
			if(++count % M == 0)
			{
				System.out.print(curNum);
				if(!josephus.isEmpty())
					System.out.print(", ");
			}
			else
				josephus.add(curNum);
		}
		System.out.println(">");
	}
}
