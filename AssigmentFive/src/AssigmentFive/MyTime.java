package AssigmentFive;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MyTime {

	private int hour; 
	private int minute; 
	private int second;
	
	public MyTime() {
		this.hour  = 0;
		this.minute = 0;
		this.second = 0;
	}
	
	public MyTime(int h) {
		this.hour = h;
		this.minute = 0;
		this.second = 0;
	}
	
	public MyTime(int h, int minute) {
		this.hour = h;
		this.minute = minute;
		this.second = 0;
	}
	
	public MyTime(int h, int min, int sec) {
		this.hour = h;
		this.minute = min;
		this.second = sec;
	}
	
	public int getHour() {
		return this.hour;
	}
	
	public int getMinute() {
		return this.minute;
	}
	
	public int getSecond() {
		return this.second;
	}
	
	public boolean setHour(int hour) {
		if(hour > 24 || hour < 0) {
			return false;
		} else {
			this.hour = hour;
			return true;
		}
	}
	
	public boolean setMinute(int minute) {
		if(minute > 60 || minute < 0) {
			return false;
		} else {
			this.minute = minute;
			return true;
		}
	}
	
	public boolean setSecond(int second) {
		if(second > 60 || second < 0) {
			return false;
		} else {
			this.second = second;
			return false;
		}
	}
	
	public String to12HourFormat(int hour, int minute, int second) {
		 
		String input = hour + ":" + minute + ":" + second;
		DateFormat df = new SimpleDateFormat("HH:mm:ss");
		DateFormat outputformat = new SimpleDateFormat("hh:mm:ss aa");
		Date date = null;
		String output = null;
		
		try {
			date = df.parse(input);
			output = outputformat.format(date);
		 	  System.out.println(output);
		} catch(ParseException pe){
    	    pe.printStackTrace();
    	 }
		
		return "";
	}
	
	public String to24HourFormat(int hour, int minute, int second, String time) {
		 
		String input = hour + ":" + minute + ":" + second + " " + time;
		DateFormat df = new SimpleDateFormat("hh:mm:ss aa");
		DateFormat outputformat = new SimpleDateFormat("HH:mm:ss");
		Date date = null;
		String output = null;
		
		try {
			date = df.parse(input);
			output = outputformat.format(date);
		 	  System.out.println(output);
		} catch(ParseException pe){
    	    pe.printStackTrace();
    	 }
		
		return "";
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyTime getDefaultTime = new MyTime();
		getDefaultTime.to24HourFormat(5,24,3,"PM");
	}

}
