package com.calypso.java.threads;

import java.util.ArrayList;
import java.util.List;

public class ThreadExample {

	static List <Thread> MonitoringThread=new ArrayList<>();

	public static void main(String[] args) {
		for (int i = 0; i < 500; i++) {
			Monitoring obj = new Monitoring(1000000+i);
			obj.setName("calypso"+i);
			if(i>50 && i<100)
				obj.setPriority(Thread.MIN_PRIORITY);
			obj.start();
			MonitoringThread.add(obj);
		}
		int running=0;
		do{
			running =0;
			for(Thread t:MonitoringThread)
			{
				if(t.isAlive())
				{
					running++;
				}
			}
			
		}while(running!=0);
		
		System.out.println("********All Threads Finished***********");
	}

}
