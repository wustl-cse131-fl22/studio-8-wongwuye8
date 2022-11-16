package studio8;

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
	public String toString() {
		return month + "/" + day + "/" + year;
}    
public static void main(String[] args) {
		Date today = new Date (11, 16, 2022);
    	System.out.println("the date is: " + today.toString()); 
    }

}
