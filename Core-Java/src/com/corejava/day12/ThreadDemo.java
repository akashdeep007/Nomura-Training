package com.corejava.day12;

public class ThreadDemo {

	public static void main(String[] argsa){
		System.out.println("Active thread count: "+Thread.activeCount());
		Runnable r1 = new MyThread1();
		Thread t1 = new Thread(r1);
		t1.setName("MyThread-1");
		t1.setPriority(Thread.MIN_PRIORITY);
		
		System.out.println("Active thread count: "+Thread.activeCount());
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i = 0; i<10; i++){
					System.out.println(Thread.currentThread().getName()+" is executing with priority: "+Thread.currentThread().getPriority());
					if(i == 5){
						try {
							Thread.sleep(2000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
			}
		});
		t2.setName("MyThread-2");

		t2.setPriority(Thread.MAX_PRIORITY);
		
		System.out.println("Active thread count: "+Thread.activeCount());
		Thread.currentThread().setName("Main Thread");
		t1.start();
		t2.start();
		System.out.println(Thread.currentThread().getName()+" is executing with priority: "+Thread.currentThread().getPriority());
	}
	
}

class MyThread1 implements Runnable {
	
	@Override
	public void run(){
		for(int i = 0; i<10; i++){
			System.out.println(Thread.currentThread().getName()+" is executing with priority: "+Thread.currentThread().getPriority());
			if(i == 5){
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
		/*System.out.println("Active thread count from MyThread1: "+Thread.activeCount());
		System.out.println(Thread.currentThread().getName()+" executed!!!");
		ChildThread1 c1 = new ChildThread1("Child Thread 1");
		c1.start();
		System.out.println("Active thread count from MyThread1: "+Thread.activeCount());
		
		ChildThread2 c2 = new ChildThread2("Child Thread 2");
		c2.start();
		System.out.println("Active thread count from MyThread1: "+Thread.activeCount());*/
	}
	
}


class ChildThread1 extends Thread{
	private String name;
	public ChildThread1(String name){
		this.name = name;
	}
	
	public void run(){
		Thread.currentThread().setName(this.name);
		for(int i = 0; i<10; i++){
			System.out.println(Thread.currentThread().getName());
		}
	}
}

class ChildThread2 extends Thread{
	private String name;
	public ChildThread2(String name){
		this.name = name;
	}
	
	public void run(){
		Thread.currentThread().setName(this.name);
		for(int i = 0; i<10; i++){
			System.out.println(Thread.currentThread().getName());
		}
	}
}
