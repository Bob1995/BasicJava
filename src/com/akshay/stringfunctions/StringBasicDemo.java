package com.akshay.stringfunctions;

import java.util.Scanner;

public class StringBasicDemo {

	static Scanner scanner;
	static String reversedSentence = "";

	/*
	 * Function to reverse string input:Akshay output:yahskA
	 */
	public static void stringReverse(String givenString) {
		for (int i = givenString.length() - 1; i >= 0; i--) {
			System.out.println("Reversed String-->>" + givenString.charAt(i));
		}

	}

	/*
	 * Function to reverse given sentence input:This is Akshay output:Akshay is This
	 */
	public static void sentenceReverseWords(String givenSentence) {
		String reversedSentence = "";
		String[] words = givenSentence.split(" ");
		for (int i = words.length - 1; i >= 0; i--) {
			reversedSentence = reversedSentence + words[i] + " ";
		}
		System.out.println("Reversed Sentence With words-->>>>" + reversedSentence);

	}

	/*
	 * Function to reverse the sentence input:Hey akshay Output:yeH yahska
	 */
	public static void sentenceReverseCharacter(String givenSentence) {
		String[] words = givenSentence.split(" ");
		String reverseWord = "";
		String reversedSentence = "";
		for (int i = 0; i < words.length; i++) {
			String word = words[i];
			for (int j = word.length() - 1; j >= 0; j--) {
				reverseWord = reverseWord + word.charAt(j);
			}
			reversedSentence = reversedSentence + reverseWord + " ";
		}
		System.out.println("Reversed sentence with character-->" + reversedSentence);
	}

	/*
	 * Function to count the characters in string
	 * input-AKSHAY
	 * output-2
	 */

	public static void characterCount(String givenString, char givenCharacter) {
		int i, count = 0;
		for (i = 0; i <= givenString.length() - 1; i++) {
			if (givenString.charAt(i) == givenCharacter)
				count++;

		}
		System.out.println(
				"Given String--->" + givenString + "\n" + "Given character--->" + givenCharacter + "\n" + "Count" + count);

	}

	public static void main(String[] args) {
		
		System.out.println("Enter the string:");
		scanner = new Scanner(System.in);
		String givenString = scanner.next();
		
		stringReverse(givenString);

		
		System.out.println("Enter the sentence:");
		scanner = new Scanner(System.in);
		String givenSentence = scanner.nextLine();
		
		sentenceReverseWords(givenSentence);
		
		sentenceReverseCharacter(givenSentence);

		System.out.println("Enter the character:");
		scanner = new Scanner(System.in);
		char givenCharacter = scanner.next().charAt(0);

		characterCount(givenString, givenCharacter);

	}

}
