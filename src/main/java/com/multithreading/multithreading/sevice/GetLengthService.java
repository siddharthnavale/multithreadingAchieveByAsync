package com.multithreading.multithreading.sevice;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class GetLengthService {

	@Async("CustomAsyncPool")
	public void processTask(String s) throws InterruptedException {
		
		log.info("Starting Thread - Processing Payload {}",s);
		log.info("Length of payload string is {}",s.length());
		Thread.sleep(100);
		log.info("Exiting thread - processing payload {} completed",s);
	}
//This method will be executed in a separate thread from the CustomAsyncPool thread pool.
// using @Async with a custom thread pool allows the processTask method to be executed asynchronously by different threads at different times
//This means up to 10 threads can process tasks simultaneously, and more tasks will wait in the queue until a thread becomes available.
}
