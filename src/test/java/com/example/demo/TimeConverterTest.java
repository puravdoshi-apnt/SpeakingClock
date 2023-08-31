package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

public class TimeConverterTest {

	  @Test
	    void testConvertTimeToWords() {
	        assertEquals("It's twelve Midnight", TimeConverter.convertTimeToWords("00:00"));
	        assertEquals("It's one twenty three", TimeConverter.convertTimeToWords("01:23"));
	        assertEquals("It's three forty three", TimeConverter.convertTimeToWords("15:43"));
	        assertNotEquals("Invalid time format", TimeConverter.convertTimeToWords("18:62"));
	    }
	
	
}
