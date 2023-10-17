package com.vikram.cloudvandana;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RomanToInteger {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Roman Number");
		String s=sc.next();
		s=s.toUpperCase();
		System.out.println(romToInt(s));
	}
	public static int romToInt(String s) {
		Map<Character,Integer> m = new HashMap<>();
		m.put('I', 1);
		m.put('V', 5);
		m.put('X', 10);
		m.put('L', 50);
		m.put('C', 100);
		m.put('D', 500);
		m.put('M', 1000);
		
		int res=0;
		for(int i=0;i<s.length();i++) {
			if(i>0 && m.get(s.charAt(i))>m.get(s.charAt(i-1))) {
				res+=m.get(s.charAt(i))-2*m.get(s.charAt(i-1));
			}else	res+=m.get(s.charAt(i));
		}
		return res;
	}
}
