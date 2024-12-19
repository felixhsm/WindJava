package com.wind.day16.stream.file;

import java.io.File;
import java.io.IOException;

public class Exam_File {
	public static void main(String[] args) {
		File folderMake = new File("src/com/wind/day16/stream/file/sample");
		if(!folderMake.exists()) {
			folderMake.mkdir();
			System.out.println("폴더가 만들어졌습니다.");
		}else {
			System.out.println("폴더가 존재합니다.");
		}
		// 폴더가 없어서 폴더가 만들어지면 폴더가 만들어졌습니다. 출력
		// 풀더가 있으면 이미 폴더가 존재합니다. 출력
	}
	
	
	
	public void fileMakeEx() {
		File fileMake = new File("src/com/wind/day16/stream/file/new.txt");
		if(!fileMake.exists()) {
			// 파일이 없어서 파일이 만들어지면 파일이 만들어졌습니다. 출력
			// 파일이 있으면 이미 파일이 존재합니다. 출력
			// 파일 만드는 메소드 호출
			try {
				fileMake.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
			// 메세지 출력
			System.out.println("파일이 만들어졌습니다.");
		}else {
			// 파일이 있으면 파일이 있어서 이미 파일이 존재합니다. 출력
			System.out.println("이미 파일이 존재합니다.");
		}
	}
	
	public void fileBasic() {
		File file = new File("C:\\Temp\\copying.jpg");
		String fileName = file.getName();
		String path = file.getPath();
		String parent = file.getParent();
		System.out.println("파일 이름 : " + fileName);
		System.out.println("파일 경로 : " + path);
		System.out.println("부모 폴더 : " + parent);
		System.out.println("파일이 존재하는가 ?  :" + file.exists()  );
		System.out.println("파일이 맞는가 ?  : " + file.isFile() );
		System.out.println("폴더가 맞는가 ?  : " + file.isDirectory() );
		
		
		
		
	}
}
