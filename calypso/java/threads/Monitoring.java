package com.calypso.java.threads;

public class Monitoring extends Thread {
	private long num;

	public Monitoring(int num) {
		this.num = num;
	}

	@Override
	public void run() {
		long sum = 0;
		for (int i = 0; i <= num; i++) {
			sum += i;
		}
		System.out.println(sum+":for:"+Thread.currentThread());
	}

}
