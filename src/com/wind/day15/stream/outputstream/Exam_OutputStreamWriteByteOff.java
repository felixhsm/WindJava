package com.wind.day15.stream.outputstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Exam_OutputStreamWriteByteOff {
	public static void main(String[] args) {
		try {
			OutputStream os = new FileOutputStream("src/com/wind/day15/stream/outputstream/writing3.txt");
			byte[]bytes = "마지막 입출력 테스트".getBytes();
			os.write(bytes, 0, 10);
			os.flush();
			os.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
	}
}
