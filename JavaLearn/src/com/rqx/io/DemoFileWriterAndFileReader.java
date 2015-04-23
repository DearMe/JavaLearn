package com.rqx.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class DemoFileWriterAndFileReader {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		
		//Reader()
		//(1). int read():
		//		读取一个字符，返回读到的那个字符。如果读到流的末尾，返回－1
		//(2). int read(char[]):
		//		将读到的字符存入指定的数组，返回的是读到的字符个数，也就是往数组里装的元素的个数。末尾，返回－1
//1. 将文本数据存储到一个文件中
		//较为完整的异常处理方式，以后简化以便展示
		FileWriter fw = null;
		try {
			fw = new FileWriter("demo.txt");
			fw.write("1234567890");
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
		try{
			fr = new FileReader("demo.txt");
			char[] buf = new char[2];//该长度通常都是1024的整数倍
			int len = 0;
			while((len = fr.read(buf)) != -1){
				System.out.print(len + " :");
				System.out.println(new String(buf, 0, len));
			}
		}catch(IOException e){
			System.out.println(e.toString());
		}finally{
			if(fr != null){
				try{
					fr.close();
				}catch(IOException e){
					System.out.println("close:" + e.toString());
				}
			}
		}

//4. 字符流的缓冲区
		//提高对流的操作效率
		//原理：其实就是对数组进行封装
		//4.1 BufferedWriter
			//newLine():跨平台的换行符
		//4.2 BufferReader
			//readLine():一次读一行，到行标记时，将之前的字符数据作为字符串返回。末尾，返回null
		
		//4.1
		BufferedWriter bufw = null;
		try{
			//缓冲区的存在就是为了增强流的功能，所以建立缓冲对象时，要先有流对象
			bufw = new BufferedWriter(new FileWriter("buf.txt"));
			bufw.write("abc");
			bufw.flush();//对缓冲区的数据进行刷新，将数据刷到目的地中
		}catch(IOException e){
			System.out.println(e.toString());
		}finally{
			if(bufw != null){
				try {
					bufw.close();//其实是关闭流对象
				} catch (IOException e) {
					// TODO: handle exception
					System.out.println("close:" + e.toString());
				}
			}
		}
		
		//4.2
		BufferedReader bufr = null;
		try{
			bufr = new BufferedReader(new FileReader("buf.txt"));
			String line = null;
			while((line = bufr.readLine()) != null){
				System.out.println(line);
			}
		}catch(IOException e){
			System.out.println(e.toString());
		}finally{
			if(bufr != null){
				try{
					bufr.close();
				}catch(IOException e){
					System.out.println("close:" + e.toString());
				}
			}
		}
	}

}
