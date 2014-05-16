package com.minsub.thread;

import java.sql.Date;
import java.text.SimpleDateFormat;

public class ThreadTest extends Thread{
	public static final int CNT = 5;  


	@Override
	public void run() {
		for (int i = 0; i < 6; i++) {
			System.out.println("Sub:" + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("Sub: INTERRUPT");
				return;
			}
		}
	}
	
	public static String getTimeNow() {

		Date date = new Date(System.currentTimeMillis());
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		return sdf.format(date);
	}
	
	// Main Function
	public static void main(String[] args) {
		
		try {
			int cnt = 0;
			while(cnt++ < 5) {
				ThreadTest t = new ThreadTest();
				System.out.println("Main: Start");
				t.start();
				System.out.println("Main: wait 3 minite for sub thread");
				t.join(3000);
				t.interrupt();
				System.out.println("Main: END");
			}
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

}
