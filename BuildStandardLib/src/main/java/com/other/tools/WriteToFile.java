package com.other.tools;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class WriteToFile {

	public void writer2file(String file, String HotelInfo) {
		BufferedWriter bw = null;

		try {
			bw = new BufferedWriter(new FileWriter(new File(file),true));//追加写入文件
			bw.write(HotelInfo + "\r\n");
			bw.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public String readfile(String file){
		BufferedReader br=null;
		String s="";
		try {
			br=new BufferedReader(new FileReader(new File(file)));
			while((s=br.readLine())!=null){
				return s;
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return s;
	}
}