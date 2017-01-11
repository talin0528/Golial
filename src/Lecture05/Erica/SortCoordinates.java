package Lecture05.Erica;
/*
 * Problem URL
 * https://www.acmicpc.net/problem/11650
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
public class SortCoordinates {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int number = in.nextInt();
		ArrayList<Pair<Integer, Integer>> coordinate = new ArrayList<Pair<Integer, Integer>>();
		for(int i = 0; i < number; i++)
		{
			int x = in.nextInt();
			int y = in.nextInt();
			coordinate.add(new Pair<Integer, Integer>(x, y));
		}
		
		Collections.sort(coordinate, new Comparator<Pair<Integer, Integer>>() {
		    @Override
		    public int compare(final Pair<Integer, Integer> o1, final Pair<Integer, Integer> o2) {
		        if(o1.getX() > o2.getX())
		        	return 1;
		        else if(o1.getX() == o2.getX() && o1.getY() > o2.getY())
		        	return 1;
		        else if(o1.getX() == o2.getX() && o1.getY() == o2.getY())
		        	return 0;
		        else
		        	return -1;
		    }
		});
		
		for(int i = 0; i < number; i++)
			System.out.println(coordinate.get(i).getX() + " " + coordinate.get(i).getY());
	}
}

class Pair<X, Y> {
	private X x;
	private Y y;
	
	public Pair(X x, Y y) {
		this.x = x;
		this.y = y;
	}

	public void setX(X x) { this.x = x; }
	public void setY(Y y) { this.y = y; }
	
	public X getX() { return x; }
	public Y getY() { return y; }
}