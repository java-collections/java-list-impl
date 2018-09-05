package com.java.pallaviassignlist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class SynchronizeArrayList {
	public static void main(String[] args) throws InterruptedException {
		List<Integer> sa = Collections.synchronizedList(new ArrayList<>());
		sa.add(1);
		sa.add(2);
		sa.add(3);
		ExecutorService es = Executors.newFixedThreadPool(10);
		Runnable task = () -> {
			incrementArrayList(sa);
		};
		for (int i = 0; i < 100; i++) {
			es.submit(task);
		}
		es.shutdown();
		es.awaitTermination(60, TimeUnit.SECONDS);
		System.out.println(sa);
	}

	private static void incrementArrayList(List<Integer> sa) {
		synchronized (sa) {
			for (int i = 0; i < sa.size(); i++) {
				Integer value = sa.get(i);
				sa.set(i, value + 1);

			}

		}
	}
}
