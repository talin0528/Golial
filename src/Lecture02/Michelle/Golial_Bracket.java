package Lecture02.Michelle;  //test
import java.util.*;

public class Golial_Bracket {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		Stack<String> stack = new Stack<String>();
		
		Scanner br = new Scanner(System.in);
		while(n-->0)
		{
			String bracket = br.nextLine();
			int c = bracket.length();
			int C = c;
			while(c-->0)
				stack.push(bracket.substring(c, c+1));

			c++;
			String p_s;
			Stack<String> stack_t = new Stack<String>();
			
			while(c++<C)
			{
				p_s = stack.pop();
				if (p_s.equals("("))
					stack_t.push(p_s);
				else if (p_s.equals(")"))
				{
					String ps_t  = stack_t.pop();
					if (ps_t.length()<1)
					{
						System.out.println("NOT OK");
						break;
					}
				}
			}
			
			if (!stack_t.isEmpty())
				System.out.println("NOT OK");
			else 
				System.out.println("OK");
		}
	}

}
