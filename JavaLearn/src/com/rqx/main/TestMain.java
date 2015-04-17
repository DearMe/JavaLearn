package com.rqx.main;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
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
		return (o instanceof A) && ((A)o).getA() == this.a ? true : false;
	}
}
public class TestMain {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		FileWriter fw = new FileWriter("demo.txt");
		
		fw.write("abcde");
		fw.write("kkk");
		fw.close();
		
		FileReader fr = new FileReader("demo.txt");
		int ch = 0;
		while((ch = fr.read()) != -1){
			System.out.println((char)ch);
		}
		fr.close();
	}
}
