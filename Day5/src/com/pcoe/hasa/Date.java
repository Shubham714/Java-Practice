package com.pcoe.hasa;

public class Date {
  int day,month,year;

public Date(int day, int month, int year) {
	super();
	this.day = day;
	this.month = month;
	this.year = year;
}

@Override
public String toString() {
	return "Date ["+ day +"-"+ month +"-"+year +"]";
}
  
}
