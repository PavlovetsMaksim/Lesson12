package edu.training.lesson12.example06;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
    	this.hour = hour;
    	this.minute = minute;
    	this.second = second;
    	
    	setHour(hour);
		setMinute(minute);
		setSecond(second);
    }

    public void setHour(int hour) {
        this.hour = hour;

        if (hour > 23) {
            this.hour = 0;
        }
    }

    public void setMinute(int minute) {
        this.minute = minute;

        if (minute > 59) {
            this.minute = 0;
        }
    }

    public void setSecond(int second) {
        this.second = second;

        if (second > 59) {
            this.second = 0;
        }
    }
    
    public void printTime() {
  	  System.out.println(hour + ":" + minute + ":" + second);
  	 }
}
