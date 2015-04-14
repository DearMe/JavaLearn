package com.rqx.containers;

import java.util.Map;

public class Maps {

	public static void printKeys(Map<Integer, String> map){
		System.out.print("Size = " + map.size() + ", ");
		System.out.print("Keys: ");
		System.out.print(map.keySet());
	}
	
	public static void test(Map<Integer, String> map){
		System.out.println(map.getClass().getSimpleName());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
