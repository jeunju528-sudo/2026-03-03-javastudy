package com.sist.thread;


class MyThread extends Thread{ // 가급적 Thread 상속 사용 X
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println(currentThread()+", "+i);
			try {
				Thread.sleep(100);
				
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}
public class Thread_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread t1 = new MyThread();
		MyThread t2 = new MyThread();
		MyThread t3 = new MyThread();
		
		t1.setName("말");
		t2.setName("소");
		t3.setName("돼지");
		
		// 우선 순위 변경
		t1.setPriority(10); // 가장 빠른 속도
		t2.setPriority(3);
		t3.setPriority(1);

		t1.start();
		t2.start();
		t3.start();
	}

}
 