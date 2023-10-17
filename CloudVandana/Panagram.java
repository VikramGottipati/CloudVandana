package com.vikram.cloudvandana;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Panagram {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A String: ");
		String s=sc.nextLine();
		s=s.toUpperCase();
		if(isPanagram(s)==true)System.out.println(s+" is Panagram");
		else System.out.println(s+" is not Panagram");
	}
	public static boolean isPanagram(String s1) {
		Set<Character> s = new HashSet<>();
		for(int i=0;i<s1.length();i++) {
			char c=s1.charAt(i);
			if(c>='A'&&c<='Z')s.add(c);
		}
		return s.size()==26;
	}
}
