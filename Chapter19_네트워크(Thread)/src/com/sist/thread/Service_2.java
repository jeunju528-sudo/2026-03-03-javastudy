package com.sist.thread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Service_2 {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// TODO Auto-generated method stub
		ExecutorService ex = Executors.newSingleThreadExecutor();
//		ex.submit(()->System.out.println("A"));
//		ex.submit(()->System.out.println("B"));
//		ex.shutdown();
		
//		for(int i=1; i<=10; i++) {
//			int n=i;
//			ex.submit(()->System.out.println("작업:"+n));
//		}
		
		Future<Integer> result = ex.submit(()->10+20);
		System.out.println(result.get());
		ex.shutdown();
	}

}
