package com.lgcns.sortTest;

import java.util.Arrays;
import java.util.Comparator;

public class StringSortTest1 {

	public static void main(String[] args) {
		String []sample = {
			    "hong",
		        "lee",
		        "park",
		        "seo",
		        "ko",
		        "kim",
			    "park",
		        "back",
		        "song",
		        "kim",
		        "won",
		        "lee1",
		        "choi",
		        "seo",
		        "ko",
		        "kim",
		        "park",
		        "back",
		        "ko",
		        "kim",
		        "jun"
		};		
		printArray(sample);
		
		Arrays.sort(sample, new Comparator<String>() {
			@Override
			public int compare(String s1, String s2){
				return s1.compareTo(s2);
			}
		});
				
		printArray(sample);
		

	}
	
	public static void printArray(String dary[]){
		for(int i=0; i<dary.length;i++){
			System.out.print(dary[i] + " ");
		}
		System.out.println();
	}
}
