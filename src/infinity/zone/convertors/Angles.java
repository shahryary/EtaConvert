package infinity.zone.convertors;

import android.app.Activity;

public class Angles  extends Activity {



	/**
	 * @param args
	 * @return
	 */
	public String Angles(String from, String to, Double Value) {

		// --------------------------------------- calc Angles
		Double circle = 1.00;
		Double radian = 6.28318530717958647692;
		Double digree = 360.00;
		Double grad = 400.00;
		Double sextant = 6.00;
		Double minute = 21600.00;
		Double second = 1296000.00;

		Double unit_one = 0.0;
		Double unit_two = 0.0;

		Double finalValue = Value;
		// ------------------------------------------------------
		// ------------------------------------------------------
		if (from.equalsIgnoreCase("Digree")||from.equalsIgnoreCase("Градус")) {
			unit_one = digree;

		} else if (from.equalsIgnoreCase("Radian")||from.equalsIgnoreCase("Радиан")) {
			unit_one = radian;

		} else if (from.equalsIgnoreCase("Circle")||from.equalsIgnoreCase("Окружность")) {
			unit_one = circle;

		} else if (from.equalsIgnoreCase("Grad")||from.equalsIgnoreCase("Град")) {
			unit_one = grad;

		} else if (from.equalsIgnoreCase("Sextant")||from.equalsIgnoreCase("Секстант")) {
			unit_one = sextant;


		} else if (from.equalsIgnoreCase("Minute")||from.equalsIgnoreCase("Минута")) {
			unit_one = minute;


		} else if (from.equalsIgnoreCase("Second")||from.equalsIgnoreCase("Секунда")) {
			unit_one = second;


		} 

		// ------- Convert To
		if (to.equalsIgnoreCase("Digree")||to.equalsIgnoreCase("Градус")) {
			unit_two = digree;

		} else if (to.equalsIgnoreCase("Radian")||to.equalsIgnoreCase("Радиан")) {
			unit_two = radian;

		} else if (to.equalsIgnoreCase("Circle")||to.equalsIgnoreCase("Окружность")) {
			unit_two = circle;

		} else if (to.equalsIgnoreCase("Grad")||to.equalsIgnoreCase("Град")) {
			unit_two = grad;

		} else if (to.equalsIgnoreCase("Sextant")||to.equalsIgnoreCase("Секстант")) {
			unit_two = sextant;


		} else if (to.equalsIgnoreCase("Minute")||to.equalsIgnoreCase("Минута")) {
			unit_two = minute;


		} else if (to.equalsIgnoreCase("Second")||to.equalsIgnoreCase("Секунда")) {
			unit_two = second;


		}

		// ----------
		finalValue = finalValue * (unit_two / unit_one);
	
		// -----------------------
		return String.valueOf(finalValue);
	}


}
