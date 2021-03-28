package com.charector;

public class MyChar {
	private char ch;

	public MyChar(char ch) {
		this.ch = ch;
	}

	public boolean isVowel() {
		boolean result = false;
		char[] arr = { 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' };
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == ch)
				result = true;
		}
		return result;
	}

	public boolean isAlphabet() {
		if (ch >= 65 && ch <= 90) //unicode between 'A' to 'Z'
			return true;
		if (ch >= 97 && ch <= 122) //unicode between 'a' to 'z'
			return true;
		return false;
	}

	public boolean isConsonent() {
		if(isAlphabet() && !isVowel())
			return true;
		return false;
	}
	
	
}
