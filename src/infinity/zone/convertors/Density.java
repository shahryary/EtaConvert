package infinity.zone.convertors;

public class Density {

	/**
	 * @param args
	 * @return
	 */
	public String Density(String from, String to, Double Value) {

		// --------------------------------------- calc Angles
		Double britishPounds = 10.022433;
		Double gramspercubicmeter = 1000000.00;
		Double gramsperliter = 1000.00;
		Double gramspermilliliter = 1.00;
		Double kilogramperliter = 1.00;
		Double kilogramspercubicmeter = 1000.00;
		Double milligramspercubicmeter = 1000000000.00;
		Double ounceperBritishgallon = 160.35893;
		Double ouncepercubicfoot = 998.84737;
		Double ouncepercubicinch = 0.57803667;
		Double ouncepercubicyard = 26968.879;
		Double ounceperUSbushel = 1243.0216;
		Double ounceperUSgallon = 133.52647;
		Double poundperUSbushel = 77.688851;
		Double poundspercubicfoot =62.427961;
		Double poundspercubicinch = 0.036127292;
		Double poundspercubicyard = 1685.5549;
		Double poundsperUSgallon = 8.3454045;
		Double tonpercubicmeter = 1.00;

		Double unit_one = 0.0;
		Double unit_two = 0.0;

		Double finalValue = Value;
		
		// ------------------------------------------------------
		if (from.equalsIgnoreCase("British Pounds(per gallon)")||from.equalsIgnoreCase("Фунты на британский галлон"))  {
			unit_one = britishPounds;

		} else if (from.equalsIgnoreCase("Grams per cubic meter")||from.equalsIgnoreCase("Грамм на кубометр"))  {
			unit_one = gramspercubicmeter;

		} else if (from.equalsIgnoreCase("Grams per liter")||from.equalsIgnoreCase("Грамм на литр"))  {
			unit_one = gramsperliter;

		} else if (from.equalsIgnoreCase("Grams per milliliter")||from.equalsIgnoreCase("Грамм на миллилитр"))  {
			unit_one = gramspermilliliter;

		} else if (from.equalsIgnoreCase("Kilogram per liter")||from.equalsIgnoreCase("Килограмм на литр"))  {
			unit_one = kilogramperliter;

		} else if (from.equalsIgnoreCase("Kilograms per cubic meter")||from.equalsIgnoreCase("Килограмм на кубометр"))  {
			unit_one = kilogramspercubicmeter;

		} else if (from.equalsIgnoreCase("Milligrams per cubic meter")||from.equalsIgnoreCase("Миллиграм на кубометр"))  {
			unit_one = milligramspercubicmeter;

		} else if (from.equalsIgnoreCase("Ounce per British gallon")||from.equalsIgnoreCase("Унции на британский галлон"))  {
			unit_one = ounceperBritishgallon;

		} else if (from.equalsIgnoreCase("Ounce per cubic foot (oz/ft3)")||from.equalsIgnoreCase("Унции на кубический фунт"))  {
			unit_one = ouncepercubicfoot;

		} else if (from.equalsIgnoreCase("Ounce per cubic inch (oz/in3)")||from.equalsIgnoreCase("Унции на кубический дюйм"))  {

			unit_one = ouncepercubicinch;

		} else if (from.equalsIgnoreCase("Ounce per cubic yard (oz/yd3)")||from.equalsIgnoreCase("Унции на кубический ярд"))  {
			unit_one = ouncepercubicyard;

		} else if (from.equalsIgnoreCase("Ounce per U.S. bushel")||from.equalsIgnoreCase("Унции на бушель США"))  {
			unit_one = ounceperUSbushel;

		} else if (from.equalsIgnoreCase("Ounce per U.S. gallon (oz/gal)")||from.equalsIgnoreCase("Унции на галлон США"))  {

			unit_one = ounceperUSgallon;

		} else if (from.equalsIgnoreCase("Pound per U.S. bushel")||from.equalsIgnoreCase("Фунты на бушель США"))  {
			unit_one = poundperUSbushel;

		} else if (from.equalsIgnoreCase("Pounds per cubic foot")||from.equalsIgnoreCase("Фунты на кубический фут"))  {
			unit_one = poundspercubicfoot;

		} else if (from.equalsIgnoreCase("Pounds per cubic inch")||from.equalsIgnoreCase("Фунты на кубический дюйм"))  {

			unit_one = poundspercubicinch;

		} else if (from.equalsIgnoreCase("Pounds per cubic yard")||from.equalsIgnoreCase("Фунты на кубический ярд"))  {

			unit_one = poundspercubicyard;

		} else if (from.equalsIgnoreCase("Pounds per U.S. gallon")||from.equalsIgnoreCase("Фунты на галлон США"))  {

			unit_one = poundsperUSgallon;

		} else if (from.equalsIgnoreCase("Ton per cubic meter")||from.equalsIgnoreCase("Тонна на кубометр"))  {

			unit_one = tonpercubicmeter;

		}

		// ------- Convert To
		if (to.equalsIgnoreCase("British Pounds(per gallon)")||to.equalsIgnoreCase("Фунты на британский галлон"))  {
			unit_two = britishPounds;

		} else if (to.equalsIgnoreCase("Grams per cubic meter")||to.equalsIgnoreCase("Грамм на кубометр"))  {
			unit_two = gramspercubicmeter;

		} else if (to.equalsIgnoreCase("Grams per liter")||to.equalsIgnoreCase("Грамм на литр"))  {
			unit_two = gramsperliter;

		} else if (to.equalsIgnoreCase("Grams per milliliter")||to.equalsIgnoreCase("Грамм на миллилитр"))  {
			unit_two = gramspermilliliter;

		} else if (to.equalsIgnoreCase("Kilogram per liter")||to.equalsIgnoreCase("Килограмм на литр"))  {
			unit_two = kilogramperliter;

		} else if (to.equalsIgnoreCase("Kilograms per cubic meter")||to.equalsIgnoreCase("Килограмм на кубометр"))  {
			unit_two = kilogramspercubicmeter;

		} else if (to.equalsIgnoreCase("Milligrams per cubic meter")||to.equalsIgnoreCase("Миллиграм на кубометр"))  {
			unit_two = milligramspercubicmeter;

		} else if (to.equalsIgnoreCase("Ounce per British gallon")||to.equalsIgnoreCase("Унции на британский галлон"))  {
			unit_two = ounceperBritishgallon;

		} else if (to.equalsIgnoreCase("Ounce per cubic foot (oz/ft3)")||to.equalsIgnoreCase("Унции на кубический фунт"))  {
			unit_two = ouncepercubicfoot;

		} else if (to.equalsIgnoreCase("Ounce per cubic inch (oz/in3)")||to.equalsIgnoreCase("Унции на кубический дюйм"))  {

			unit_two = ouncepercubicinch;

		} else if (to.equalsIgnoreCase("Ounce per cubic yard (oz/yd3)")||to.equalsIgnoreCase("Унции на кубический ярд"))  {
			unit_two = ouncepercubicyard;

		} else if (to.equalsIgnoreCase("Ounce per U.S. bushel")||to.equalsIgnoreCase("Унции на бушель США"))  {
			unit_two = ounceperUSbushel;

		} else if (to.equalsIgnoreCase("Ounce per U.S. gallon (oz/gal)")||to.equalsIgnoreCase("Унции на галлон США"))  {

			unit_two = ounceperUSgallon;

		} else if (to.equalsIgnoreCase("Pound per U.S. bushel")||to.equalsIgnoreCase("Фунты на бушель США"))  {
			unit_two = poundperUSbushel;

		} else if (to.equalsIgnoreCase("Pounds per cubic foot")||to.equalsIgnoreCase("Фунты на кубический фут"))  {
			unit_two = poundspercubicfoot;

		} else if (to.equalsIgnoreCase("Pounds per cubic inch")||to.equalsIgnoreCase("Фунты на кубический дюйм"))  {

			unit_two = poundspercubicinch;

		} else if (to.equalsIgnoreCase("Pounds per cubic yard")||to.equalsIgnoreCase("Фунты на кубический ярд"))  {

			unit_two = poundspercubicyard;

		} else if (to.equalsIgnoreCase("Pounds per U.S. gallon")||to.equalsIgnoreCase("Фунты на галлон США"))  {

			unit_two = poundsperUSgallon;

		} else if (to.equalsIgnoreCase("Ton per cubic meter")||to.equalsIgnoreCase("Тонна на кубометр"))  {

			unit_two = tonpercubicmeter;

		}

		// ----------
		finalValue = finalValue * (unit_two / unit_one);
		// -----------------------
		return String.valueOf(finalValue);
	}
}
