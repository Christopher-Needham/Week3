package com.christopherneedham.week34;


public class ArraysandMethods{
	
	//7.
	public static String  concatString(String word, int n) {
		
		String newWord = " ";
		for(int i = 0;i < n;i++) {
			newWord = word + newWord;
		}
		return newWord;
	}
	//8.
	public static String makeFullName(String firstName, String lastName) {
		return firstName + " " + lastName;
	}
	//9.
	public static boolean checkInt(int myArray[]) {
		int sum = 0;
		int x = myArray.length;
		int[] newArray = new int[x];
		for(int i = 0; i < myArray.length;i++) {
			newArray[i] = myArray[i];
		}
		for(int i = 0; i < newArray.length;i++) {
			sum = sum + newArray.length;
		}
		if (sum >= 99) {
			return false;
		}else {
			return true;
		}
	}
	//10
	public static double averageNumbers(double a, double b, double c, double d) {
		return (a + b + c + d) / 4;
	}
	//11
	public static boolean compareArrays(double myArray1[], double myArray2[]) {
		double sum = 0.0;
		double sum1 = 0.0;
		for(int i = 0;i < myArray1.length;i++) {
			sum += myArray1[i];
		}
		for(int i = 0;i < myArray2.length;i++) {
			sum1 += myArray2[i];
		}
		if(sum1 > sum) {
			return true;
		}else {
			return false;
		}
	}
	//12
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		if(isHotOutside == true && moneyInPocket > 10.50) {
			return true;
		}else {
			return false;
		}
	}
	//13
	public static String makeLouder(String word, boolean isAngry) {
		if(isAngry == false) {
			return word.toLowerCase();
		}else {
			return word.toUpperCase();
		}
		
		
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
//		
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
		System.out.println(concatString("hello", 3));
		
		//8.	Write a method that takes two Strings, firstName and lastName, and returns a full name 
		//  	(the full name should be the first and the last name as a String separated by a space).
		
		System.out.println(makeFullName("Tom", "Brady"));
		
		//9.	Write a method that takes an array of int and returns true if the sum of all the ints 
		//		in the array is greater than 100.
		
		System.out.println(checkInt(ages2));
		
		//10.	Write a method that takes an array of double and returns the average 
		//		of all the elements in the array.
		
		System.out.println(averageNumbers(3.29, 6.41, 12.81, 8.99));
		
		//11.	Write a method that takes two arrays of double and returns true if the average of the 
		//		elements in the first array is greater than the average of the elements in the second 
		//		array.
		
		double[] doubleArray = new double[6];
		doubleArray[0] = 1.25;
		doubleArray[1] = 2.25;
		doubleArray[2] = 3.00;
		doubleArray[3] = 5.00;
		doubleArray[4] = 6.75;
		doubleArray[5] = 0.05;
		
		double[] doubleArray2 = new double[7];
		doubleArray2[0] = 1.25;
		doubleArray2[1] = 1.45;
		doubleArray2[2] = 3.25;
		doubleArray2[3] = 4.45;
		doubleArray2[4] = 5.00;
		doubleArray2[5] = 0.10;
		doubleArray2[6] = 1.25;
		
		System.out.println(compareArrays(doubleArray, doubleArray2));
		
		//12.	Write a method called willBuyDrink that takes a boolean isHotOutside, and a double 
		//		moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
		boolean isHotOutside = true;
		double moneyInPocket = 9.20;
		System.out.println(willBuyDrink(isHotOutside, moneyInPocket));
		
		//13. Converts all letters to an upper case format in a string if isAngry is true
		boolean isAngry = false;
		String shouting = "leave me alone!";
		System.out.println(makeLouder(shouting, isAngry));
		
	}
		
}