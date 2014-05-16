package com.minsub.thread.callback;

import java.sql.Date;
import java.text.SimpleDateFormat;

public class Main extends Thread implements CallBackInter{
	
	public static String getTimeNow() {

		Date date = new Date(System.currentTimeMillis());
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		return sdf.format(date);
	}
	
	@Override
	public void run() {
		System.out.println("<<Start Main Thread>> " + getTimeNow());
		Thread thread = new SubThread(6, this);
		thread.start();
		
		try {
			synchronized (Thread.currentThread()) {
				Thread.currentThread().wait(3000);
			}
						
			thread.interrupt();
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("<<END Main Thread>> " + getTimeNow());
	}

	@Override
	public void Tfinish() {
		System.out.println("FINISH SUB THREAD");
		
		synchronized (Thread.currentThread()) {
			Thread.currentThread().notify();
		}
		
	}

	@Override
	public void Tinterrupt() {
		System.out.println("INTERRUPT SUB THREAD");
	}
	
	public static void main(String[] args) {
		Thread thread = new Main();
		thread.start();
		
		
	}
}
