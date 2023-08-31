package com.wowcher.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

import com.wowcher.test.utils.TimeConverter;

public class TimeConverterTest {

	@Test
	void test_convertTimeToWords_Midnight() {
		assertEquals("It's twelve Midnight", TimeConverter.convertTimeToWords("00:00"));
	}
	
	@Test
	void test_convertTimeToWords_NightTime() {
		assertEquals("It's one twenty three", TimeConverter.convertTimeToWords("01:23"));
	}
	
	@Test
	void test_convertTimeToWords_DayTime() {
		assertEquals("It's three forty three", TimeConverter.convertTimeToWords("15:43"));
	}
	
	@Test
	void test_convertTimeToWords_InvalidCase() {
		assertNotEquals("Invalid time format", TimeConverter.convertTimeToWords("18:62"));
	}

}