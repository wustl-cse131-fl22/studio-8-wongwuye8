package studio8;

import java.util.HashSet;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Objects;

public class Date {

	private int month;
	private int day;
	private int year;
	private boolean holiday;

	/**
	 * Makes the date
	 * @param m month
	 * @param d day
	 * @param y year
	 */
	public Date (int m, int d, int y) {
		month = m;
		day = d;
		year = y;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public boolean isHoliday() {
		return holiday;
	}

	public void setHoliday(boolean holiday) {
		this.holiday = holiday;
	}


	@Override
	public int hashCode() {
		return Objects.hash(day, holiday, month, year);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Date other = (Date) obj;
		return day == other.day && holiday == other.holiday && month == other.month && year == other.year;
	}

	@Override
	public String toString() {
		return month + "/" + day + "/" + year;
	}    
	public static void main(String[] args) {
		Date today1 = new Date (11, 16, 2022);
		Date today2 = new Date (11, 16, 2022);
		Date today3 = new Date (10, 10, 2002);
		Date today4 = new Date (1, 14, 2000);
		Date today5 = new Date (11, 6, 2022);
		LinkedList<Date> list = new LinkedList<Date>();
		list.add(today1);
		list.add(today2);
		list.add(today3);
		list.add(today4);
		list.add(today5);
		System.out.println(list); 
		HashSet<Date> set = new HashSet<Date>();
		set.add(today1);
		set.add(today2);
		set.add(today3);
		set.add(today4);
		set.add(today5);
		System.out.println(set);
	}

}
