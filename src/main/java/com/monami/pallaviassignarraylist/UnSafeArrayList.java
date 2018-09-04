package com.monami.pallaviassignarraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class UnSafeArrayList {
	public static void main(String[] args) throws InterruptedException {
		List<Integer> in=new ArrayList<>();
		in.add(1);
		in.add(2);
		in.add(3);
		ExecutorService es=Executors.newFixedThreadPool(10);
		Runnable task= () ->{
			incrementArrayList((in));
		};
		for(int i = 0; i < 100; i++) {
            es.submit(task);
        }

        es.shutdown();
        es.awaitTermination(60, TimeUnit.SECONDS);

        System.out.println(in);
    }

   
    private static void incrementArrayList(List<Integer> in) {
        for(int i = 0; i < in.size(); i++) {
            Integer value = in.get(i);
            in.set(i, value + 1);
        }
    }

	
	}


