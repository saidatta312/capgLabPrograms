package com.capg.practicetest.sortingstudents;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SortingBasedOnN_A_H {

	
	public static void main(String[] args) {


	
	List<Student> students=Arrays.asList(
			new Student("swaroop",20,5.0),
			new Student("sai",18,5.3),
			new Student("om",19,5.1)
			
			);
	
	
	Set<Student> studentSet=new HashSet(students);
	
	
	
	System.out.println("Student Set - "); 
	studentSet.forEach(t->System.out.println(t));
	
	Collections.sort(students,(t1,t2)->t1.name.compareTo(t2.name));
	System.out.println();
	System.out.println("Student List - ");
	students.forEach(t->System.out.println(t));
			
	
	
	
}

}

