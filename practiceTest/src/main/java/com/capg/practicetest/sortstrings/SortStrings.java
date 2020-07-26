package com.capg.practicetest.sortstrings;

public class SortStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String names[]= {"sai","om","swaroop","datta"};
		int l=names.length;
		sort(names,l); 
	    
	    printArraystring(names,l);
		

	}
	static void sort(String []s, int l) 
	{ 
		String temp,sortedStr[];
	    for(int i=0;i<l;i++) {
	    	for(int j=0;j<i;j++) {
				/*
				 * if(s[i].length()>s[i+1].length()) { temp=s[i]; s[i]=s[i+1]; s[i+1]=temp;
				 */
	    		if(s[j].length()>s[j+1].length())
	    		{ 
	    			temp=s[j]; 
	    			s[j]=s[j+1];
	    			s[j+1]=temp;
	    		}
	    	}
	    }
	} 
	  
	
	static void printArraystring(String str[], int l) 
	{ 
	    for (int i=0; i<l; i++) 
	        System.out.print(str[i]+" "); 
	} 
	  
}
