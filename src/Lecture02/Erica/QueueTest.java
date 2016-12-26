package Lecture02;
/*
 * Problem URL
 * https://www.acmicpc.net/problem/10845
 */

import java.util.Scanner;
import java.util.LinkedList;
public class QueueTest {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		LinkedList<String> queue = new LinkedList<String>();
		int num = Integer.parseInt(in.nextLine());
		for(int i = 0; i < num; i++)
		{
			String[] arrStr = in.nextLine().split(" ");
			if(arrStr[0].equals("push"))
			{
				queue.add(arrStr[1]);
			}
			else if(arrStr[0].equals("pop"))
			{
				if(queue.isEmpty())
					System.out.println(-1);
				else
					System.out.println(queue.poll());
			}
			else if(arrStr[0].equals("size"))
			{
				System.out.println(queue.size());
			}
			else if(arrStr[0].equals("empty"))
			{
				if(queue.isEmpty())
					System.out.println(1);
				else
					System.out.println(0);
			}
			else if(arrStr[0].equals("front"))
			{
				if(queue.isEmpty())
					System.out.println(-1);
				else
					System.out.println(queue.peek());
			}
			else //back
			{
				if(queue.isEmpty())
					System.out.println(-1);
				else
					System.out.println(queue.getLast());
			}
		}
	}
}
