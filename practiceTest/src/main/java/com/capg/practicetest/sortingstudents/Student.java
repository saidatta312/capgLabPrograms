package com.capg.practicetest.sortingstudents;

public class Student {
String name;
Integer age;
Double height;
public Student(String name, Integer age, Double height) {
	super();
	this.name = name;
	this.age = age;
	this.height = height;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Integer getAge() {
	return age;
}
public void setAge(Integer age) {
	this.age = age;
}
public Double getHeight() {
	return height;
}
public void setHeight(Double height) {
	this.height = height;
}

}
