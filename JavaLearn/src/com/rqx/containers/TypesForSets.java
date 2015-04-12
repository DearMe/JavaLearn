package com.rqx.containers;

import java.net.Inet4Address;
import java.util.HashSet;
import java.util.Set;

class SetType{
	int i;
	public SetType(int n){
		i = n;
	}
	public boolean equals(Object o){
		return o instanceof SetType && (i == ((SetType)o).i);
	}
}

class HashType extends SetType{
	public HashType(int n){
		super(n);
	}
	public int hashCode(){
		return i;
	}
}

class TreeType extends SetType implements Comparable<TreeType>{
	public TreeType(int n){
		super(n);
	}
	public int compareTo(TreeType arg){
		return (arg.i < i ? -1 : (arg.i == i ? 0 : 1));
	}
}


public class TypesForSets {
	static <T> Set<T> fill(Set<T> set, Class<T> type){
		try{
			for(int i = 0; i < 10; i++){
				set.add(type.getConstructor(int.class).newInstance(i));
			}
		}catch(Exception e){
			throw new RuntimeException();
		}
		return set;
	}
	static<T> void test(Set<T> set, Class<T> type){
		fill(set, type);
		fill(set, type);
		fill(set, type);
		System.out.println(set);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test(new HashSet<HashType>(), HashType.class);
	}

}
