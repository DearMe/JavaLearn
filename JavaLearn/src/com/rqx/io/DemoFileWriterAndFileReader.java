package com.rqx.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class DemoFileWriterAndFileReader {

	public static void main(String[] args){
		// TODO Auto-generated method stub
//1. ���ı����ݴ洢��һ���ļ���
		//��Ϊ�������쳣����ʽ���Ժ���Ա�չʾ
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
		
		
//2. ��ȡһ�����е��ı��ļ������ı����ݴ�ӡ����
		//һ�ζ�һ���ַ��ʹ�ӡ������Ч�ʲ���
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
		
	
		
		
//3. ��һ���ַ��ʹ����ַ����������1KB�ٴ�ӡ
		fr = null;
	}

}
