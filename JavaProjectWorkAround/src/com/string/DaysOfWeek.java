package com.string;

public class DaysOfWeek {
	private String[] days;

	public DaysOfWeek(String... days) {
		this.days = days;
	}

	public String getLongestString() {
		int max=0;
		String longestString = null;
		for(int i=0;i<days.length-1;i++) {
			if(days[i].length()>max) {
				max=days[i].length();
				longestString =days[i];
			}
		}
		return longestString;
	}
}
