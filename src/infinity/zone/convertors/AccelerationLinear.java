package infinity.zone.convertors;

public class AccelerationLinear {
	

	/**
	 * @param args
	 * @return
	 */
	public String AL(String from, String to, Double Value) {
	
		// --------------------------------------- calc Angles
		Double foot_per_second_squared = 3.2808399;
		Double inch_per_second_squared = 39.370079;
		Double kilometer_per_second_squared = 0.001;
		Double meter_per_second_squared = 1.00;
		Double mile_per_second_squared = 0.00062137119;
		Double millimeter_per_second_squared = 1000.00;
		Double secondsfrom0to100k = 27.7777778;
		Double secondsfrom0to100m = 44.7039998;
		Double secondsfrom0to200 = 89.4080037;
		Double secondsfrom0to60  = 26.8223997;
		

		Double unit_one = 0.0;
		Double unit_two = 0.0;

		Double finalValue = Value;
	
		// ------------------------------------------------------
		if (from.equalsIgnoreCase("Foot per second squared")||from.equalsIgnoreCase("Фунт на секунду в квадрате")) {
			unit_one = foot_per_second_squared;

		} else if (from.equalsIgnoreCase("Inch per second squared")||from.equalsIgnoreCase("Дюйм на секунду в квадрате")) {
			unit_one = inch_per_second_squared;

		} else if (from.equalsIgnoreCase("Kilometer per second squared")||from.equalsIgnoreCase("Километр на секунду в квадрате")) {
			unit_one = kilometer_per_second_squared;

		} else if (from.equalsIgnoreCase("Meter per second squared")||from.equalsIgnoreCase("Метр на секунду в квадрате")) {
			unit_one = meter_per_second_squared;

		} else if (from.equalsIgnoreCase("Mile per second squared")||from.equalsIgnoreCase("Миля на секунду в квадрате")) {
			unit_one = mile_per_second_squared;


		} else if (from.equalsIgnoreCase("Millimeter per second squared")||from.equalsIgnoreCase("Миллиметр на секунду в квадрате")) {
			unit_one = millimeter_per_second_squared;


		} else if (from.equalsIgnoreCase("Seconds from 0 to 100 km/h")||from.equalsIgnoreCase("Секунд от 0 до 100 км/ч")) {
			unit_one = secondsfrom0to100k;


		} else if (from.equalsIgnoreCase("Seconds from 0 to 100 mph")||from.equalsIgnoreCase("Секунд от 0 до 100 миль в час")) {
			unit_one = secondsfrom0to100m;


		} else if (from.equalsIgnoreCase("Seconds from 0 to 200 mph")||from.equalsIgnoreCase("Секунд от 0 до 200 миль в час")) {
			unit_one = secondsfrom0to200;


		} else if (from.equalsIgnoreCase("Seconds from 0 to 60 mph")||from.equalsIgnoreCase("Секунд от 0 до 60 миль в час")) {
			
			unit_one = secondsfrom0to60;

		} 

		

		// ------- Convert To
		if (to.equalsIgnoreCase("Foot per second squared")||to.equalsIgnoreCase("Фунт на секунду в квадрате")) {
			unit_two = foot_per_second_squared;

		} else if (to.equalsIgnoreCase("Inch per second squared")||to.equalsIgnoreCase("Дюйм на секунду в квадрате")) {
			unit_two = inch_per_second_squared;

		} else if (to.equalsIgnoreCase("Kilometer per second squared")||to.equalsIgnoreCase("Километр на секунду в квадрате")) {
			unit_two = kilometer_per_second_squared;

		} else if (to.equalsIgnoreCase("Meter per second squared")||to.equalsIgnoreCase("Метр на секунду в квадрате")) {
			unit_two = meter_per_second_squared;

		} else if (to.equalsIgnoreCase("Mile per second squared")||to.equalsIgnoreCase("Миля на секунду в квадрате")) {
			unit_two = mile_per_second_squared;


		} else if (to.equalsIgnoreCase("Millimeter per second squared")||to.equalsIgnoreCase("Миллиметр на секунду в квадрате")) {
			unit_two = millimeter_per_second_squared;


		} else if (to.equalsIgnoreCase("Seconds from 0 to 100 km/h")||to.equalsIgnoreCase("Секунд от 0 до 100 км/ч")) {
			unit_two = secondsfrom0to100k;


		} else if (to.equalsIgnoreCase("Seconds from 0 to 100 mph")||to.equalsIgnoreCase("Секунд от 0 до 100 миль в час")) {
			unit_two = secondsfrom0to100m;


		} else if (to.equalsIgnoreCase("Seconds from 0 to 200 mph")||to.equalsIgnoreCase("Секунд от 0 до 200 миль в час")) {
			unit_two = secondsfrom0to200;


		} else if (to.equalsIgnoreCase("Seconds from 0 to 60 mph")||to.equalsIgnoreCase("Секунд от 0 до 60 миль в час")) {
			
			unit_two = secondsfrom0to60;

		} 

		// ----------
		finalValue = finalValue * (unit_two / unit_one);
		// -----------------------
		return String.valueOf(finalValue);
	}
}
