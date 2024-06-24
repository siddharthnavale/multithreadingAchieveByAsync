package com.multithreading.multithreading.config;

import java.util.concurrent.Executor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

@EnableAsync
@Configuration
public class AsyncConfig {
	
	@Bean(name="CustomAsyncPool")
	public Executor getThredPoolExecutor(){
		
		ThreadPoolTaskExecutor executor= new ThreadPoolTaskExecutor();
		executor.setCorePoolSize(5);
		executor.setMaxPoolSize(10);
		executor.setThreadNamePrefix("CustomAsyncPoolThread-");
		executor.initialize();
		 return executor;
	}
	

}
