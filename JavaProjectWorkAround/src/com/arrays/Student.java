package com.arrays;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Student {

	private String name;
	private ArrayList<Integer> marks = new ArrayList<Integer>();

	public Student(String name, int... marks) {
		this.name = name;
		for (int mark : marks)
			this.marks.add(mark);
	}

	public int getNumberOfMarks() {
		return marks.size();
	}

	public int totalSumOfMarks() {
		int sum = 0;
		for (int mark : marks)
			sum = sum + mark;
		return sum;
	}

	public int getMaximumMark() {
		return Collections.max(marks);
	}

	public int getMininumMark() {
		return Collections.min(marks);
	}

	public BigDecimal getAverage() {
		int avg = 0;
		for (int mark : marks)
			avg = avg + mark;
		return new BigDecimal(avg).divide(new BigDecimal(marks.size()),8,RoundingMode.UP);
	}

}
