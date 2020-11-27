package com.task;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Scheduler{

	private static final SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");

	//Fires every 10 seconds
	@Scheduled(cron = "0/10 * * * * *")
	public void performTaskUsingCron() {

		System.out.println("Regular task performed using Cron at "+ dateFormat.format(new Date()));

	}
	//Fires every 1 second
	@Scheduled(fixedRate = 1000)
	public void performTask() {

		System.out.println("Fixed Rate Regular task performed  "
				+ dateFormat.format(new Date()));

	}

	//Runs every second but waits 5 seconds before it executes for the first time:
	@Scheduled(fixedRate = 1000, initialDelay = 5000)
	public void performDelayedTask() {

		System.out.println("Delayed Regular task performed at "
				+ dateFormat.format(new Date()));

	}

	}
