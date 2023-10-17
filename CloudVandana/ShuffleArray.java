package com.vikram.cloudvandana;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShuffleArray {
	public static void main(String[] args) {
		int n=7;
		List<Integer> l = new ArrayList<>();
		for(int i=1;i<=n;i++) {
			l.add(i);
		}
		System.out.println("Original Array : "+l);
		Collections.shuffle(l);
		System.out.println("Shhuffled Array : "+l);
	}
}
