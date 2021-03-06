package qyiz;

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
}

class GetDate {
	
	public static void main(String[] args) {
		MyTime getDefaultTime = new MyTime();
		System.out.print(getDefaultTime);
	}
	
}
