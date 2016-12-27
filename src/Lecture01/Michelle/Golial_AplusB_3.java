package goliath_1;

import java.util.Scanner;

public class Golial_AplusB_3 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int count=0;
		
		while(count<=0)
		{
			System.out.printf("Enter the number of Test Cast");
			count = s.nextInt();
		}
		

		int[] A = new int[count];
		int[] B = new int[count];
		int n =0;
		while(n<count)
		{
			System.out.printf("Enter A(A>0) B(B<10)");
			String a = s.next();
			String b = s.next();
			
			if (a.length()>1 || b.length()>1)
				continue;
			
			byte[] a_a = a.getBytes();
			byte[] b_b = b.getBytes();
			
			int t_a = a_a[0] - '0';
			int t_b = b_b[0] - '0';
			
			
			if (t_a>0 && t_b<10)
			{
				A[n] = t_a;
				B[n] = t_b;
				n++;
			}
		}
		
		int i = 0;
		while(i<n)
		{
			System.out.printf("[A%d[%d] + B%d[%d]  = %d\n", i,A[i], i, B[i], A[i]+B[i]);
			i++;
		}
	}

}
