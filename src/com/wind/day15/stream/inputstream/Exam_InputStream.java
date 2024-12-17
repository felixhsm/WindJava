package com.wind.day15.stream.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exam_InputStream {
	public static void main(String[] args) {
		try {
			FileInputStream is = new FileInputStream("C:\\window\\system.ini");
			int readByte;
			// #1
			while((readByte = is.read()) != -1) {
				System.out.print((char)readByte);
			}
			// #2
			do {
				readByte = is.read();
				System.out.println((char)readByte);
			}while(readByte != -1);
			// #3
			while(true) {
				readByte = is.read();
				if(readByte == -1) break;
				System.out.println((char)readByte);
			}
			// #4
			for(;;) { // 언제까지?? 다 읽을때까지 -> 다 읽으면 어떻게 알지? -> is.read() == -1
				readByte = is.read();
				if(readByte == -1) break;
				System.out.println((char)is.read());
			}
			is.close();
			// is.read();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		
	}
}
}
