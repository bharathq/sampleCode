package com.calypso.java.homework;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ThreadFileReader extends Thread {
	private String a = new String();

	public ThreadFileReader(String a) {
		this.a = a;
	}

	@Override
	public void run() {
		try (FileReader fr = new FileReader(a+".csv")){
			BufferedReader buf = new BufferedReader(fr, 50);
			String data=null;
			String line[]=new String[4];
			while((data=buf.readLine())!=null){
				line=data.split(",");
				if(Integer.valueOf(line[2])<30 && line[3].equals("Fremont"))
				{
					System.out.println("First name is"+line[0]+"    last name is:"+line[1]);
				}
			}
		} 
		 catch (IOException e) {
			e.printStackTrace();
		}
	}

}
