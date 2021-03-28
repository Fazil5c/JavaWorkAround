package com.charector;

public class MyCharRunner {

	public static void main(String[] args) {
		MyChar myChar=new MyChar('b');
		System.out.println(myChar.isVowel());
		System.out.println(myChar.isAlphabet());
		System.out.println(myChar.isConsonent());
	}
}
