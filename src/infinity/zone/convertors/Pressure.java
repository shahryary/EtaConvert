package infinity.zone.convertors;

public class Pressure {

	/**
	 * @param args
	 * @return
	 */
	public String Press(String from, String to, Double Value) {

		// --------------------------------------- calc Angles
		Double bar = 1.00;
		Double kilopascal = 100.00;
		Double hectopascal = 1000.00;
		Double megapascal = 0.10;
		Double millibar = 1000.00;
		Double pascal = 100000.00;
		Double kilogram_per_square_centimeter = 1.0197162;
		Double kilogram_per_square_meter = 10197.162;
		Double newton_per_square_meter = 100000.00;
		Double kilonewton_per_square_meter = 100.00;
		Double meganewton_per_square_meter = 0.10;
		Double newton_per_square_centimeter = 10.00;
		Double newton_per_square_millimeter = 0.10;
		Double thousand_pounds_per_square_inch = 0.014503774;
		Double pound_per_square_inch = 14.503774;
		Double pound_per_square_foot = 2088.5434;
		Double ton_per_square_inch = 0.0072518867;
		Double ton_per_square_foot = 1.0442717;
		Double long_ton_per_square_inch = 0.0064748988;
		Double long_ton_per_square_foot = 0.93238543;
		Double physical_atmosphere = 0.98692327;
		Double technical_atmosphere = 1.0197162;
		Double inch_of_mercury = 29.529983;
		Double centimeter_of_mercury = 75.006156;
		Double millimeter_of_mercury = 750.06156;

		Double unit_one = 0.0;
		Double unit_two = 0.0;

		Double finalValue = Value;

		// ------------------------------------------------------
		if (from.equalsIgnoreCase("Bar")||from.equalsIgnoreCase("Бар")) {
			unit_one = bar;

		} else if (from.equalsIgnoreCase("Centimeter of mercury")||from.equalsIgnoreCase("Сантиметр ртутного столба")) {
			unit_one = centimeter_of_mercury;

		} else if (from.equalsIgnoreCase("hectopascal (hPa)")||from.equalsIgnoreCase("Гектопаскаль (гПа)")) {
			unit_one = hectopascal;

		} else if (from.equalsIgnoreCase("Inch of mercury")||from.equalsIgnoreCase("Дюйм ртутного столба")) {
			unit_one = inch_of_mercury;

		} else if (from.equalsIgnoreCase("Kilogram per square centimeter")||from.equalsIgnoreCase("Килограмм силы на квадратный сантиметр")) {
			unit_one = kilogram_per_square_centimeter;

		} else if (from.equalsIgnoreCase("Kilogram per square meter")||from.equalsIgnoreCase("Килограмм силы на квадратный метр")) {
			unit_one = kilogram_per_square_meter;

		} else if (from.equalsIgnoreCase("Kilonewton per square meter")||from.equalsIgnoreCase("Килоньютон на квадратный метр")) {
			unit_one = kilogram_per_square_meter;

		} else if (from.equalsIgnoreCase("Kilopascal (kPa)")||from.equalsIgnoreCase("Килопаскаль (кПа)")) {
			unit_one = kilopascal;

		} else if (from.equalsIgnoreCase("Long ton (U.K.) per square foot")||from.equalsIgnoreCase("Британская тонна силы на квадратный  фут")) {
			unit_one = long_ton_per_square_foot;

		} else if (from.equalsIgnoreCase("Long ton (U.K.) per square inch")||from.equalsIgnoreCase("Британская тонна силы на квадратный дюйм")) {

			unit_one = long_ton_per_square_inch;

		} else if (from.equalsIgnoreCase("meganewton per square meter")||from.equalsIgnoreCase("Меганьютон на квадратный метр")) {
			unit_one = meganewton_per_square_meter;

		} else if (from.equalsIgnoreCase("Megapascal (MPa)")||from.equalsIgnoreCase("Мегапаскаль (МПа)")) {
			unit_one = megapascal;

		} else if (from.equalsIgnoreCase("Millibar")||from.equalsIgnoreCase("Миллибар")) {

			unit_one = millibar;

		} else if (from.equalsIgnoreCase("Millimeter of mercury (torr)")||from.equalsIgnoreCase("Миллиметр ртутного столба (торр)")) {
			unit_one = millimeter_of_mercury;

		} else if (from.equalsIgnoreCase("Newton per square centimeter")||from.equalsIgnoreCase("Ньютон на квадратный сантиметр")) {
			unit_one = newton_per_square_centimeter;

		} else if (from.equalsIgnoreCase("Newton per square meter")||from.equalsIgnoreCase("Ньютон на квадратный метр")) {

			unit_one = newton_per_square_meter;

		} else if (from.equalsIgnoreCase("Newton per square millimeter")||from.equalsIgnoreCase("Ньютон на квадратный миллиметр")) {

			unit_one = newton_per_square_millimeter;
		} else if (from.equalsIgnoreCase("Pascal (Pa)")||from.equalsIgnoreCase("Паскаль (Па)")) {

			unit_one = pascal;

		} else if (from.equalsIgnoreCase("Physical atmosphere (atm)")||from.equalsIgnoreCase("Физическая атмосфера")) {

			unit_one = physical_atmosphere;

		} else if (from.equalsIgnoreCase("Pound per square foot")||from.equalsIgnoreCase("Фунт на квадратный фут")) {

			unit_one = pound_per_square_foot;

		} else if (from.equalsIgnoreCase("Pound per square inch")||from.equalsIgnoreCase("Фунт на квадратный дюйм")) {

			unit_one = pound_per_square_inch;

		} else if (from.equalsIgnoreCase("technical atmosphere")||from.equalsIgnoreCase("Техническая атмосфера")) {

			unit_one = technical_atmosphere;

		} else if (from.equalsIgnoreCase("Thousand pounds per square inch")||from.equalsIgnoreCase("1000 фунтов на квадратный дюйм")) {

			unit_one = thousand_pounds_per_square_inch;

		} else if (from.equalsIgnoreCase("Ton (U.S.) per square foot")||from.equalsIgnoreCase("Тонна силы на квадратный фут (США)")) {

			unit_one = ton_per_square_foot;

		} else if (from.equalsIgnoreCase("Ton (U.S.) per square inch")||from.equalsIgnoreCase("Тонна силы на квадратный дюйм")) {

			unit_one = ton_per_square_inch;

		}

		// ------- Convert To
		if (to.equalsIgnoreCase("Bar")||to.equalsIgnoreCase("Бар")) {
			unit_two = bar;

		} else if (to.equalsIgnoreCase("Centimeter of mercury")||to.equalsIgnoreCase("Сантиметр ртутного столба")) {
			unit_two = centimeter_of_mercury;

		} else if (to.equalsIgnoreCase("hectopascal (hPa)")||to.equalsIgnoreCase("Гектопаскаль (гПа)")) {
			unit_two = hectopascal;

		} else if (to.equalsIgnoreCase("Inch of mercury")||to.equalsIgnoreCase("Дюйм ртутного столба")) {
			unit_two = inch_of_mercury;

		} else if (to.equalsIgnoreCase("Kilogram per square centimeter")||to.equalsIgnoreCase("Килограмм силы на квадратный сантиметр")) {
			unit_two = kilogram_per_square_centimeter;

		} else if (to.equalsIgnoreCase("Kilogram per square meter")||to.equalsIgnoreCase("Килограмм силы на квадратный метр")) {
			unit_two = kilogram_per_square_meter;

		} else if (to.equalsIgnoreCase("Kilonewton per square meter")||to.equalsIgnoreCase("Килоньютон на квадратный метр")) {
			unit_two = kilogram_per_square_meter;

		} else if (to.equalsIgnoreCase("Kilopascal (kPa)")||to.equalsIgnoreCase("Килопаскаль (кПа)")) {
			unit_two = kilopascal;

		} else if (to.equalsIgnoreCase("Long ton (U.K.) per square foot")||to.equalsIgnoreCase("Британская тонна силы на квадратный  фут")) {
			unit_two = long_ton_per_square_foot;

		} else if (to.equalsIgnoreCase("Long ton (U.K.) per square inch")||to.equalsIgnoreCase("Британская тонна силы на квадратный дюйм")) {

			unit_two = long_ton_per_square_inch;

		} else if (to.equalsIgnoreCase("meganewton per square meter")||to.equalsIgnoreCase("Меганьютон на квадратный метр")) {
			unit_two = meganewton_per_square_meter;

		} else if (to.equalsIgnoreCase("Megapascal (MPa)")||to.equalsIgnoreCase("Мегапаскаль (МПа)")) {
			unit_two = megapascal;

		} else if (to.equalsIgnoreCase("Millibar")||to.equalsIgnoreCase("Миллибар")) {

			unit_two = millibar;

		} else if (to.equalsIgnoreCase("Millimeter of mercury (torr)")||to.equalsIgnoreCase("Миллиметр ртутного столба (торр)")) {
			unit_two = millimeter_of_mercury;

		} else if (to.equalsIgnoreCase("Newton per square centimeter")||to.equalsIgnoreCase("Ньютон на квадратный сантиметр")) {
			unit_two = newton_per_square_centimeter;

		} else if (to.equalsIgnoreCase("Newton per square meter")||to.equalsIgnoreCase("Ньютон на квадратный метр")) {

			unit_two = newton_per_square_meter;

		} else if (to.equalsIgnoreCase("Newton per square millimeter")||to.equalsIgnoreCase("Ньютон на квадратный миллиметр")) {

			unit_two = newton_per_square_millimeter;
		} else if (to.equalsIgnoreCase("Pascal (Pa)")||to.equalsIgnoreCase("Паскаль (Па)")) {

			unit_two = pascal;

		} else if (to.equalsIgnoreCase("Physical atmosphere (atm)")||to.equalsIgnoreCase("Физическая атмосфера")) {

			unit_two = physical_atmosphere;

		} else if (to.equalsIgnoreCase("Pound per square foot")||to.equalsIgnoreCase("Фунт на квадратный фут")) {

			unit_two = pound_per_square_foot;

		} else if (to.equalsIgnoreCase("Pound per square inch")||to.equalsIgnoreCase("Фунт на квадратный дюйм")) {

			unit_two = pound_per_square_inch;

		} else if (to.equalsIgnoreCase("technical atmosphere")||to.equalsIgnoreCase("Техническая атмосфера")) {

			unit_two = technical_atmosphere;

		} else if (to.equalsIgnoreCase("Thousand pounds per square inch")||to.equalsIgnoreCase("1000 фунтов на квадратный дюйм")) {

			unit_two = thousand_pounds_per_square_inch;

		} else if (to.equalsIgnoreCase("Ton (U.S.) per square foot")||to.equalsIgnoreCase("Тонна силы на квадратный фут (США)")) {

			unit_two = ton_per_square_foot;

		} else if (to.equalsIgnoreCase("Ton (U.S.) per square inch")||to.equalsIgnoreCase("Тонна силы на квадратный дюйм")) {

			unit_two = ton_per_square_inch;

		}

		// ----------
		finalValue = finalValue * (unit_two / unit_one);
		// -----------------------
		return String.valueOf(finalValue);
	}
}
