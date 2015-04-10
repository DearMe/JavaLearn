package com.rqx.main;

import java.util.ArrayList;
import java.util.List;

class A{
	private int a;
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public A(int a){
		this.a = a;
	}
	public boolean equals(Object o){
		return ((A)o).getA() == this.a ? true : false;
	}
}
public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> strings = new ArrayList<String>();
		List<Integer> integers = new ArrayList<Integer>();
		List<A> as = new ArrayList<A>();
		A a1 = new A(1);
		A a2 = new A(1);
		as.add(a1);
		as.add(a2);
		System.out.println(as.indexOf(a2));
		System.out.println(as.indexOf(a1));
	}
}
