package Lecture05.Erica;
/*
 * Problem URL
 * https://www.acmicpc.net/problem/10814
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
public class SortByAge {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int number = Integer.parseInt(in.nextLine());
		ArrayList<User> userList = new ArrayList<User>();
		for(int i = 0; i < number; i++) {
			String [] strArr = in.nextLine().split(" ");
			userList.add(new User(Integer.parseInt(strArr[0]), strArr[1]));
		}
		
		Collections.sort(userList, new Comparator<User>(){
			@Override
			public int compare(final User o1, final User o2) {		
				if(o1.getAge() > o2.getAge())
					return 1;
				else if(o1.getAge() == o2.getAge())
					return 0;
				else
					return -1;
			}
		});
		
		for(int i = 0; i < number; i++)
			System.out.println(userList.get(i).toString());
	}
}

class User {
	private int age;
	private String name;
	
	public User(int age, String name) {
		this.age = age;
		this.name = name;
	}
	
	public int getAge(){ return age; }
	public String getName(){ return name; }
	
	@Override
	public String toString() {
		String str = age + " " + name;
		return str;
	}
}