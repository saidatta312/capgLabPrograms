package com.capg.practicetest.sortstrings;

import java.util.Scanner;

public class SortStrings {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);

		 String names[]= {};
		for (int i = 0; i < 6; i++) {
			System.out.println("Enter the string");
			 names[i]= scan.next();
			
		}
		int l = names.length;
		sort(names, l);

		printArraystring(names, l);

	}

	static void sort(String[] s, int l) {
		String temp;
		for (int i = 0; i < l; i++) {
			for (int j = 0; j < l - 1; j++) {

				if (s[j].length() > s[j + 1].length()) {
					temp = s[j];
					s[j] = s[j + 1];
					s[j + 1] = temp;
				}
			}
		}
	}

	static void printArraystring(String str[], int l) {
		for (int i = 0; i < l; i++)
			System.out.print(str[i] + " ");
	}

}

/*
 * for(int i=0; i < args.length; i++){ for(int j=1; j < (args.length-i); j++){
 * if(args[j-1].length() > args[j].length()){
 * 
 * temp = args[j-1]; args[j-1] = args[j]; args[j] = temp; } }
 */
