package com.arrays;

public class StudentRunner {

	public static void main(String[] args) {
		Student student=new Student("Fazil",98,95,10);
		System.out.println(student.getNumberOfMarks());
		System.out.println(student.totalSumOfMarks());
		System.out.println(student.getMaximumMark());
		System.out.println(student.getMininumMark());
		System.out.println(student.getAverage());
	

	}

}
