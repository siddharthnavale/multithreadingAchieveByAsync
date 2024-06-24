package com.multithreading.multithreading.sevice;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class StoringService {
	
	@Autowired
	private GetLengthService service;
	
	public void addValues() {
		log.info("Start preaparing the task list");
		ArrayList<String> taskList = new ArrayList<>();
		taskList.add("Siddharth");
		taskList.add("Varun");
		taskList.add("Deepak");
		taskList.add("Mayur");
		taskList.add("Rahul");
		taskList.add("John");
		taskList.add("rutik");
		taskList.add("rock");
		taskList.add("nilesh");
		taskList.add("pranshu");
	
		log.info("Start processing the task list");
		for(String payload : taskList) {
			try {
				service.processTask(payload);// this tasks is executed by different thread
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		log.info("Completed processing the task list");
	}

}
