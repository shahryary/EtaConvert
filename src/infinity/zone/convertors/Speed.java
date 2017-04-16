package infinity.zone.convertors;

public class Speed {
	

	/**
	 * @param args
	 * @return
	 */
	public String speed(String from, String to, Double Value) {
		 
	
		
		// --------------------------------------- calc Angles
		Double kilometer_per_second = 1.00;
		Double meter_per_second = 1000.00;
		Double kilometer_per_hour = 3600.00;
		Double meter_per_minute = 60000.00;
		Double mile_per_second = 0.62137119;
		Double mile_per_hour =2236.9363;
		Double foot_per_second = 3280.8399;
		Double foot_per_minute = 196850.39;
		Double minute_per_kilometer = 0.0166666667;
		Double second_per_kilometer = 1.00;
		Double second_per_100_metres = 0.10;
		Double minute_per_mile = 0.0268223997;
		Double second_per_mile =1.60934401;
		Double second_per_100_yards =0.0914399999;
		Double knot  = 1943.8445;
		Double sea_mile_per_hour = 1943.8445;

		Double unit_one = 0.0;
		Double unit_two = 0.0;

		Double finalValue = Value;

		// ------------------------------------------------------
		if (from.equalsIgnoreCase("Foot per minute")||from.equalsIgnoreCase("Фут в минуту")) {
			unit_one = foot_per_minute;

		} else if (from.equalsIgnoreCase("Foot per second")||from.equalsIgnoreCase("Фут в секунду")) {
			unit_one = foot_per_second;

		} else if (from.equalsIgnoreCase("kilometer per hour")||from.equalsIgnoreCase("Километр в час (км/ч)")) {
			unit_one = kilometer_per_hour;

		} else if (from.equalsIgnoreCase("Kilometer per second (km/s)")||from.equalsIgnoreCase("Километр в секунду (км/с)")) {
			unit_one = kilometer_per_second;

		} else if (from.equalsIgnoreCase("Knot")||from.equalsIgnoreCase("Узел")) {
			unit_one = knot;


		} else if (from.equalsIgnoreCase("Meter per minute")||from.equalsIgnoreCase("Метр в минуту")) {
			unit_one = meter_per_minute;


		} else if (from.equalsIgnoreCase("Meter per second (m/s)")||from.equalsIgnoreCase("Метр в секунду (м/с)")) {
			unit_one = meter_per_second;


		} else if (from.equalsIgnoreCase("Mile per hour (mph)")||from.equalsIgnoreCase("Миля в час")) {
			unit_one = mile_per_hour;


		} else if (from.equalsIgnoreCase("Mile per second")||from.equalsIgnoreCase("Миля в секунду")) {
			unit_one = mile_per_second;


		} else if (from.equalsIgnoreCase("Minute per kilometer")||from.equalsIgnoreCase("Минута на километр")) {
			
			unit_one = minute_per_kilometer;

		} else if (from.equalsIgnoreCase("Minute per mile")||from.equalsIgnoreCase("Минута на милю")) {
			unit_one = minute_per_mile;


		} else if (from.equalsIgnoreCase("Sea mile per hour")||from.equalsIgnoreCase("Морская миля в час")) {
			unit_one = sea_mile_per_hour;


		} else if (from.equalsIgnoreCase("Second per 100 metres")||from.equalsIgnoreCase("Секунда на стометровку")) {
			
			unit_one = second_per_100_metres;

		} else if (from.equalsIgnoreCase("Second per 100 yards")||from.equalsIgnoreCase("Секунда на сто ярдов")) {
			unit_one = second_per_100_yards;


		} else if (from.equalsIgnoreCase("Second per kilometer")||from.equalsIgnoreCase("Секунда на километр")) {
			unit_one = second_per_kilometer;


		} else if (from.equalsIgnoreCase("Second per mile")||from.equalsIgnoreCase("Секунда на милю")) {
			
			unit_one = second_per_mile;

		}

		

		// ------- Convert To
		if (to.equalsIgnoreCase("Foot per minute")||to.equalsIgnoreCase("Фут в минуту")) {
			unit_two = foot_per_minute;

		} else if (to.equalsIgnoreCase("Foot per second")||to.equalsIgnoreCase("Фут в секунду")) {
			unit_two = foot_per_second;

		} else if (to.equalsIgnoreCase("kilometer per hour")||to.equalsIgnoreCase("Километр в час (км/ч)")) {
			unit_two = kilometer_per_hour;

		} else if (to.equalsIgnoreCase("Kilometer per second (km/s)")||to.equalsIgnoreCase("Километр в секунду (км/с)")) {
			unit_two = kilometer_per_second;

		} else if (to.equalsIgnoreCase("Knot")||to.equalsIgnoreCase("Узел")) {
			unit_two = knot;


		} else if (to.equalsIgnoreCase("Meter per minute")||to.equalsIgnoreCase("Метр в минуту")) {
			unit_two = meter_per_minute;


		} else if (to.equalsIgnoreCase("Meter per second (m/s)")||to.equalsIgnoreCase("Метр в секунду (м/с)")) {
			unit_two = meter_per_second;


		} else if (to.equalsIgnoreCase("Mile per hour (mph)")||to.equalsIgnoreCase("Миля в час")) {
			unit_two = mile_per_hour;


		} else if (to.equalsIgnoreCase("Mile per second")||to.equalsIgnoreCase("Миля в секунду")) {
			unit_two = mile_per_second;


		} else if (to.equalsIgnoreCase("Minute per kilometer")||to.equalsIgnoreCase("Минута на километр")) {
			
			unit_two = minute_per_kilometer;

		} else if (to.equalsIgnoreCase("Minute per mile")||to.equalsIgnoreCase("Минута на милю")) {
			unit_two = minute_per_mile;


		} else if (to.equalsIgnoreCase("Sea mile per hour")||to.equalsIgnoreCase("Морская миля в час")) {
			unit_two = sea_mile_per_hour;


		} else if (to.equalsIgnoreCase("Second per 100 metres")||to.equalsIgnoreCase("Секунда на стометровку")) {
			
			unit_two = second_per_100_metres;

		} else if (to.equalsIgnoreCase("Second per 100 yards")||to.equalsIgnoreCase("Секунда на сто ярдов")) {
			unit_two = second_per_100_yards;


		} else if (to.equalsIgnoreCase("Second per kilometer")||to.equalsIgnoreCase("Секунда на километр")) {
			unit_two = second_per_kilometer;


		} else if (to.equalsIgnoreCase("Second per mile")||to.equalsIgnoreCase("Секунда на милю")) {
			
			unit_two = second_per_mile;

		}

		// ----------
		finalValue = finalValue * (unit_two / unit_one);
		// -----------------------
		return String.valueOf(finalValue);
	}
}
