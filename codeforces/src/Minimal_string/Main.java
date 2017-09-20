package Minimal_string;

import java.io.*;
import java.util.*;

public class Main  {
	
	static class ProblemSolver{
		public void solveTheProblem(String ss){
			char[] s=ss.toCharArray();
			Stack<Character> t=new Stack<>();
			Stack<Character> u=new Stack<>();
			int n=s.length;
			char[] minimumTillThatIndex=new char[n];
			minimumTillThatIndex[n-1]=s[n-1];
			for(int i=n-2;i>=0;--i)
				minimumTillThatIndex[i]=(char)Math.min(minimumTillThatIndex[i+1],s[i]);
			

			for(int i=0;i<n;++i){
				
				while(!t.isEmpty() && t.peek()<=minimumTillThatIndex[i]){
					u.push(t.pop());
				}
				
				if(s[i]==minimumTillThatIndex[i])
					u.push(s[i]);
				else
					t.push(s[i]);
			}
			
			while(!t.isEmpty())
				u.push(t.pop());
			
			for(int i=n-1;i>=0;--i)s[i]=u.pop();
			System.out.print(new String(s));
		}
	}
	
	public static void main(String... strings) throws Exception{
		BufferedReader asd = new BufferedReader(new InputStreamReader(System.in));

		ProblemSolver problemSolver=new ProblemSolver();
		problemSolver.solveTheProblem(asd.readLine().trim());
	}
	
}
