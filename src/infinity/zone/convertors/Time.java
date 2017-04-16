package infinity.zone.convertors;

public class Time {

	/**
	 * @param args
	 * @return
	 */
	public String Time(String from, String to, Double Value) {

		// --------------------------------------- calc Angles
		Double century = 0.000191653648;
		Double Gregorianyear = 0.0191653648;
		Double Julianyear = 0.0191649557;
		Double calendarmonth = 0.229984347;
		Double week = 1.00;
		Double day = 7.00;
		Double hour = 168.00;
		Double minute = 10080.00;
		Double second = 604800.00;
		Double anomalisticyear = 0.01916445;
		Double sydericyear = 0.019164622;
		Double tropicyear = 0.019165365;
		Double draconticyear = 0.020195024;
		Double synodicmonth = 0.23704233;
		Double sydericmonth = 0.25620692;
		Double anomalisticmonth = 0.25404154;
		Double draconticmonth = 0.25724096;

		Double unit_one = 0.0;
		Double unit_two = 0.0;

		Double finalValue = Value;

		// ------------------------------------------------------
		if (from.equalsIgnoreCase("Anomalistic month")||from.equalsIgnoreCase("Аномалистический месяц")) {
			unit_one = anomalisticmonth;

		} else if (from.equalsIgnoreCase("Anomalistic year")||from.equalsIgnoreCase("Аномалистический год")) {
			unit_one = anomalisticyear;

		} else if (from.equalsIgnoreCase("Calendar month")||from.equalsIgnoreCase("Календарный месяц")) {
			unit_one = calendarmonth;

		} else if (from.equalsIgnoreCase("Century")||from.equalsIgnoreCase("Век")) {
			unit_one = century;

		} else if (from.equalsIgnoreCase("Day")||from.equalsIgnoreCase("День")) {
			unit_one = day;

		} else if (from.equalsIgnoreCase("Dracontic month")||from.equalsIgnoreCase("Драконический месяц")) {
			unit_one = draconticmonth;

		} else if (from.equalsIgnoreCase("Dracontic year")||from.equalsIgnoreCase("Драконический год")) {
			unit_one = draconticyear;

		} else if (from.equalsIgnoreCase("Gregorian year")||from.equalsIgnoreCase("Грегорианский год")) {
			unit_one = Gregorianyear;

		} else if (from.equalsIgnoreCase("Hour")||from.equalsIgnoreCase("Час")) {
			unit_one = hour;

		} else if (from.equalsIgnoreCase("Julian year")||from.equalsIgnoreCase("Юлианский год")) {

			unit_one = Julianyear;

		} else if (from.equalsIgnoreCase("Minute")||from.equalsIgnoreCase("Минута")) {
			unit_one = minute;

		} else if (from.equalsIgnoreCase("Second")||from.equalsIgnoreCase("Секунда")) {
			unit_one = second;

		} else if (from.equalsIgnoreCase("Syderic month")||from.equalsIgnoreCase("Сидерический месяц")) {

			unit_one = sydericmonth;

		} else if (from.equalsIgnoreCase("Syderic year")||from.equalsIgnoreCase("Сидерический год")) {
			unit_one = sydericyear;

		} else if (from.equalsIgnoreCase("Synodic month")||from.equalsIgnoreCase("Синодический месяц")) {
			unit_one = sydericmonth;

		} else if (from.equalsIgnoreCase("Tropic year")||from.equalsIgnoreCase("Тропический год")) {

			unit_one = tropicyear;

		} else if (from.equalsIgnoreCase("Week")||from.equalsIgnoreCase("Неделя")) {

			unit_one = week;
		}

		// ------- Convert To
		// ------------------------------------------------------
		if (to.equalsIgnoreCase("Anomalistic month")||to.equalsIgnoreCase("Аномалистический месяц")) {
			unit_two = anomalisticmonth;

		} else if (to.equalsIgnoreCase("Anomalistic year")||to.equalsIgnoreCase("Аномалистический год")) {
			unit_two = anomalisticyear;

		} else if (to.equalsIgnoreCase("Calendar month")||to.equalsIgnoreCase("Календарный месяц")) {
			unit_two = calendarmonth;

		} else if (to.equalsIgnoreCase("Century")||to.equalsIgnoreCase("Век")) {
			unit_two = century;

		} else if (to.equalsIgnoreCase("Day")||to.equalsIgnoreCase("День")) {
			unit_two = day;

		} else if (to.equalsIgnoreCase("Dracontic month")||to.equalsIgnoreCase("Драконический месяц")) {
			unit_two = draconticmonth;

		} else if (to.equalsIgnoreCase("Dracontic year")||to.equalsIgnoreCase("Драконический год")) {
			unit_two = draconticyear;

		} else if (to.equalsIgnoreCase("Gregorian year")||to.equalsIgnoreCase("Грегорианский год")) {
			unit_two = Gregorianyear;

		} else if (to.equalsIgnoreCase("Hour")||to.equalsIgnoreCase("Час")) {
			unit_two = hour;

		} else if (to.equalsIgnoreCase("Julian year")||to.equalsIgnoreCase("Юлианский год")) {

			unit_two = Julianyear;

		} else if (to.equalsIgnoreCase("Minute")||to.equalsIgnoreCase("Минута")) {
			unit_two = minute;

		} else if (to.equalsIgnoreCase("Second")||to.equalsIgnoreCase("Секунда")) {
			unit_two = second;

		} else if (to.equalsIgnoreCase("Syderic month")||to.equalsIgnoreCase("Сидерический месяц")) {

			unit_two = sydericmonth;

		} else if (to.equalsIgnoreCase("Syderic year")||to.equalsIgnoreCase("Сидерический год")) {
			unit_two = sydericyear;

		} else if (to.equalsIgnoreCase("Synodic month")||to.equalsIgnoreCase("Синодический месяц")) {
			unit_two = sydericmonth;

		} else if (to.equalsIgnoreCase("Tropic year")||to.equalsIgnoreCase("Тропический год")) {

			unit_two = tropicyear;

		} else if (to.equalsIgnoreCase("Week")||to.equalsIgnoreCase("Неделя")) {

			unit_two = week;
		}

		// ----------
		finalValue = finalValue * (unit_two / unit_one);
		// -----------------------
		return String.valueOf(finalValue);
	}
}
