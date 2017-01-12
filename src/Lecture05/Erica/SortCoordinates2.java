package Lecture05.Erica;
/*
 * Problem URL
 * https://www.acmicpc.net/problem/11651
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
public class SortCoordinates2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int number = in.nextInt();
		ArrayList<Pair> coordinate = new ArrayList<Pair>();
		for(int i = 0; i < number; i++)
		{
			int x = in.nextInt();
			int y = in.nextInt();
			coordinate.add(new Pair(x, y));
		}
		
		Collections.sort(coordinate, new Comparator<Pair>() {
		    @Override
		    public int compare(final Pair o1, final Pair o2) {
		        if(o1.getY() > o2.getY())
		        	return 1;
		        else if(o1.getY() == o2.getY() && o1.getX() > o2.getX())
		        	return 1;
		        else
		        	return -1;
		    }
		});
		
		for(int i = 0; i < number; i++)
			System.out.println(coordinate.get(i).getX() + " " + coordinate.get(i).getY());
	}
}

class Pair {
	private int x;
	private int y;
	
	public Pair(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() { return x; }
	public int getY() { return y; }
}