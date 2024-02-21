package com.metazord.sample;

import org.springframework.stereotype.Service;

@Service
public class MetazordService {

	public MetazordService() {
		System.out.println("Metazord Service :: Constructor loaded");
	}

	public String hello() {
		return "Welcome to House of Metazord, Homies!!";
	}
}