package com.wowcher.test.utils;


public class TimeConverter {
	
	public static String convertTimeToWords(String time) {
			    String[] parts = time.split(":");
			    int hours = Integer.parseInt(parts[0]);
			    int minutes = Integer.parseInt(parts[1]);

			    if (hours < 0 || hours > 23 || minutes < 0 || minutes > 59) {
			        return "Invalid time format.";
			    }

			    String[] numbers = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
			                        "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen",
			                        "eighteen", "nineteen"};
			    String[] tens = {"", "", "twenty", "thirty", "forty", "fifty"};

			    String timeInWords = "It's ";
			    
			    if (hours == 0) {
			        timeInWords += "twelve";
			    } else if (hours <= 12) {
			        timeInWords += numbers[hours];
			    } else {
			        timeInWords += numbers[hours - 12];
			    }

			    if (minutes == 0) {
			        timeInWords += hours == 0 || hours == 12 ? " Midnight" : " Midday";
			    } else if (minutes < 20) {
			        timeInWords += " " + numbers[minutes];
			    } else {
			        timeInWords += " " + tens[minutes / 10] + " " + numbers[minutes % 10];
			    }

			    return timeInWords;
			}
		 
		 
	    }

