package com.akshay.testarraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

public class ArrayListDemo {

	public static void basicArrayListOperations() {

		ArrayList<Integer> arraylist = new ArrayList<Integer>(10);

		// ArrayList allowing duplicates element
		arraylist.add(3);
		arraylist.add(3);

		// ArrayList allowing null
		arraylist.add(null);
		System.out.println(arraylist);

		// ArrayList size method
		System.out.println(arraylist.size());

		arraylist.add(5);
		arraylist.add(4);

		// to obtain particular index element
		System.out.println(arraylist.get(4));

		// to check whether given no is present or not
		System.out.println(arraylist.contains(4));

		// to remove element at particular position
		System.out.println(arraylist.remove(3));

		System.out.println(Collections.reverseOrder());
		System.out.println(arraylist);
	}

	public static void removeDuplicateElements() {
		ArrayList<Integer> duplicateList = new ArrayList<Integer>();
		
		duplicateList.add(2);
		duplicateList.add(3);
		duplicateList.add(2);

		System.out.println("ArrayList with duplicate Elements:" + duplicateList);

		Set<Integer> uniqueElementList = new LinkedHashSet<Integer>();
		uniqueElementList.addAll(duplicateList);

		System.out.println("ArraList without duplicate Elements:" + uniqueElementList);

	}

	public static void main(String[] args) {
		/*
		 * Features of arrayList 1.Allow Duplicates 2.Maintains Insertion order 3.Allow
		 * null value's
		 */

		basicArrayListOperations();

		/*
		 * Q.How to remove duplicates in arrayList
		 */

		removeDuplicateElements();
		
	
		
		

	}
}
