package Lecture02;
/*
 * Problem URL
 * https://www.acmicpc.net/problem/10866
 */

import java.util.LinkedList;
import java.util.Scanner;

public class DequeueTest {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		LinkedList<String> queue = new LinkedList<String>();
		int num = Integer.parseInt(in.nextLine());
		for(int i = 0; i < num; i++)
		{
			String[] arrStr = in.nextLine().split(" ");
			if(arrStr[0].equals("push_front"))
			{
				queue.addFirst(arrStr[1]);
			}
			else if(arrStr[0].equals("push_back"))
			{
				queue.addLast(arrStr[1]);
			}
			else if(arrStr[0].equals("pop_front"))
			{
				if(queue.isEmpty())
					System.out.println(-1);
				else
					System.out.println(queue.pollFirst());
			}
			else if(arrStr[0].equals("pop_back"))
			{
				if(queue.isEmpty())
					System.out.println(-1);
				else
					System.out.println(queue.pollLast());
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
					System.out.println(queue.getFirst());
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
