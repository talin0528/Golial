package Lecture05.Erica;
/*
 * Problem URL
 * https://www.acmicpc.net/problem/10989
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
public class SortNumber3 {
	public static final int MAX_COUNT = 10000000;
	public static void main(String[] args) throws IOException {
		BufferedReader bufReader = new BufferedReader(new InputStreamReader(System.in));// prevent time over
		int number = Integer.parseInt(bufReader.readLine());
		int [] numArray = new int[MAX_COUNT+1];
		for(int i = 1; i <= number; i++)
		{
			int index = Integer.parseInt(bufReader.readLine());
			numArray[index]++;
		}
		BufferedWriter bufWriter = new BufferedWriter(new OutputStreamWriter(System.out));
		for(int i = 1; i <= MAX_COUNT; i++)
		{
			for(int j = 0; j < numArray[i]; j++)
				bufWriter.write(Integer.toString(i) + '\n');
		}
		bufWriter.flush();
	}
}