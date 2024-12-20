package com.wind.day18.thread;
class printNumbers implements Runnable{

	@Override
	public void run() {
		for(int i = 1; i <= 5; i++) {
			System.out.println("숫자 : " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
}
class downloadFiles implements Runnable{
	
	@Override
	public void run() {
		String [] files = {"document.pdf", "image.jpg", "video.mp4"};
		for(String file:files) {
			System.out.println(file + " 다운로드 중...");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}	
		
	}
}

public class Exam_MultiThread {
	/*
	 * printNumbers와 downloadFiles를 쓰레드로 만들어서
	 * 실행해주세요~!
	 */
	
	
	public static void main(String[] args) {
		Thread thread = new Thread(new printNumbers());
		Thread thread2 = new Thread(new downloadFiles());
		// 동시에 시작
		thread.start();
		thread2.start();
	}
}
