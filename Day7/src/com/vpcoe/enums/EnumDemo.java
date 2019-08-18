package com.vpcoe.enums;
public class EnumDemo {
	public static int val=788;
	public enum weekdays{
		MONDAY,
		TUESDAY,
	    WEDNESDAY,
	    THURSDAY,
	    FRIDAY,
	    SATURDAY,
	    SUNDAY
	 };
	 
	public void displayEnum() {
	//	 System.out.println("Enum:"+weekdays.MONDAY);
		 
		 for(Enum day:weekdays.values()) {
			 System.out.println(day);
		 }
	 }
	 
	 void switchCase() {
		 switch(weekdays.MONDAY) {
		 case MONDAY:
			 System.out.println("Today is Monday");
		 }
	 }
	 
	public static void main(String[] args) {
		new EnumDemo().switchCase();
	}
}
