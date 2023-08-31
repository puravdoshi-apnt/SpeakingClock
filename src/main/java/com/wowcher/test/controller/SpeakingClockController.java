package com.wowcher.test.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wowcher.test.utils.TimeConverter;

@RestController
public class SpeakingClockController {

	@GetMapping("/convert")
	public ResponseEntity<String> convertToWords(@RequestParam String time) {
		try {
			String convertedTime = TimeConverter.convertTimeToWords(time);
			return ResponseEntity.ok(convertedTime);
		} catch (IllegalArgumentException e) {
			return ResponseEntity.badRequest().body("Invalid time format.");
		}
	}
}
