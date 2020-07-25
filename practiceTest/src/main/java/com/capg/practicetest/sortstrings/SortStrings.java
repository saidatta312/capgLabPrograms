package com.capg.practicetest.sortstrings;

public class SortStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String names[]= {"sai","om","swaroop","datta"};
		int l=names.length;
		sort(names,l); 
	    
	    printArraystring(names, l);
		

	}
	static void sort(String []s, int l) 
	{ 
	    for (int i=1 ;i<l; i++) 
	    { 
	        String temp = s[i]; 
	  
	        int j = i - 1; 
	        while (j >= 0 && temp.length() < s[j].length()) 
	        { 
	            s[j+1] = s[j]; 
	            j--; 
	        } 
	        s[j+1] = temp; 
	    } 
	} 
	  
	
	static void printArraystring(String str[], int l) 
	{ 
	    for (int i=0; i<l; i++) 
	        System.out.print(str[i]+" "); 
	} 
	  
}
