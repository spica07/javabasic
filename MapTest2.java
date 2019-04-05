package com.lgcns.stringExam;
/*
 *  다음 문자열에 포함된 모든 문자들이 몇 번 사용이 되었는지 셀 수 있는 프로그램을 작성하고자 합니다.
	알파벳은 대문자와 소문자가 같은 문자로 생각하고 각각의 사용된 개수를 카운트 하여 출력 예와 같은 형식으로 각 
	문자와 사용 빈도수를 출력하시오.
	
	<요구사항>
	- 알파벳은 대문자 또는 소문자가 같은 것으로 간주하고 카운트 한다.
	  즉, A와 a는 같은 문자로 생각한다.
	- 기타 특수 문자도 몇 번 사용이 되었는지 카운트하여 결과를 출력한다.

	<실행결과 sample1>
	
	  : 29
	, : 4
	- : 1
	. : 2
	a : 24
	b : 2
	c : 7
	d : 11
	e : 19
	f : 2
	g : 8
	h : 3
	i : 15
	j : 1
	l : 8
	m : 15
	n : 17
	o : 11
	p : 11
	r : 17
	s : 11
	t : 16
	u : 7
	v : 2
	y : 7
	
	
	<실행결과 sample2>
	  : 47
	, : 2
	- : 1
	. : 3
	: : 1
	a : 25
	b : 11
	c : 16
	d : 14
	e : 23
	f : 3
	h : 7
	i : 10
	j : 1
	l : 6
	m : 5
	n : 15
	o : 17
	p : 1
	r : 10
	s : 27
	t : 22
	u : 5
	v : 2
	y : 4
 * 
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

public class MapTest2 {

	public static void main(String[] args) {
//		sample 1
//		String s1 = "Python features a dynamic type system and automatic";
//				s1+="memory management and supports multiple programming ";
//				s1+="paradigms, including object-oriented, imperative, functional ";
//				s1+="programming, and procedural styles. ";
//				s1+="It has a large and comprehensive standard library." ;
				
				
//     sample2				
		String s1 = "A non-access modifier. Used for classes and methods:";
				s1 += "An abstract class cannot be used to create objects";
				s1 += "to access it, it must be inherited from another class.";
				s1 += "An abstract method can only be used in an abstract class,";
				s1 += "and it does not have a body. The body is provided by the subclass";		

//---------------------------------------
	  stringCount(s1);
//---------------------------------------	
	
	}

	private static void stringCount(String s1) {
		  HashMap<String,Integer> str = new HashMap<String,Integer>();
				
		  s1 = s1.toLowerCase();
		  for(int i = 0; i < s1.length(); i++){		  
			  String temp = String.valueOf(s1.charAt(i));
			  
			  if(str.containsKey(temp)) {
				  str.put(temp, str.get(temp) + 1);
			  } else {
				  str.put(temp, 1);
			  }
		  }
		  
		  ArrayList<String> keyList = new ArrayList<String>(str.keySet());
		  
		  Collections.sort(keyList);
		  
		  for(String key: keyList){
			  System.out.println(key + " : " + str.get(key));
		  }
	}
}
