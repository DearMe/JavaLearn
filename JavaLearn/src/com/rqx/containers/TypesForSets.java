package com.rqx.containers;

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

public class TypesForSets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
