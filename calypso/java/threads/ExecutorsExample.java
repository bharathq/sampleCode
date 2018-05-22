package com.calypso.java.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorsExample {

	public static void main(String[] args) throws InterruptedException {
		ExecutorService service=Executors.newFixedThreadPool(10);
		
		for (int i = 0; i < 500; i++) {
			Monitoring obj = new Monitoring(1000000+i);
			service.execute(obj);
		}
		service.shutdown();
		do{
			
		}while(!service.isTerminated());
		Thread.sleep(3000);
		System.out.println("*******All Thread Finished **************");
	}

}
