package com.christopherneedham.week34;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

	public class Lists {

		static void createList(int endNum) {
			// Write your code in this method
			
			List<Integer> number = new ArrayList<Integer>();
			for(int i = 0;i < endNum;i++){
			    number.add (++i);
			    i--;
			}
			System.out.println(number);
			
			
			
		}

		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			int endNum = in.nextInt();
			
			createList(endNum);
	}
	
}

