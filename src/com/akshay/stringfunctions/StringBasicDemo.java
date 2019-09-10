package com.akshay.stringfunctions;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

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
	 * Function to reverse given sentence input:This is Akshay output:Akshay is
	 * This
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
	 * Function to count the characters in string input-AKSHAY output-2
	 */

	public static void characterCount(String givenString, char givenCharacter) {
		int i, count = 0;
		for (i = 0; i <= givenString.length() - 1; i++) {
			if (givenString.charAt(i) == givenCharacter)
				count++;

		}
		System.out.println("Given String--->" + givenString + "\n" + "Given character--->" + givenCharacter + "\n"
				+ "Count" + count);

	}

	/*
	 * I/P:String abc =movie-ddlj,actor-srk,food-wadapav,city-mumbai
	 * o/p:movie-ddlj,actor-srk,food-wadapav,city-mumbai
	 */
	private static void addStringToMap(String testString) {
		String[] splitedString = null;
		Map<String, String> treeMap = new TreeMap<>();
		for (int i = 0; i < testString.length(); i++) {
			splitedString = testString.split("-|,");

		}

		for (int j = 0; j < splitedString.length; j++) {
			treeMap.put(splitedString[j], splitedString[++j]);
		}

		System.out.println("TreeMap Values :" + treeMap);
	}

	public static void individualCharacterCount(String str) {
		for (int i = 0; i < str.length(); i++) {
			int count = 0;
			char a = str.charAt(i);

			if (a != ' ') {
				for (int j = 0; j < str.length(); j++) {
					if (a == str.charAt(j))
						count++;
				}

			}
			System.out.println("Character:" + a + "--->>>" + "Count " + count);
		}
	}

	public static void main(String[] args) {

		addStringToMap("movie-ddlj,actor-srk,food-wadapav,city-mumbai");

		individualCharacterCount("Akshay");
		
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
