package com.lemanov.equals;

import java.util.HashSet;
import java.util.Set;

public class main {

	public static void main(String[] args) {
		
		String a = new String("str");
		String b = new String("str");
		System.out.println("new String: a == b: " + (a == b));
		System.out.println("new String: a.equals(b): " + a.equals(b));
		
		String c = "str2";
		String d = "str2";
		System.out.println("primitive: c == d: " + (c == d));
		System.out.println("primitive: c.equals(d): " + c.equals(d));
		
		
		// intern() method put string to hashMap. If string is new than added to map and return reference.
		// If string is exist, then return reference only to the same object.
		// Major from intern() is the fact that strings not matches my symbol. 
		
		String e = new String("srt3").intern();
		String f = new String("srt3").intern();
		System.out.println("new String: e == f: " + (e == f));
		
		System.out.println("============================== \n");
		
		Account x = new Account(1, "obj");
		Account y = new Account(1, "obj");
		System.out.println("x == y: " + (x == y));
		System.out.println("x.equals(y): "+ x.equals(y));
		System.out.println("hashcodes:");
		System.out.println("x=" + x.hashCode());
		System.out.println("y=" + y.hashCode());
		
		Set<Account> set = new HashSet<>();
		set.add(x);
		set.add(y);
		System.out.println("hashSet size=" + set.size());
		
		//equals override  - need to make correct match objects by ==
		//hashcode override - need to prevent put the same objects to hashMap or hashSet
		
	}

}
