package studio8;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Objects;

public class Appointment {

	private Date date;
	private Time time;

	public Appointment(Date date, Time time) {
		super();
		this.date = date;
		this.time = time;
	}

	@Override
	public int hashCode() {
		return Objects.hash(date, time);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Appointment other = (Appointment) obj;
		return Objects.equals(date, other.date) && Objects.equals(time, other.time);
	}

	@Override
	public String toString() {
		return "Appointment [date=" + date + ", time=" + time + "]";
	}

	public static void main(String[] args) {

		Date today1 = new Date (11, 16, 2022);
		Date today2 = new Date (11, 16, 2022);
		Date today3 = new Date (10, 10, 2002);
		Date today4 = new Date (1, 14, 2000);
		Date today5 = new Date (11, 6, 2022);
		Time now1 = new Time (16, 22, false);
		Time now2 = new Time (16, 22, false);
		Time now3 = new Time (10, 22, true);
		Time now4 = new Time (12, 2, false);
		Time now5= new Time (10, 3, true);
		Appointment app1 = new Appointment(today1, now1);
		Appointment app2 = new Appointment(today2, now2);
		Appointment app3 = new Appointment(today3, now3);
		Appointment app4 = new Appointment(today4, now4);
		Appointment app5 = new Appointment(today5, now5);
		HashSet<Appointment> Calendar = new HashSet<Appointment>();
		Calendar.add(app1);
		Calendar.add(app2);
		Calendar.add(app3);
		Calendar.add(app4);
		Calendar.add(app5);
		System.out.println(Calendar);
	}

}
