package com.promineotech;

public class CodingProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
		
		//1a. Subtract the value of the first element in the array from 
		//    the value in the last element of the array without directly referring to the index. 
		//    Print the result to the console.  
		
		//Creating a new array
		int[] ages = new int[]{3, 9, 23, 64, 2, 8, 28, 93}; 
		
		//Getting the length of the array
		int length = ages.length; 
		
		// Finding the sum of the first and last element in the array.
		// We can find the last element by subtracting 1 from the length.
		int sum = ages[0] + ages[length - 1]; 
		
		//Printing the result to the console.
		System.out.println("Sum of first and last ages in first array = " + sum); 
		
		/*---------------------------------------------------*/
		
		//1b. Create a new array of int called ages2 with 9 elements 
		//    (ages2 will be longer than the ages array, and have more elements).  
		
		// i. Make sure that there are 9 elements of type int in this new array.  
		
		System.out.println();
		
		// Creating a new array with 9 elements.
		int[] ages2 = new int[]{4, 7, 43, 89, 23, 69, 90, 105, 263}; 
		
		/*-----------------------*/
		
		// ii. Repeat the subtraction from Step 1.a. 
		
		 //Getting the length of the array
		int length2 = ages2.length;
		
		//Finding the sum of the first and last element in the array.
		int sum2 = ages2[0] + ages2[length2 - 1]; 
		
		//Printing the result to the console.
		System.out.println("Sum of first and last ages in second array = " + sum2); 
		
		/*-----------------------*/
		
		//iii. Show that using the index values for the elements is dynamic (works for arrays of different lengths).
		
		System.out.println();
		
		// Creating a new array with 12 elements
		int[] ages3 = new int[] {7, 45, 23, 73, 20, 15, 19, 30, 42, 92, 54, 30}; 
		
		//Getting the length of the array
		int length3 = ages3.length; 
		
		//Finding the sum of the first and last element in the array.
		int sum3 = ages3[0] + ages3[length3 -1]; 
		
		//Printing the result to the console.
		System.out.println("Sum of first and last ages in third array = " + sum3); 
		
		//  It doesn't matter what size the array is, arrayName[0] will always refer to the first element of the array 
		//  and arrayName.length - 1 will always refer to the last element of the array. The reason we have to subtract 
		//  1 from the length is because when counting the length, the method starting counting from 1 and on. 
		//  However, the actual index of the first element in any array is 0. 
		
		/*---------------------------------------------------*/
		
		//1c. Use a loop to iterate through the array and calculate the average age. Print the result to the console.
		
		System.out.println();
		
		int sumOfAges = 0; 
		int average = 0;
		
		//For every number in the ages2 array, I am adding that number to sumOfAges. 
		for (int number : ages2) {
			sumOfAges += number;
		}
		
		// Finding the average age by dividing the sum of all ages by the length of the array. The length gives me the
        // number of elements that are in the array
		average = sumOfAges/ages2.length;  
		
		//Printing the average to the console. 
		System.out.println("Average of ages in the second array = " + average);
		
		/*-----------------------------------------------------------------------------------------------------------------------------------------------------------------*/
		
		//2. Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
		
		//2a.Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.
		
		System.out.println();
		
		//Creating an array of String called names
		String[] names = new String[]{"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		
		int charLength = 0; 
		
		//I am using a for loop to iterate through the array. FOor every name in the array,  I am getting the length of that
		//name and adding it to charLength.
		for(int i = 0; i < names.length; i++) {
			
			charLength += names[i].length();
			
		}
		//Dividing the sum of all the letters in the names array by the number of names in the array to find the 
		//average number of letters per name. 
		charLength = charLength / names.length;
		
		//Printing to console
		System.out.println("Average number of letters per name = " + charLength);
		
		/*---------------------------------------------------*/
		
		//2b Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result to the console.
		
		System.out.println();
		
		//String to store my concatenated string
		String concatString = "";
		
		//This is how I will be adding a space between the names.
		String space = " ";
		
		//Using a for loop, for every name in the array names, I am concatenating that name to my new array, along with the space between the names
		for (String name : names) {
			
			concatString = concatString.concat(name);
			concatString = concatString.concat(space);
			
		}
		
		//Printing to console
		System.out.println("Full name = " + concatString);
		
		/*-----------------------------------------------------------------------------------------------------------------------------------------------------------------*/
		
		/* 3. How do you access the last element of any array?
		 * 
		 * You can access the last element of any by finding out the length of the array using the length method
		 * which is - arrayName.length. Then, subtract 1 from the length and that will give you the index of the
		 * last element of any array.
		 * 
		 */
		
		/*-----------------------------------------------------------------------------------------------------------------------------------------------------------------*/
		
		/* 4. How do you access the first element of any array?
		 * 
		 * The first element of any array is located at the index 0: arrayName[0]
		 * 
		 */
		
		/*-----------------------------------------------------------------------------------------------------------------------------------------------------------------*/
		
		//5 Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and add the 
		//  length of each name to the nameLengths array.
		
		System.out.println();
		
		//Creating a new array of int that is the same size as the names array
		int[] nameLengths = new int[names.length];
		
		//Using a for loop to iterate through the array, I am setting the elements of the nameLengths array equal to the length of
		//each string in the names array.
		for(int i = 0; i < names.length; i++) {
			
			nameLengths[i] =  names[i].length();
			
			System.out.println(names[i] + "'s name has " + nameLengths[i] + " letters."); //Printing the nameLengths array elements to the console
		}
		
	
		/*-----------------------------------------------------------------------------------------------------------------------------------------------------------------*/
		
		//6 Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to the console.
		
		System.out.println();
		
		int sumOfNums = 0; 
		
		
		//Using an enhanced for loop, for every number in the nameLengths array, I am adding that number to sumOfNums/ 
		for (int number : nameLengths) {
			
			sumOfNums += number;
			
		}
		
		//Printing the resulting sum to the console
		System.out.println("Sum of elements in nameLengths array = " + sumOfNums);
		
		
		/*-----------------------------------------------------------------------------------------------------------------------------------------------------------------*/
		
		//7 Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).
		
		System.out.println();
		
		//Calling the method, passing in a String and an int and printing the concatenated string to the console.
		System.out.println(concatingStrings("Hello", 3));
		
		
		/*-----------------------------------------------------------------------------------------------------------------------------------------------------------------*/
		
		//8. Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be the first and the last name as a String separated by a space).
		
		System.out.println();
		
		//Calling the method, passing in two strings and printing the full name to the console.
		System.out.println("The full name is " + (fullName("Celaena", "Sardothien" )));
		
		
		/*-----------------------------------------------------------------------------------------------------------------------------------------------------------------*/
		
		//9. Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
		
		System.out.println();
		
		//Creating an array of int to pass into the method. 
		int[] arrayOfInts = new int[] {4, 7, 23, 43, 9, 50, 1,};
		
		//Printing result of the method to the console;
		if (greaterThan100(arrayOfInts)){
			System.out.println("The sum of all the ints in the array is <greater> than 100.");
		}else {
			System.out.println("The sum of all the ints in the array is <less> than 100.");
		}
		
		
		/*-----------------------------------------------------------------------------------------------------------------------------------------------------------------*/
		
		//10. Write a method that takes an array of double and returns the average of all the elements in the array.
		
		System.out.println();
		
		//Creating a new array of double to pass into the method
		double[] doubleArray = new double[] { 3.5, 4.7, 2.9, 10.3};
		
		System.out.println("The average of all the elements in the array is " + (averageArray(doubleArray)));
		
		
		/*-----------------------------------------------------------------------------------------------------------------------------------------------------------------*/
		
		//11. Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than the average of the elements in the second array.
		
		System.out.println();
		
		//Creating two new arrays of double to pass into the method
		double[] firstArray = new double[] { 5.3, 4.2, 8.1, 7.8};
		double[] secondArray = new double[] { 6.0, 8.4, 5.6, 2.3, 2.2};
		
		//Printing results to the console
		if(greatestAverage(firstArray, secondArray)) {
			System.out.println("The average of elements in firstArray is <greater> than the average of secondArray");
		}else {
			System.out.println("The average of elements in firstArray is <less> than the average of secondArray");
		}
		
		
		/*-----------------------------------------------------------------------------------------------------------------------------------------------------------------*/
		
		//12. Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
		
		System.out.println();
		
		//Creating a boolean variable and double variable to pass into method
		boolean isHotOutside = true;
		double moneyInPocket = 11.50;
		
		//Printing method results to console
		if (willBuyDrink(isHotOutside, moneyInPocket)) {
			System.out.println("buying drink");
		}else {
			System.out.println("no drink for me");
		}
		
		/*-----------------------------------------------------------------------------------------------------------------------------------------------------------------*/
		//13. Create a method of your own that solves a problem. In comments, write what the method does and why you created it.
		
		// This method takes the gross pay, income tax and commute costs of a job, calculates the net take-home pay after
		// income tax and commute costs. 
		
		//I created this method because I was looking at two different jobs: one in Seattle and one in Portland. The job in Portland
		//pays more but there's the income tax and commute costs to think about. The Seattle job pays less but there isn't any income
		//tax and the commute costs are way less. 
		
		System.out.println();
		
		//Creating the variables for both jobs
		double grossPay1 = 41000.00;
		double incomeTax1 = 0.9;
		double commuteCost1 = 3459.6;
		
		double grossPay2 = 35000.00;
		double incomeTax2 = 0.0;
		double commuteCost2 = 1250.0;
		
		//Calling the method twice, one for each job and setting the result equal to netPay
		double netPay1 = takeHome(grossPay1, incomeTax1, commuteCost1);
		double netPay2 = takeHome(grossPay2, incomeTax2, commuteCost2);
		
		
		//Comparing the take-home amount from each job to see which job will have the best net pay. 
		if (netPay1 > netPay2) {
			System.out.println("Job in seattle!");
		}
		else if(netPay1 == netPay2) {
			//If the net pay from both jobs happens to be the same, I can pick based on job preference. 
			System.out.println("Eenie meenie mynie mo");
		}else {
			System.out.println("Job in portland!");
		}
		
		

	}
	

	//7 Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).
	
	//Declaring a method called concatingStrings that takes a string and an int and returns a string
	public static String concatingStrings(String word, int n) {
		
		//Creating a local string that will contain the concatenated word
		String concatedStr = "";
		
		//Using a for loop that iterates from 1 to the user number, I am concatenating the word to itself. 
		for (int i = 1; i <= n; i++) {
			concatedStr = concatedStr.concat(word);
		}
		
		//Returning the concatenated string
		return concatedStr;
		
	}

	
	//8. Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be the first and the last name as a String separated by a space).
	
	//Declaring a method called fullName that takes two string and returns a string
	public static String fullName(String firstName, String lastName) {
		
		//Creating a local variable that will store the full name
		String fullName = "";
		
		//This is how I will add a space between the names.
		String space = " ";
		
		//Concatenating the first name, space, and last name onto fullName.
		fullName = fullName.concat(firstName);
		fullName = fullName.concat(space);
		fullName = fullName.concat(lastName);
		
		//returning the full name
		return fullName;
	}
	
	
	//9. Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
	
	//Declaring a method called greaterThan100 that takes an array of int and returns a boolean.
	public static boolean greaterThan100(int[] intArray) {
		
		//declaring a local variable
		int sum = 0; 
		
		// Using an enhanced for loop, for every number in the array of int, I am adding that number to the sum
		for(int number : intArray) {
			sum += number; 
		}
		
		//Using an if else statement, I am comparing the sum to 100. If the sum is greater than 100, the method will return true.
		//Otherwise, the method will return false. 
		if(sum > 100) {
			return true;
		}else {
			return false; 
		}
		
	}
	
	
	//10. Write a method that takes an array of double and returns the average of all the elements in the array.
	
	//Declaring a method called averageArray that takes an array of double and returns a double. 
	public static double averageArray(double[] array) {
		
		//declaring the local variables
		double average;
		double sum = 0.0; 
		
		//Using an enhanced for loop, for every number in the array, I am adding that number to the sum.
		for(double number : array) {
			sum += number;
		}
		
		//Finding the average by dividing the sum of all the elements by the length of the array and setting that 
		//equal to the average variable. 
		average = sum / array.length;
		
		//returning the average
		return average;
	}
	
	
	//11. Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than the average of the elements in the second array.
	
	//Declaring a method called greatestAverage that takes two arrays of double and returns a boolean
	public static boolean greatestAverage(double[] arr1, double[] arr2) {
		
		//declaring local variables
		double average;
		double sum = 0.0; 
		
		double average2;
		double sum2 = 0.0;
		
		//Using an enhanced for loop, for every number in the first array, I am adding that number to sum. 
		for(double number : arr1) {
			sum += number;
		}
		
		//Using an enhanced for loop, for every number in the second array, I am adding that number to sum2. 
		for(double number : arr2) {
			sum2 += number;
		}
		
		//Finding the average of both arrays by diving the sums by the lengths of each array
		average = sum / arr1.length;
		average2 = sum2 / arr2.length;
		
		//Using an if else statement, I am comparing the teo averages. If the average of the first array is
		//greater that the average of the second array, the method will return true. Otherwise, it will return false
		if (average > average2) {
			return true;
		}else {
			return false;
		}
		
	}
	
	
	//12. Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
	
	//Declaring a method called willBuyDrink that takes a boolean and double and returns a boolean
	public static boolean willBuyDrink(boolean temp, double money) {
		
		//Using an if else statement, I am comparing the two variables.
		//If temp is true (hot outside) AND I have more than $10.50, the method will return true. Otherise it will return false. 
		if(temp && money > 10.50) {
			return true;
		}else {
			return false;
		}
		
	}
	
	//13. Create a method of your own that solves a problem. In comments, write what the method does and why you created it.
	//Declaring a method called takeHome that takes three doubles and returns a double
	public static double takeHome(double gross, double tax, double gasMoney) {
		
		//Finding the amount after income tax
		double afterTax = gross * tax;
		
		//Finding netPay by subtracting gas expenses from the amount after tax.
		double netPay = afterTax - gasMoney;
		
		//returning net pay after income tax and gas expenses. 
		return netPay;
	}
	
}
