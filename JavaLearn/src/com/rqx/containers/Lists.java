package com.rqx.containers;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Lists {
	private static boolean b;
	private static String s;
	private static int i;
	private static Iterator<String> it;
	private static ListIterator<String> lit;
	
	public static void basicTest(List<String> a){
		a.add(1, "x");
		a.add("x");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
