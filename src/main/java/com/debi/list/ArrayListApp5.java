package com.debi.list;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ArrayListApp5 {
	public static void main(String[] args) throws InterruptedException {
		List<Integer> integer = new ArrayList<>();
		integer.add(10);
		integer.add(11);
		integer.add(12);

		ExecutorService executorService = Executors.newFixedThreadPool(20);

		Runnable task = () -> {
			incrementArrayList(integer);
		};

		for (int i = 0; i < 100; i++) {
			executorService.submit(task);
		}

		executorService.shutdown();
		executorService.awaitTermination(60, TimeUnit.SECONDS);

		System.out.println(integer);
	}

	private static void incrementArrayList(List<Integer> integer) {
		for (int i = 0; i < integer.size(); i++) {
			Integer value = integer.get(i);
			integer.set(i, value + 1);
		}
	}
}