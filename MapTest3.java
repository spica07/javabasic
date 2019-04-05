package com.lgcns.stringExam;
/*
 *  다음 문자열을 단어별로 분리하여 단어별 사용 빈도를 계산하는 프로그램을 작성하려고 한다. 
 *   *  
 *  <요구사항>
 *  각 단어는 소문자로 변환하여 이용한다.
 *  단어를 분리할 때 ',' 또는 '.' 등 특수 문자는 제외하고 순수 알파벳으로 구성된
 *  문자열만 분리할 수 있도록 한다. 분리된 알파벳 리스트는 알파벳 순으로 정렬하여
 *  출력하고 동시에 각 단어가 시용된 횟수를 출력하시오.

	<실행결과 sample1>
	a : 2
	an : 2
	and : 4
	by : 2
	creating : 2
	development : 2
	environment : 2
	existing : 2
	focus : 2
	for : 2
	in : 2
	it : 4
	language : 2
	making : 2
	materials : 2
	new : 2
	on : 2
	possible : 2
	programming : 2
	propose : 2
	python : 2
	scripting : 2
	start : 2
	teach : 2
	teaching : 2
	to : 6
	we : 2
 * 
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

public class MapTest3 {

	public static void main(String[] args) {
//		sample 1
		String s = "We propose to start by making it possible to teach programming ";
			   s += "in Python, an existing scripting language, and to focus on creating a ";
			   s += "new development environment and teaching materials for it. ";
			   s += "We propose to start by making it possible to teach programming ";
			   s += "in Python, an existing scripting language, and to focus on creating a ";
			   s += "new development environment and teaching materials for it.";
				
				
		stringCount(s);

	}
	private static void stringCount(String s1) {
		  HashMap<String,Integer> str = new HashMap<String,Integer>();
			
		  String[] words = s1.split("\\.|\\,|\\s");
		  
		  for(int i = 0; i < words.length; i++){		  
			  String temp = words[i].toLowerCase();
			  
			  if(temp.length() > 0){
				  if(str.containsKey(temp)) {
					  str.put(temp, str.get(temp) + 1);
				  } else {
					  str.put(temp, 1);
				  }
			  }
		  }
		  
		  Set<String> keySet = str.keySet();
		  
		  ArrayList<String> keyList = new ArrayList<String>(keySet);
		  
		  Collections.sort(keyList);
		  
		  for(String key: keyList){
			  System.out.println(key + " : " + str.get(key));
		  }
	}
}
