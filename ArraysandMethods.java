package com.christopherneedham.week34;


public class ArraysandMethods{
	
	
	public static String stringConcat(String word, int n) {
		
		String newWord = " ";
		if(int i = 0;i < n;i++) {
			newWord = word + newWord;
		}
		return newWord;
	}

	public static void main(String[] args) {
			// TODO Auto-generated method stub
		//1. Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
		int[] ages = new int[8];
		ages[0] = 3;
		ages[1] = 9;
		ages[2] = 23;
		ages[3] = 64;
		ages[4] = 2;
		ages[5] = 8;
		ages[6] = 28;
		ages[7] = 93;
		//a.  Programmatically subtract the value of the first element in the array from the 
		//    value in the last element of the array (i.e. do not use ages[7] in your code). Print the 
		//    result to the console.
		
		System.out.println(ages[ages.length - 1] - ages[0]);
		//b.	Add a new age to your array and repeat the step above to ensure 
		//      it is dynamic (works for arrays of different lengths).
		
		int[] ages2 = new int[ages.length + 1];
		for(int i = 0;i < ages.length;i++) {
			ages2[i] = ages[i];
		}
		ages2[8] = 27;
		System.out.println(ages2[ages2.length - 1] - ages2[0]);
		//c. Use a loop to iterate through the array and calculate the average age.
        //	 Print the result to the console.
		int x = 0;
		for(int i = 0;i < ages2.length;i++) {
			x = x + ages2[i];
		}
		System.out.println(x / ages2.length + " is the average age!");
		
		//2.	Create an array of String called names that contains the following values: 
		//		“Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
		
		String[] names = new String[6];
		names[0] = "Sam";
		names[1] = "Tommy";
		names[2] = "Tim";
		names[3] = "Sally";
		names[4] = "Buck";
		names[5] = "Bob";
		
		
		//a.	Use a loop to iterate through the array and calculate the 
		//		average number of letters per name. Print the result to the console.
		
		int temp = 0;
		for(int i = 0;i < names.length;i++) {
			temp = names[i].length() + temp;
		}
		System.out.println(temp / names.length);
		
		//b.	Use a loop to iterate through the array again and 
		//		concatenate all the names together, separated by spaces, and print the result to the console.
		
		String namesConcat = "";
		for(int i = 0; i < names.length;i++) {
			namesConcat = namesConcat.trim() + " " + names[i];
		}
		System.out.println(namesConcat);
		
		//3.	How do you access the last element of any array?
		System.out.println(names[names.length - 1]);
		
		//4.	How do you access the first element of any array?
		System.out.println(names[0]);
		
		//5.	Create a new array of int called nameLengths. Write a loop to iterate over the previously 
		//		created names array and add the length of each name to the nameLengths array.
		
		
		int[] nameLength = new int[names.length];
		for(int i = 0;i<names.length;i++) {
			nameLength[i] = names[i].length();
			System.out.println(nameLength[i]);
		}
		
		//6.	Write a loop to iterate over the nameLengths array and calculate the sum of all the 
		//		elements in the array. Print the result to the console.
		
		int nameLengthValue = 0;
		for(int i = 0;i < nameLength.length;i++) {
			nameLengthValue = nameLengthValue + nameLength[i];
		}
		System.out.println(nameLengthValue);
		
		//7.	Write a method that takes a String, word, and an int, n, as arguments and returns the 
		//		word concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, I expect 
		//		the method to return “HelloHelloHello”).
		
		
	}
		
}