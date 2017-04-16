package infinity.zone.convertors;

public class DataTransferRate {
	

	/**
	 * @param args
	 * @return
	 */
	public String Dtr(String from, String to, Double Value) {

		// --------------------------------------- calc Angles
		Double bit = 1000000000000.00;
		Double _byte = 124999998039.344;
		Double gigabit = 1000.00;
		Double gigabyte = 116.41532;
		Double hourG = 0.00000238609293;
		Double hourM = 0.000000002330169;
		Double kilobit = 1000000000.00;
		Double kilobyte = 122070310.58432;
		Double megabit = 1000000.00;
		Double megabyte = 119209.28768;
		Double minuteG = 0.000143165577;
		Double minuteM = 0.000000139810133;
		Double secondG = 0.00858993473;
		Double secondM = 0.00000838860797;
		Double terabit = 1.00;
		Double terabyte = 0.11368684;

		Double unit_one = 0.0;
		Double unit_two = 0.0;

		Double finalValue = Value;

		// ------------------------------------------------------
		if (from.equalsIgnoreCase("Bit(P/s)")||from.equalsIgnoreCase("Бит в секунду")) {
			unit_one = bit;

		} else if (from.equalsIgnoreCase("Byte(P/S)")||from.equalsIgnoreCase("Байт в секунду")) {
			unit_one = _byte;

		} else if (from.equalsIgnoreCase("Gigabit(P/S)")||from.equalsIgnoreCase("Гигабит в секунду")) {
			unit_one = gigabit;

		} else if (from.equalsIgnoreCase("Gigabyte(P/S)")||from.equalsIgnoreCase("Гигабайт в секунду")) {
			unit_one = gigabyte;

		} else if (from.equalsIgnoreCase("Hour(P/Gigabyte)")||from.equalsIgnoreCase("Час на гигабайт")) {
			unit_one = hourG;


		} else if (from.equalsIgnoreCase("Hour(P/Megabyte)")||from.equalsIgnoreCase("Час на мегабайт")) {
			unit_one = hourM;


		} else if (from.equalsIgnoreCase("Kilobit(P/S)")||from.equalsIgnoreCase("Килобит в секунду")) {
			unit_one = kilobit;


		} else if (from.equalsIgnoreCase("Kilobyte(P/S)")||from.equalsIgnoreCase("Калобайт в секунду")) {
			unit_one = kilobyte;


		} else if (from.equalsIgnoreCase("Megabit(P/S)")||from.equalsIgnoreCase("Мегабит в секунду")) {
			unit_one = megabit;


		} else if (from.equalsIgnoreCase("Megabyte(P/S)")||from.equalsIgnoreCase("Мегабайт в секунду")) {
			
			unit_one = megabyte;

		} else if (from.equalsIgnoreCase("Minute(P/Gigabyte)")||from.equalsIgnoreCase("Минута на гигабайт")) {
			unit_one = minuteG;


		} else if (from.equalsIgnoreCase("Minute(P/Megabyte)")||from.equalsIgnoreCase("Минута на мегабайт")) {
			unit_one = minuteM;


		} else if (from.equalsIgnoreCase("Second(P/Gigabyte)")||from.equalsIgnoreCase("Секунда на гигабайт")) {
			
			unit_one = secondG;

		} else if (from.equalsIgnoreCase("Second(P/Megabyte)")||from.equalsIgnoreCase("Секунда на мегабайт")) {
			unit_one = secondM;


		} else if (from.equalsIgnoreCase("Terabit(P/S)")||from.equalsIgnoreCase("Терабит в секунду")) {
			unit_one = terabit;


		} else if (from.equalsIgnoreCase("Terabyte(P/S)")||from.equalsIgnoreCase("Терабайт в секунду")) {
			
			unit_one = terabyte;

		}

		

		// ------- Convert To
		if (to.equalsIgnoreCase("Bit(P/s)")||to.equalsIgnoreCase("Бит в секунду")) {
			unit_two = bit;

		} else if (to.equalsIgnoreCase("Byte(P/S)")||to.equalsIgnoreCase("Байт в секунду")) {
			unit_two = _byte;

		} else if (to.equalsIgnoreCase("Gigabit(P/S)")||to.equalsIgnoreCase("Гигабит в секунду")) {
			unit_two = gigabit;

		} else if (to.equalsIgnoreCase("Gigabyte(P/S)")||to.equalsIgnoreCase("Гигабайт в секунду")) {
			unit_two = gigabyte;

		} else if (to.equalsIgnoreCase("Hour(P/Gigabyte)")||to.equalsIgnoreCase("Час на гигабайт")) {
			unit_two = hourG;


		} else if (to.equalsIgnoreCase("Hour(P/Megabyte)")||to.equalsIgnoreCase("Час на мегабайт")) {
			unit_two = hourM;


		} else if (to.equalsIgnoreCase("Kilobit(P/S)")||to.equalsIgnoreCase("Килобит в секунду")) {
			unit_two = kilobit;


		} else if (to.equalsIgnoreCase("Kilobyte(P/S)")||to.equalsIgnoreCase("Калобайт в секунду")) {
			unit_two = kilobyte;


		} else if (to.equalsIgnoreCase("Megabit(P/S)")||to.equalsIgnoreCase("Мегабит в секунду")) {
			unit_two = megabit;


		} else if (to.equalsIgnoreCase("Megabyte(P/S)")||to.equalsIgnoreCase("Мегабайт в секунду")) {
			
			unit_two = megabyte;

		} else if (to.equalsIgnoreCase("Minute(P/Gigabyte)")||to.equalsIgnoreCase("Минута на гигабайт")) {
			unit_two = minuteG;


		} else if (to.equalsIgnoreCase("Minute(P/Megabyte)")||to.equalsIgnoreCase("Минута на мегабайт")) {
			unit_two = minuteM;


		} else if (to.equalsIgnoreCase("Second(P/Gigabyte)")||to.equalsIgnoreCase("Секунда на гигабайт")) {
			
			unit_two = secondG;

		} else if (to.equalsIgnoreCase("Second(P/Megabyte)")||to.equalsIgnoreCase("Секунда на мегабайт")) {
			unit_two = secondM;


		} else if (to.equalsIgnoreCase("Terabit(P/S)")||to.equalsIgnoreCase("Терабит в секунду")) {
			unit_two = terabit;


		} else if (to.equalsIgnoreCase("Terabyte(P/S)")||to.equalsIgnoreCase("Терабайт в секунду")) {
			
			unit_two = terabyte;

		}

		// ----------
		finalValue = finalValue * (unit_two / unit_one);
		// -----------------------
		return String.valueOf(finalValue);
	}
}
