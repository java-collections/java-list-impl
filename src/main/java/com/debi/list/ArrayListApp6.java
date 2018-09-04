package com.debi.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ArrayListApp6 {
	public static void main(String[] args) throws InterruptedException {
		List<Integer> al = Collections.synchronizedList(new ArrayList<>());
		al.add(5);
		al.add(7);
		al.add(9);

		ExecutorService executorService = Executors.newFixedThreadPool(20);

		Runnable task = () -> {
			incrementArrayList(al);
		};

		for (int i = 0; i < 100; i++) {
			executorService.submit(task);
		}

		executorService.shutdown();
		executorService.awaitTermination(60, TimeUnit.SECONDS);

		System.out.println(al);
	}

	private static void incrementArrayList(List<Integer> al) {
		synchronized (al) {
			for (int i = 0; i < al.size(); i++) {
				Integer value = al.get(i);
				al.set(i, value + 1);
			}
		}
	}
}
