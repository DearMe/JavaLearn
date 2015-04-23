package com.rqx.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.BitSet;

public class DemoInputStreamAndOutStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.
		FileOutputStream fos = null;
		try{
			fos = new FileOutputStream("a.txt");
			fos.write(1);
		}catch(IOException e){
			System.out.println(e.toString());
		}finally{
			if(fos != null){
				try{
					fos.close();
				}catch(IOException e){
					System.out.println("close:" + e.toString());
				}
			}
		}
		
		//2. 
		FileInputStream fis = null;
		try{
			fis = new FileInputStream("1.jpg");
			byte[] buf = new byte[fis.available()];
			fis.read(buf);
			//System.out.println(new String(buf));
		}catch(IOException e){
			System.out.print(e.toString());
		}finally{
			if(fis != null){
				try{
					fis.close();
				}catch(IOException e){
					System.out.println("close:" + e.toString());
				}
			}
		}
		
		//3.copy a picture file named 1.jpg
		BufferedInputStream bufis = null;
		BufferedOutputStream bufos = null;
		try{
			bufis = new BufferedInputStream(new FileInputStream("1.jpg"));
			bufos = new BufferedOutputStream(new FileOutputStream("2.jpg"));
			
			int by = 0;
			while((by = bufis.read()) != -1){
				bufos.write(by);
			}
		}catch(IOException e){
			System.out.println(e.toString());
		}finally{
			if(bufis != null){
				try{
					bufis.close();
				}catch(IOException e){
					System.out.println("close:" + e.toString());
				}
			}
		}
	}

}
