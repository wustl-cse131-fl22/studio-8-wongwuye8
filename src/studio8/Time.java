package studio8;


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


	public String toString() {
		if(military) {
			return hour + ":" + minute;
		}
		else {
			return (hour-12) + ":" + minute;
		}
		}
	
	
	public static void main(String[] args) {
		Time now = new Time (16, 22, false);
    	System.out.println("the time is: " + now.toString()); 
    	
    }

}