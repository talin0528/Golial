package Lecture05.Erica;
/*
 * Problem URL
 * https://www.acmicpc.net/problem/10825
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
public class SortBySubjectScore {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int count = Integer.parseInt(in.nextLine());
		ArrayList<SubjectScore> subjectArr = new ArrayList<SubjectScore>();
		for(int i = 0; i < count; i++) {
			String[] strArr = in.nextLine().split(" ");
			subjectArr.add(new SubjectScore(strArr[0], strArr[1], strArr[2], strArr[3]));
		}
		
		Collections.sort(subjectArr, new Comparator<SubjectScore>(){
			@Override
			public int compare(final SubjectScore o1, final SubjectScore o2) {
				if(o1.getKorean() < o2.getKorean())
					return 1;
				else if(o1.getKorean() > o2.getKorean())
					return -1;
				else//(o1.getKorean() == o2.getKorean())
				{
					if(o1.getEnglish() > o2.getEnglish())
						return 1;
					else if(o1.getEnglish() < o2.getEnglish())
						return -1;
					else//(o1.getEnglish() == o2.getEnglish())
					{
						if(o1.getMath() < o2.getMath())
							return 1;
						else if(o1.getMath() > o2.getMath())
							return -1;
						else//(o1.getMath() == o2.getMath())
							return o1.getName().compareTo(o2.getName());
					}
				}
			}
		});
		
		for(int i = 0; i < count; i++)
			System.out.println(subjectArr.get(i).getName());
	}
}

class SubjectScore {
	private String name;
	private int korean;
	private int english;
	private int math;
	
	public SubjectScore(String name, String korean, String english, String math) {
		this.name = name;
		this.korean = Integer.parseInt(korean);
		this.english = Integer.parseInt(english);
		this.math = Integer.parseInt(math);
	}
	
	public String getName() { return name; }
	public int getKorean() { return korean; }
	public int getEnglish() { return english; }
	public int getMath() { return math; }	
}