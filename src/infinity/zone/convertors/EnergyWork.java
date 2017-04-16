package infinity.zone.convertors;


public class EnergyWork {

	/**
	 * @param args
	 * @return
	 */
	public String EW(String from, String to, Double Value) {
	
		
		// --------------------------------------- calc Angles
		Double megajoule = 1.00;
		Double kilojoule = 1000.00;
		Double joule =1000000.00;
		Double megacalorie = 0.2388459;
		Double kilocalorie =238.8459 ;
		Double metre_kilogram =102608.2 ;
		Double calorie =238845.9 ;
		Double  kilowatt_hour=0.27777778 ;
		Double watt_hour =277.77778 ;
		Double watt_second = 1000000.00;
		Double erg =10000000000000.00;
		Double electronvolt = 6.24E+24;
		Double  quad=0.000000000000948;
		Double therm = 0.0094781339;
		Double  british_Thermal_Unit= 947.81339;
		Double  million_BTU= 0.00094781339;
		Double  Foot_Pound = 737582.52;
		Double  tonne_metric_of_TNT= 0.00021682236;
		Double  ton_of_TNT= 0.00023900574;
		Double  kilogram_of_TNT= 0.21682236;
		

		Double unit_one = 0.0;
		Double unit_two = 0.0;

		Double finalValue = Value;

		// ------------------------------------------------------
		if (from.equalsIgnoreCase("megajoule (MJ)")||from.equalsIgnoreCase("Мегаджоуль (МДж)")) {
			unit_one = megajoule;

		} else if (from.equalsIgnoreCase("kilojoule (kJ)")||from.equalsIgnoreCase("Килоджоуль (кДж)")) {
			unit_one = kilojoule;

		} else if (from.equalsIgnoreCase("joule (J)")||from.equalsIgnoreCase("Джоуль (Дж)")) {
			unit_one = joule;

		} else if (from.equalsIgnoreCase("megacalorie (Mcal)")||from.equalsIgnoreCase("Мегаколория (МКал)")) {
			unit_one = megacalorie;

		} else if (from.equalsIgnoreCase("kilocalorie (kcal)")||from.equalsIgnoreCase("Килокалория (кКал)")) {
			unit_one = kilocalorie;

		} else if (from.equalsIgnoreCase("metre-kilogram (mkg)")||from.equalsIgnoreCase("Метр-килограмм (м*кг)")) {
			unit_one = metre_kilogram;

		} else if (from.equalsIgnoreCase("calorie (cal)")||from.equalsIgnoreCase("Калория (Кал)")) {
			unit_one = calorie;

		} else if (from.equalsIgnoreCase("kilowatt hour (kW*h)")||from.equalsIgnoreCase("Киловатт час (кВт*час)")) {
			unit_one = kilowatt_hour;

		} else if (from.equalsIgnoreCase("watt hour (W*h)")||from.equalsIgnoreCase("Ватт час (Вт*час)")) {
			unit_one = watt_hour;

		} else if (from.equalsIgnoreCase("watt second (W*s)")||from.equalsIgnoreCase("Ватт секунда (Вт*сек)")) {

			unit_one = watt_second;

		} else if (from.equalsIgnoreCase("erg")||from.equalsIgnoreCase("Эрг")) {
			unit_one = erg;

		} else if (from.equalsIgnoreCase("electronvolt (eV)")||from.equalsIgnoreCase("Электронвольт (эВ)")) {
			unit_one = electronvolt;

		} else if (from.equalsIgnoreCase("quad")||from.equalsIgnoreCase("Квад")) {

			unit_one = quad;

		} else if (from.equalsIgnoreCase("therm")||from.equalsIgnoreCase("Терм")) {
			unit_one = therm;

		} else if (from.equalsIgnoreCase("British Thermal Unit (BTU)")||from.equalsIgnoreCase("Британская термальная единица (BTU)")) {
			unit_one = british_Thermal_Unit;

		} else if (from.equalsIgnoreCase("Million BTU")||from.equalsIgnoreCase("Миллион BTU")) {

			unit_one = million_BTU;

		} else if (from.equalsIgnoreCase("Foot-Pound")||from.equalsIgnoreCase("Фут-фунт")) {

			unit_one = Foot_Pound;
		} else if (from.equalsIgnoreCase("tonne (metric) of TNT")||from.equalsIgnoreCase("Тонна тротила (метрич)")) {

			unit_one = tonne_metric_of_TNT;

		} else if (from.equalsIgnoreCase("ton of TNT")||from.equalsIgnoreCase("Тонна тротила (США)")) {

			unit_one = ton_of_TNT;

		} else if (from.equalsIgnoreCase("kilogram of TNT")||from.equalsIgnoreCase("Килограмм тротила")) {

			unit_one = kilogram_of_TNT;

		}

		// ------- Convert To
		// ------------------------------------------------------
		if (to.equalsIgnoreCase("megajoule (MJ)")||to.equalsIgnoreCase("Мегаджоуль (МДж)")) {
			unit_two = megajoule;

		} else if (to.equalsIgnoreCase("kilojoule (kJ)")||to.equalsIgnoreCase("Килоджоуль (кДж)")) {
			unit_two = kilojoule;

		} else if (to.equalsIgnoreCase("joule (J)")||to.equalsIgnoreCase("Джоуль (Дж)")) {
			unit_two = joule;

		} else if (to.equalsIgnoreCase("megacalorie (Mcal)")||to.equalsIgnoreCase("Мегаколория (МКал)")) {
			unit_two = megacalorie;

		} else if (to.equalsIgnoreCase("kilocalorie (kcal)")||to.equalsIgnoreCase("Килокалория (кКал)")) {
			unit_two = kilocalorie;

		} else if (to.equalsIgnoreCase("metre-kilogram (mkg)")||to.equalsIgnoreCase("Метр-килограмм (м*кг)")) {
			unit_two = metre_kilogram;

		} else if (to.equalsIgnoreCase("calorie (cal)")||to.equalsIgnoreCase("Калория (Кал)")) {
			unit_two = calorie;

		} else if (to.equalsIgnoreCase("kilowatt hour (kW*h)")||to.equalsIgnoreCase("Киловатт час (кВт*час)")) {
			unit_two = kilowatt_hour;

		} else if (to.equalsIgnoreCase("watt hour (W*h)")||to.equalsIgnoreCase("Ватт час (Вт*час)")) {
			unit_two = watt_hour;

		} else if (to.equalsIgnoreCase("watt second (W*s)")||to.equalsIgnoreCase("Ватт секунда (Вт*сек)")) {

			unit_two = watt_second;

		} else if (to.equalsIgnoreCase("erg")||to.equalsIgnoreCase("Эрг")) {
			unit_two = erg;

		} else if (to.equalsIgnoreCase("electronvolt (eV)")||to.equalsIgnoreCase("Электронвольт (эВ)")) {
			unit_two = electronvolt;

		} else if (to.equalsIgnoreCase("quad")||to.equalsIgnoreCase("Квад")) {

			unit_two = quad;

		} else if (to.equalsIgnoreCase("therm")||to.equalsIgnoreCase("Терм")) {
			unit_two = therm;

		} else if (to.equalsIgnoreCase("British Thermal Unit (BTU)")||to.equalsIgnoreCase("Британская термальная единица (BTU)")) {
			unit_two = british_Thermal_Unit;

		} else if (to.equalsIgnoreCase("Million BTU")||to.equalsIgnoreCase("Миллион BTU")) {

			unit_two = million_BTU;

		} else if (to.equalsIgnoreCase("Foot-Pound")||to.equalsIgnoreCase("Фут-фунт")) {

			unit_two = Foot_Pound;
		} else if (to.equalsIgnoreCase("tonne (metric) of TNT")||to.equalsIgnoreCase("Тонна тротила (метрич)")) {

			unit_two = tonne_metric_of_TNT;

		} else if (to.equalsIgnoreCase("ton of TNT")||to.equalsIgnoreCase("Тонна тротила (США)")) {

			unit_two = ton_of_TNT;

		} else if (to.equalsIgnoreCase("kilogram of TNT")||to.equalsIgnoreCase("Килограмм тротила")) {

			unit_two = kilogram_of_TNT;

		}

		// ----------
		finalValue = finalValue * (unit_two / unit_one);
		// -----------------------
		return String.valueOf(finalValue);
	}
}
