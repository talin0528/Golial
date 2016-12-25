/*
 * Problem URL
 * https://www.acmicpc.net/problem/1924
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Print2007Day {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int month = in.nextInt();
		int date = in.nextInt();
		
		Map<Integer, String> dayMap = new HashMap<Integer, String>();
		String [] dayStr = { "MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN" };
		for(int i = 0; i < dayStr.length; i++)
			dayMap.put(i, dayStr[i]);
		
		int [] monthlyDate = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		
		int totalDate = 0;
		for(int i = 1; i < month; i++)
			totalDate += monthlyDate[i - 1];
		totalDate += (date - 1);
		
		int day = totalDate % 7;
		System.out.println(dayStr[day]);
	}
}
