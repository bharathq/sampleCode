package com.calypso.java.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.channels.WritableByteChannel;

import com.calypso.java.exception.ApplicationException;

public class FileStreamExample {

	private void writeByteContent(String filename, String content) throws IOException {
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(filename);

			fos.write(content.getBytes());
			// throw new IOException();
		} finally {
			if (fos != null)
				fos.close();
		}

	}

	private void readByteContent(String filename) {
		try (FileInputStream fis = new FileInputStream(filename)) {
			int data = 0;
			while ((data = fis.read()) != 0 - 1) {
				System.out.println((char) data);
			}
		} catch (IOException e) {

		}
	}

	private void WriteTextContent(String filename, String content) {
		try (FileWriter fw = new FileWriter(filename)) {
			BufferedWriter buf = new BufferedWriter(fw, 50);
			buf.write(content);
			buf.flush();
		} catch (IOException e) {

		}
	}

	private void readTextContent(String filename) {
		try (FileReader fr = new FileReader(filename)) {
			BufferedReader buf = new BufferedReader(fr, 50);
			String data=null;
			while((data=buf.readLine())!=null){
				System.out.println(data);
			}
		} catch (IOException e) {

		}
	}

	public static void main(String[] args) throws ApplicationException {
		FileStreamExample f = new FileStreamExample();
		try {
			f.writeByteContent("abc.txt", "text abcd");
			f.readByteContent("abc.txt");
			f.WriteTextContent("input.txt", "this is a long string to be written in a file");
			f.readTextContent("input.txt");
		} catch (IOException e) {
			e.printStackTrace();
			ApplicationException ae = new ApplicationException("File Processing error");
			ae.setStatusCode(500);
			throw ae;
		}
	}

}
