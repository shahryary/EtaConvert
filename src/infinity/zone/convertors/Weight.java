package infinity.zone.convertors;

public class Weight {

	/**
	 * @param args
	 * @return
	 */
	public String Weight(String from, String to, Double Value) {

		// --------------------------------------- calc Angles
		Double kilotonne = 0.000001;
		Double tonne = 0.001;
		Double kilonewtonOnEarth = 0.00980665205;
		Double centner = 0.01;
		Double kilogram = 1.000;
		Double newtonOnEarth = 9.806652;
		Double carat = 5000.00;
		Double gram = 1000.00;
		Double centigram = 100000.00;
		Double milligram = 1000000.00;
		Double microgram = 1000000000.00;
		Double atomicmassunit = 6.02E+26;
		Double longtonUK = 0.00098420653;
		Double shorttonUS = 0.0011023113;
		Double longhundredweightUK = 0.019684131;
		Double shorthundredweightUS = 0.022046226;
		Double stone = 0.15747304;
		Double pound = 2.2046226;
		Double ounce = 35.273962;
		Double dram = 564.38339;
		Double grain = 15432.358;

		Double unit_one = 0.0;
		Double unit_two = 0.0;

		Double finalValue = Value;

		// ------------------------------------------------------
		if (from.equalsIgnoreCase("Atomic mass unit")||from.equalsIgnoreCase("Единица атомной массы")) {
			unit_one = atomicmassunit;

		} else if (from.equalsIgnoreCase("Carat")||from.equalsIgnoreCase("Карат")) {
			unit_one = carat;

		} else if (from.equalsIgnoreCase("Centigram")||from.equalsIgnoreCase("Центиграмм")) {
			unit_one = centigram;

		} else if (from.equalsIgnoreCase("Centner")||from.equalsIgnoreCase("Центнер")) {
			unit_one = centner;

		} else if (from.equalsIgnoreCase("Dram")||from.equalsIgnoreCase("Драхма")) {
			unit_one = dram;

		} else if (from.equalsIgnoreCase("Grain")||from.equalsIgnoreCase("Гран")) {
			unit_one = grain;

		} else if (from.equalsIgnoreCase("Gram")||from.equalsIgnoreCase("Грамм")) {
			unit_one = gram;

		} else if (from.equalsIgnoreCase("Kilogram")||from.equalsIgnoreCase("Килограмм")) {
			unit_one = kilogram;

		} else if (from.equalsIgnoreCase("Kilonewton (on Earth surface)")||from.equalsIgnoreCase("Килоньютон (на поверхности земли)")) {
			unit_one = kilonewtonOnEarth;

		} else if (from.equalsIgnoreCase("Kilotonne")||from.equalsIgnoreCase("Килотонна")) {

			unit_one = kilotonne;

		} else if (from.equalsIgnoreCase("Long hundredweight (UK)")||from.equalsIgnoreCase("Длинный центнер (брит)")) {
			unit_one = longhundredweightUK;

		} else if (from.equalsIgnoreCase("Long ton (UK)")||from.equalsIgnoreCase("Длинная тонна (брит)")) {
			unit_one = longtonUK;

		} else if (from.equalsIgnoreCase("Microgram")||from.equalsIgnoreCase("Микрограмм")) {

			unit_one = microgram;

		} else if (from.equalsIgnoreCase("Milligram")||from.equalsIgnoreCase("Миллиграмм")) {
			unit_one = milligram;

		} else if (from.equalsIgnoreCase("Newton (on Earth surface)")||from.equalsIgnoreCase("Ньютон (на поверхности земли)")) {
			unit_one = newtonOnEarth;

		} else if (from.equalsIgnoreCase("Ounce")||from.equalsIgnoreCase("Унция")) {

			unit_one = ounce;

		} else if (from.equalsIgnoreCase("Pound")||from.equalsIgnoreCase("Фунт")) {

			unit_one = pound;
		} else if (from.equalsIgnoreCase("Short hundredweight (US)")||from.equalsIgnoreCase("Короткий центнер (США)")) {

			unit_one = shorthundredweightUS;

		} else if (from.equalsIgnoreCase("Short ton (US)")||from.equalsIgnoreCase("Короткая тонна (США)")) {

			unit_one = shorttonUS;

		} else if (from.equalsIgnoreCase("Stone")||from.equalsIgnoreCase("Стоун")) {

			unit_one = stone;

		} else if (from.equalsIgnoreCase("Tonne")||from.equalsIgnoreCase("Тонна")) {

			unit_one = tonne;

		}

		// ------- Convert To
		if (to.equalsIgnoreCase("Atomic mass unit")||to.equalsIgnoreCase("Единица атомной массы")) {
			unit_two = atomicmassunit;

		} else if (to.equalsIgnoreCase("Carat")||to.equalsIgnoreCase("Карат")) {
			unit_two = carat;

		} else if (to.equalsIgnoreCase("Centigram")||to.equalsIgnoreCase("Центиграмм")) {
			unit_two = centigram;

		} else if (to.equalsIgnoreCase("Centner")||to.equalsIgnoreCase("Центнер")) {
			unit_two = centner;

		} else if (to.equalsIgnoreCase("Dram")||to.equalsIgnoreCase("Драхма")) {
			unit_two = dram;

		} else if (to.equalsIgnoreCase("Grain")||to.equalsIgnoreCase("Гран")) {
			unit_two = grain;

		} else if (to.equalsIgnoreCase("Gram")||to.equalsIgnoreCase("Грамм")) {
			unit_two = gram;

		} else if (to.equalsIgnoreCase("Kilogram")||to.equalsIgnoreCase("Килограмм")) {
			unit_two = kilogram;

		} else if (to.equalsIgnoreCase("Kilonewton (on Earth surface)")||to.equalsIgnoreCase("Килоньютон (на поверхности земли)")) {
			unit_two = kilonewtonOnEarth;

		} else if (to.equalsIgnoreCase("Kilotonne")||to.equalsIgnoreCase("Килотонна")) {

			unit_two = kilotonne;

		} else if (to.equalsIgnoreCase("Long hundredweight (UK)")||to.equalsIgnoreCase("Длинный центнер (брит)")) {
			unit_two = longhundredweightUK;

		} else if (to.equalsIgnoreCase("Long ton (UK)")||to.equalsIgnoreCase("Длинная тонна (брит)")) {
			unit_two = longtonUK;

		} else if (to.equalsIgnoreCase("Microgram")||to.equalsIgnoreCase("Микрограмм")) {

			unit_two = microgram;

		} else if (to.equalsIgnoreCase("Milligram")||to.equalsIgnoreCase("Миллиграмм")) {
			unit_two = milligram;

		} else if (to.equalsIgnoreCase("Newton (on Earth surface)")||to.equalsIgnoreCase("Ньютон (на поверхности земли)")) {
			unit_two = newtonOnEarth;

		} else if (to.equalsIgnoreCase("Ounce")||to.equalsIgnoreCase("Унция")) {

			unit_two = ounce;

		} else if (to.equalsIgnoreCase("Pound")||to.equalsIgnoreCase("Фунт")) {

			unit_two = pound;
		} else if (to.equalsIgnoreCase("Short hundredweight (US)")||to.equalsIgnoreCase("Короткий центнер (США)")) {

			unit_two = shorthundredweightUS;

		} else if (to.equalsIgnoreCase("Short ton (US)")||to.equalsIgnoreCase("Короткая тонна (США)")) {

			unit_two = shorttonUS;

		} else if (to.equalsIgnoreCase("Stone")||to.equalsIgnoreCase("Стоун")) {

			unit_two = stone;

		} else if (to.equalsIgnoreCase("Tonne")||to.equalsIgnoreCase("Тонна")) {

			unit_two = tonne;

		}

		// ----------
		finalValue = finalValue * (unit_two / unit_one);
		// -----------------------
		return String.valueOf(finalValue);
	}
}
