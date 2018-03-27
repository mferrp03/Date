package es.unileon.prg1.date;

public class MainDate {

	public static void main(String[] args) {
		Date today, tomorrow;
		today = new Date(26, 12, 2018);
		tomorrow = new Date(20, 3, 2018);
		System.out.println(today + " months left? " + today.monthsLeft());
	}

}

