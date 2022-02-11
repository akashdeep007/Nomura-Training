package com.corejava.day12;

public class Subscriber implements Runnable {

	private Topic topic;

	public Subscriber(Topic topic) {
		this.topic = topic;
	}

	@Override
	public void run() {
		String threadName = Thread.currentThread().getName();
		synchronized (topic) {
			try {
				System.out.println(threadName + " is wating to get notified at time: " + System.currentTimeMillis());
				topic.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
//			System.out.println(threadName + " got notified at time: " + System.currentTimeMillis());
			System.out.println(threadName + " got message: " + topic.getMsg());
		}
	}

}
