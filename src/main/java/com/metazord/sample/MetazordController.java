package com.metazord.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/metazord")
public class MetazordController {

	@Autowired
	MetazordService metazordService;

	@GetMapping
	public String hello() {
		return metazordService.hello();
	}
}
