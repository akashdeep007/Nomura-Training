package com.corejava.day12;

public class Publisher implements Runnable{

	private Topic topic;
	private String msg;
	
	public Publisher(Topic topic, String msg) {
		this.topic = topic;
		this.msg = msg;
	}
	
	@Override
	public void run(){
		String threadName = Thread.currentThread().getName();
		System.out.println(threadName+" started!!!");
		
		try {
			System.out.println("Waiting for 5 sec");
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		synchronized (topic) {
			topic.setMsg(threadName+" has posted the message: "+msg);
			System.out.println("Publisher just published the message");
			for(int i = 0; i < 3; i++){
				topic.notify();
			}
			
//			topic.notifyAll();
		}
	}
	
}
