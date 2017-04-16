package infinity.zone.convertors;

public class Volume {


	/**
	 * @param args
	 * @return
	 */
	public String Volume(String from, String to, Double Value) {

		// --------------------------------------- calc Angles
		Double cubickilometer = 0.000000001;
		Double cubicmeter = 1.00;
		Double cubicdecimeter = 1000.00;
		Double cubiccentimeter = 1000000.00;
		Double cubicmillimeter = 1000000000.00;
		Double hectoliter = 10.00;
		Double decaliter = 100.00;
		Double liter = 1000.00;
		Double deciliter = 10000.00;
		Double centiliter = 100000.00;
		Double milliliter = 1000000.00;
		Double microliter = 1000000000.00;
		Double acrefoot = 0.00081071319;
		Double barrel = 6.2898108;
		Double gallon = 264.17205;
		Double quart = 1056.6882;
		Double pint = 2113.3764;
		Double gill = 8453.5057;
		Double fluidounce = 33814.023;
		Double fluiddram = 270512.18;
		Double minim = 16230731.00;
		Double cup = 4166.6667;
		Double tablespoon = 66666.667;
		Double teaspoon = 200000.00;
		Double cubicyard = 1.3079506;
		Double cubicfoot = 35.314667;
		Double cubicinch = 61023.744;
		
		Double unit_one = 0.0;
		Double unit_two = 0.0;

		Double finalValue = Value;
		// ------------------------------------------------------
		// ------------------------------------------------------

		if (from.equalsIgnoreCase("AcreFoot")||from.equalsIgnoreCase("Акр-фут")) {
			unit_one =acrefoot ;

		}	if (from.equalsIgnoreCase("Barrel")||from.equalsIgnoreCase("Баррель")) {
			unit_one = barrel;

		}	if (from.equalsIgnoreCase("Centiliter")||from.equalsIgnoreCase("Сантилитр")) {
			unit_one =centiliter ;

		}	if (from.equalsIgnoreCase("CubicCentimeter")||from.equalsIgnoreCase("Кубический сантиметр")) {
			unit_one =cubiccentimeter ;

		}	if (from.equalsIgnoreCase("CubicDecimeter")||from.equalsIgnoreCase("Кубический дециметр")) {
			unit_one =cubicdecimeter ;

		}	if (from.equalsIgnoreCase("CubicFoot")||from.equalsIgnoreCase("Кубический фут")) {
			unit_one = cubicfoot;

		}	if (from.equalsIgnoreCase("CubicInch")||from.equalsIgnoreCase("Кубический дюйм")) {
			unit_one = cubicinch;

		}	if (from.equalsIgnoreCase("CubicKilometer")||from.equalsIgnoreCase("Кубический километр")) {
			unit_one =cubickilometer ;

		}	if (from.equalsIgnoreCase("CubicMeter")||from.equalsIgnoreCase("Кубический метр")) {
			unit_one =cubicmeter ;

		}	if (from.equalsIgnoreCase("CubicMillimeter")||from.equalsIgnoreCase("Кубический миллиметр")) {
			unit_one =cubicmillimeter ;

		}	if (from.equalsIgnoreCase("CubicYard")||from.equalsIgnoreCase("Кубический ярд")) {
			unit_one = cubicyard;

		}	if (from.equalsIgnoreCase("Cup")||from.equalsIgnoreCase("Стакан")) {
			unit_one =cup ;

		}	if (from.equalsIgnoreCase("Decaliter")||from.equalsIgnoreCase("Декалитр")) {
			unit_one =decaliter ;

		}	if (from.equalsIgnoreCase("Deciliter")||from.equalsIgnoreCase("Децилитр")) {
			unit_one = deciliter;

		}	if (from.equalsIgnoreCase("FluidDram")||from.equalsIgnoreCase("Жидкая драхма")) {
			unit_one = fluiddram;

		}	if (from.equalsIgnoreCase("FluidOunce")||from.equalsIgnoreCase("Жидкая унция")) {
			unit_one =fluidounce ;

		}	if (from.equalsIgnoreCase("Gallon")||from.equalsIgnoreCase("Галлон")) {
			unit_one =gallon ;

		}	if (from.equalsIgnoreCase("Gill")||from.equalsIgnoreCase("Гилл")) {
			unit_one = gill;

		}	if (from.equalsIgnoreCase("Hectoliter")||from.equalsIgnoreCase("Гектолитр")) {
			unit_one = hectoliter;

		}	if (from.equalsIgnoreCase("Liter")||from.equalsIgnoreCase("Литр")) {
			unit_one = liter;

		}	if (from.equalsIgnoreCase("Microliter")||from.equalsIgnoreCase("Микролитр")) {
			unit_one =microliter ;

		}	if (from.equalsIgnoreCase("Milliliter")||from.equalsIgnoreCase("Миллилитр")) {
			unit_one =milliliter ;

		}	if (from.equalsIgnoreCase("Minim")||from.equalsIgnoreCase("Миним")) {
			unit_one =minim ;

		}	if (from.equalsIgnoreCase("Pint")||from.equalsIgnoreCase("Пинта")) {
			unit_one = pint;

		}	if (from.equalsIgnoreCase("Quart")||from.equalsIgnoreCase("Кварта")) {
			unit_one = quart;

		}	if (from.equalsIgnoreCase("Tablespoon")||from.equalsIgnoreCase("Столовая ложка")) {
			unit_one =tablespoon ;

		}	if (from.equalsIgnoreCase("Teaspoon")||from.equalsIgnoreCase("Чайная ложка")) {
			unit_one = teaspoon;

		}
		
		//---------------------------------------------------------
		if (to.equalsIgnoreCase("AcreFoot")||to.equalsIgnoreCase("Акр-фут")) {
			unit_two =acrefoot ;

		}	if (to.equalsIgnoreCase("Barrel")||to.equalsIgnoreCase("Баррель")) {
			unit_two = barrel;

		}	if (to.equalsIgnoreCase("Centiliter")||to.equalsIgnoreCase("Сантилитр")) {
			unit_two =centiliter ;

		}	if (to.equalsIgnoreCase("CubicCentimeter")||to.equalsIgnoreCase("Кубический сантиметр")) {
			unit_two =cubiccentimeter ;

		}	if (to.equalsIgnoreCase("CubicDecimeter")||to.equalsIgnoreCase("Кубический дециметр")) {
			unit_two =cubicdecimeter ;

		}	if (to.equalsIgnoreCase("CubicFoot")||to.equalsIgnoreCase("Кубический фут")) {
			unit_two = cubicfoot;

		}	if (to.equalsIgnoreCase("CubicInch")||to.equalsIgnoreCase("Кубический дюйм")) {
			unit_two = cubicinch;

		}	if (to.equalsIgnoreCase("CubicKilometer")||to.equalsIgnoreCase("Кубический километр")) {
			unit_two =cubickilometer ;

		}	if (to.equalsIgnoreCase("CubicMeter")||to.equalsIgnoreCase("Кубический метр")) {
			unit_two =cubicmeter ;

		}	if (to.equalsIgnoreCase("CubicMillimeter")||to.equalsIgnoreCase("Кубический миллиметр")) {
			unit_two =cubicmillimeter ;

		}	if (to.equalsIgnoreCase("CubicYard")||to.equalsIgnoreCase("Кубический ярд")) {
			unit_two = cubicyard;

		}	if (to.equalsIgnoreCase("Cup")||to.equalsIgnoreCase("Стакан")) {
			unit_two =cup ;

		}	if (to.equalsIgnoreCase("Decaliter")||to.equalsIgnoreCase("Декалитр")) {
			unit_two =decaliter ;

		}	if (to.equalsIgnoreCase("Deciliter")||to.equalsIgnoreCase("Децилитр")) {
			unit_two = deciliter;

		}	if (to.equalsIgnoreCase("FluidDram")||to.equalsIgnoreCase("Жидкая драхма")) {
			unit_two = fluiddram;

		}	if (to.equalsIgnoreCase("FluidOunce")||to.equalsIgnoreCase("Жидкая унция")) {
			unit_two =fluidounce ;

		}	if (to.equalsIgnoreCase("Gallon")||to.equalsIgnoreCase("Галлон")) {
			unit_two =gallon ;

		}	if (to.equalsIgnoreCase("Gill")||to.equalsIgnoreCase("Гилл")) {
			unit_two = gill;

		}	if (to.equalsIgnoreCase("Hectoliter")||to.equalsIgnoreCase("Гектолитр")) {
			unit_two = hectoliter;

		}	if (to.equalsIgnoreCase("Liter")||to.equalsIgnoreCase("Литр")) {
			unit_two = liter;

		}	if (to.equalsIgnoreCase("Microliter")||to.equalsIgnoreCase("Микролитр")) {
			unit_two =microliter ;

		}	if (to.equalsIgnoreCase("Milliliter")||to.equalsIgnoreCase("Миллилитр")) {
			unit_two =milliliter ;

		}	if (to.equalsIgnoreCase("Minim")||to.equalsIgnoreCase("Миним")) {
			unit_two =minim ;

		}	if (to.equalsIgnoreCase("Pint")||to.equalsIgnoreCase("Пинта")) {
			unit_two = pint;

		}	if (to.equalsIgnoreCase("Quart")||to.equalsIgnoreCase("Кварта")) {
			unit_two = quart;

		}	if (to.equalsIgnoreCase("Tablespoon")||to.equalsIgnoreCase("Столовая ложка")) {
			unit_two =tablespoon ;

		}	if (to.equalsIgnoreCase("Teaspoon")||to.equalsIgnoreCase("Чайная ложка")) {
			unit_two = teaspoon;

		}
		
	

		// ----------
		finalValue = finalValue * (unit_two / unit_one);
		// -----------------------
		return String.valueOf(finalValue);
	}
}
