package infinity.zone.convertors;

public class Datasize {
	

	/**
	 * @param args
	 * @return
	 */
	public String Datasize(String from, String to, Double Value) {

		// --------------------------------------- calc Datasize
		Double _byte = 144115188075955872.00;
		Double kilobyte = 140737488355328.00;
		Double megabyte = 137438953672.00;
		Double gigabyte = 134217728.00;
		Double traByte = 131072.00;
		Double petabyte = 128.00;
		Double exabyte = 0.125;
		Double bit = 1152921504606846976.00;
		Double kilobit = 1125899906842624.00;
		Double megabit = 1099511627776.00;
		Double gigabit = 1073741824.00;
		Double trabit = 1048576.00;
		Double petabit = 1024.00;
		Double exabit = 1.00;

		Double unit_one = 0.0;
		Double unit_two = 0.0;

		Double finalValue = Value;
		// ------------------------------------------------------
		// ------------------------------------------------------
		if (from.equalsIgnoreCase("Bit")||from.equalsIgnoreCase("Бит")) {
			unit_one = bit;

		} else if (from.equalsIgnoreCase("Byte")||from.equalsIgnoreCase("Байт")) {
			unit_one = _byte;

		} else if (from.equalsIgnoreCase("Exabit")||from.equalsIgnoreCase("Эксабит")) {
			unit_one = exabit;

		} else if (from.equalsIgnoreCase("Exabyte")||from.equalsIgnoreCase("Эксабайт")) {
			unit_one = exabyte;

		} else if (from.equalsIgnoreCase("Gigabit")||from.equalsIgnoreCase("Гигабит")) {
			unit_one = gigabit;


		} else if (from.equalsIgnoreCase("Gigabyte")||from.equalsIgnoreCase("Гигабайт")) {
			unit_one = gigabyte;


		} else if (from.equalsIgnoreCase("Kilobit")||from.equalsIgnoreCase("Килобит")) {
			unit_one = kilobit;


		} else if (from.equalsIgnoreCase("Kilobyte")||from.equalsIgnoreCase("Килобайт")) {
			unit_one = kilobyte;


		} else if (from.equalsIgnoreCase("Megabit")||from.equalsIgnoreCase("Мегабит")) {
			unit_one = megabit;


		} else if (from.equalsIgnoreCase("Megabyte")||from.equalsIgnoreCase("Мегабайт")) {
			unit_one = megabyte;


		} else if (from.equalsIgnoreCase("Petabit")||from.equalsIgnoreCase("Петабит")) {
			unit_one = petabit;


		} else if (from.equalsIgnoreCase("Petabyte")||from.equalsIgnoreCase("Петабайт")) {
			unit_one = petabyte;


		} else if (from.equalsIgnoreCase("Trabit")||from.equalsIgnoreCase("Терабит")) {
			unit_one = trabit;


		} else if (from.equalsIgnoreCase("TraByte")||from.equalsIgnoreCase("Терабайт")) {
			unit_one = traByte;


		} 
		
		
		
		
		if (to.equalsIgnoreCase("Bit")||to.equalsIgnoreCase("Бит")) {
			unit_two = bit;

		} else if (to.equalsIgnoreCase("Byte")||to.equalsIgnoreCase("Байт")) {
			unit_two = _byte;

		} else if (to.equalsIgnoreCase("Exabit")||to.equalsIgnoreCase("Эксабит")) {
			unit_two = exabit;

		} else if (to.equalsIgnoreCase("Exabyte")||to.equalsIgnoreCase("Эксабайт")) {
			unit_two = exabyte;

		} else if (to.equalsIgnoreCase("Gigabit")||to.equalsIgnoreCase("Гигабит")) {
			unit_two = gigabit;


		} else if (to.equalsIgnoreCase("Gigabyte")||to.equalsIgnoreCase("Гигабайт")) {
			unit_two = gigabyte;


		} else if (to.equalsIgnoreCase("Kilobit")||to.equalsIgnoreCase("Килобит")) {
			unit_two = kilobit;


		} else if (to.equalsIgnoreCase("Kilobyte")||to.equalsIgnoreCase("Килобайт")) {
			unit_two = kilobyte;


		} else if (to.equalsIgnoreCase("Megabit")||to.equalsIgnoreCase("Мегабит")) {
			unit_two = megabit;


		} else if (to.equalsIgnoreCase("Megabyte")||to.equalsIgnoreCase("Мегабайт")) {
			unit_two = megabyte;


		} else if (to.equalsIgnoreCase("Petabit")||to.equalsIgnoreCase("Петабит")) {
			unit_two = petabit;


		} else if (to.equalsIgnoreCase("Petabyte")||to.equalsIgnoreCase("Петабайт")) {
			unit_two = petabyte;


		} else if (to.equalsIgnoreCase("Trabit")||to.equalsIgnoreCase("Терабит")) {
			unit_two = trabit;


		} else if (to.equalsIgnoreCase("TraByte")||to.equalsIgnoreCase("Терабайт")) {
			unit_two = traByte;


		} 

		// ----------
		finalValue = finalValue * (unit_two / unit_one);
		// -----------------------
		return String.valueOf(finalValue);
	}
}
