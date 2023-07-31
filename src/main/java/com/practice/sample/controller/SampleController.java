package com.practice.sample.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class SampleController {

	@GetMapping("/")
	public Map<String, Object> getDetails() {
		Map<String, Object> map = new HashMap<>();
		map.put("first name", "ABC");
		map.put("last name", "XYZ");
		map.put("mobile number", "123456789");
		return map;
	}
}