package com.rqx.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class DemoFileWriterAndFileReader {

	public static void main(String[] args){
		// TODO Auto-generated method stub
//1. 将文本数据存储到一个文件中
		//较为完整的异常处理方式，以后简化以便展示
		FileWriter fw = null;
		try {
			fw = new FileWriter("demo.txt");
			fw.write("abced");
			fw.flush();
			fw.write("ABCED");
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println(e.toString());
		} finally{
			if(fw != null){
				try {
					fw.close();
				} catch (IOException e) {
					// TODO: handle exception
					System.out.println("close: " + e.toString());
				}
			}
		}
		
		
//2. 读取一个已有的文本文件，将文本数据打印出来
		//一次读一个字符就打印出来，效率不高
		FileReader fr = null;
		int ch = 0;
		try {
			fr = new FileReader("demo.txt");
			while((ch = fr.read()) != -1){
				System.out.println((char)ch);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e.toString());
		} finally{
			if(fr != null){
				try {
					fr.close();
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("close: " + e.toString());
				}
			}
		}
		
	
		
		
//3. 读一个字符就存入字符数组里，读完1KB再打印
		fr = null;
	}

}
