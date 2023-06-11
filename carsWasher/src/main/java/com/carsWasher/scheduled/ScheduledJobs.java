package com.carsWasher.scheduled;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledJobs {
	
	@Scheduled(fixedRate = 1000, initialDelay = 4000)
	public void scheduledJop() {
		System.out.println("Job running at:" + new Date());
	}

}
