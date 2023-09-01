package com.veysel;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class Runner_Thread_Zamanlama {

	private static long start = System.currentTimeMillis();

	public static void main(String[] args) {
		System.out.println("Uygulama Başladı");
		start = System.currentTimeMillis();
		Runnable r1 = () -> {
			System.out.println("1.uygulama Çalıştı");
			System.out.println("Çalışma Zamanı..:" + (System.currentTimeMillis() - start));
		};
		Runnable r2 = () -> {
			System.out.println("2.uygulama Çalıştı");
			System.out.println("Çalışma Zamanı..:" + (System.currentTimeMillis() - start));
		};
		ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
		ScheduledFuture<?> sf1 = service.schedule(r1, 5, TimeUnit.SECONDS);
		ScheduledFuture<?> sf2 = service.schedule(r2, 3, TimeUnit.SECONDS);

		
	}

}
