package infinity.zone.convertors;

public class Temperature {

	/**
	 * @param args
	 * @return
	 */
	public String Temp(String from, String to, Double Value) {

		// --------------------------------------- calc Angles
	
		Double KELVIN = 0.0;

		Double finalValue =0.00;

		// ------------------------------------------------------
		if (from.equalsIgnoreCase("Degrees Celsius")||from.equalsIgnoreCase("Градус Цельсия")) {
			KELVIN = Value + 273.15;

		} else if (from.equalsIgnoreCase("Degrees Delisle")||from.equalsIgnoreCase("Градус Делиля")) {
			KELVIN = ((373.15-Value)*2)/3;

		} else if (from.equalsIgnoreCase("Degrees Fahrenheit")||from.equalsIgnoreCase("Градус Фаренгейта")) {
			KELVIN = ((Value + 459.67) * 5) / 9;

		} else if (from.equalsIgnoreCase("Degrees Newton")||from.equalsIgnoreCase("Градус Ньютона")) {
			KELVIN = ((Value*100)/3)+273.15;

		} else if (from.equalsIgnoreCase("Degrees Rankine)")||from.equalsIgnoreCase("Градус Ранкина")) {
			KELVIN = (Value*5)/9;

		} else if (from.equalsIgnoreCase("Degrees Reaumur")||from.equalsIgnoreCase("Градус Реомюра")) {
			KELVIN = ((Value*5)/4)+273.15;

		} else if (from.equalsIgnoreCase("Degrees Rømer")||from.equalsIgnoreCase("Градус Рёмера")) {
			KELVIN = (((Value-7.5)*40)/21)+273.15;

		} else if (from.equalsIgnoreCase("Kelvin")||from.equalsIgnoreCase("Кельвин")) {
			KELVIN = Value;

		}

		// ------- Convert To
		if (to.equalsIgnoreCase("Degrees Celsius")||to.equalsIgnoreCase("Градус Цельсия")) {
			finalValue = KELVIN - 273.15;

		} else if (to.equalsIgnoreCase("Degrees Delisle")||to.equalsIgnoreCase("Градус Делиля")) {
			finalValue = (373.15-KELVIN)*1.5;

		} else if (to.equalsIgnoreCase("Degrees Fahrenheit")||to.equalsIgnoreCase("Градус Фаренгейта")) {
			finalValue = (KELVIN * 1.8) - 459.67;

		} else if (to.equalsIgnoreCase("Degrees Newton")||to.equalsIgnoreCase("Градус Ньютона")) {
			finalValue = ((KELVIN-273.15)*33)/100;

		} else if (to.equalsIgnoreCase("Degrees Rankine)")||to.equalsIgnoreCase("Градус Ранкина")) {
			finalValue = KELVIN*1.8;

		} else if (to.equalsIgnoreCase("Degrees Reaumur")||to.equalsIgnoreCase("Градус Реомюра")) {
			finalValue = ((KELVIN-273.15)*4)/5;

		} else if (to.equalsIgnoreCase("Degrees Rømer")||to.equalsIgnoreCase("Градус Рёмера")) {
			finalValue = (((KELVIN-273.15)*21)/40)+7.5;

		} else if (to.equalsIgnoreCase("Kelvin")||to.equalsIgnoreCase("Кельвин")) {
			finalValue = KELVIN;

		}

		// ----------
		// -----------------------
		return String.valueOf(finalValue);
	}
}
