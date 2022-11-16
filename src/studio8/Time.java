package studio8;

import java.util.HashSet;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Objects;

public class Time {

	private int hour;
	private int minute;
	private boolean military;
	/**
	 * Makes the time
	 * @param h hour
	 * @param m minute
	 */
	public Time (int h, int m, boolean mil) {
		hour = h;
		minute = m;
		military = mil;
	}

	public int getHour() {
		return hour;
	}


	public void setHour(int hour) {
		this.hour = hour;
	}


	public int getMinute() {
		return minute;
	}


	public void setMinute(int minute) {
		this.minute = minute;
	}


	public boolean isMilitary() {
		return military;
	}


	public void setMilitary(boolean military) {
		this.military = military;
	}


	@Override
	public int hashCode() {
		return Objects.hash(hour, military, minute);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Time other = (Time) obj;
		return hour == other.hour && military == other.military && minute == other.minute;
	}

	public String toString() {
		if(military) {
			return hour + ":" + minute;
		}
		else {
			return (hour-12) + ":" + minute;
		}
	}


	public static void main(String[] args) {
		Time now1 = new Time (16, 22, false);
		Time now2 = new Time (16, 22, false);
		Time now3 = new Time (10, 22, true);
		Time now4 = new Time (12, 2, false);
		Time now35= new Time (10, 3, true);
		LinkedList<Time> list = new LinkedList<Time>();
		System.out.println("the time is: " + now1.equals(Now2)); 

	}

}