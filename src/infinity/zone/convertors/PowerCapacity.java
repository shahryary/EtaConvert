package infinity.zone.convertors;

public class PowerCapacity {

	/**
	 * @param args
	 * @return
	 */
	public String PC(String from, String to, Double Value) {

		// --------------------------------------- calc Angles
		Double megawatt = 1.00;
		Double kilowatt = 1000.00;
		Double watt = 1000000.00;
		Double volt_ampere = 1000000.00;
		Double gigacalories_per_second = 0.0002388459;
		Double kilocalories_per_second = 238.8459;
		Double calories_per_second = 238845.9;
		Double gigacalories_per_hour = 0.85984523;
		Double kilocalories_per_hour = 859845.23;
		Double calories_per_hour = 859845230.00;
		Double horsepower_boiler = 101.95889;
		Double horsepower_electric = 1340.48;
		Double horsepower_hydraulic = 1341.0221;
		Double horsepower_mechanical = 1341.0221;
		Double horsepower_metric = 1359.62;
		Double kilogramm_force_meter_per_second = 101971.62;
		Double joule_per_second = 1000000.00;
		Double joule_per_hour = 3600000000.00;
		Double erg_per_second = 10000000000000.00;
		Double metric_refrigeration_ton = 258.98953;
		Double US_refrigeration_ton = 284.34402;
		Double British_Thermal_Unit_per_second = 947.81339;
		Double British_Thermal_Unit_per_minute = 56868.804;
		Double British_Thermal_Unit_per_hour = 3412128.2;
		Double foot_pound_force_per_second = 737562.15;

		Double unit_one = 0.0;
		Double unit_two = 0.0;

		Double finalValue = Value;

		// ------------------------------------------------------
		if (from.equalsIgnoreCase("megawatt")||from.equalsIgnoreCase("Мегаватт")) {
			unit_one = megawatt;

		} else if (from.equalsIgnoreCase("kilowatt")||from.equalsIgnoreCase("Киловатт")) {
			unit_one = kilowatt;

		} else if (from.equalsIgnoreCase("watt")||from.equalsIgnoreCase("Ватт")) {
			unit_one = watt;

		} else if (from.equalsIgnoreCase("volt-ampere (VA)")||from.equalsIgnoreCase("Вольт-Ампер (ВА)")) {
			unit_one = volt_ampere;

		} else if (from.equalsIgnoreCase("gigacalories per second")||from.equalsIgnoreCase("Гигакалорий в секунду")) {
			unit_one = gigacalories_per_second;

		} else if (from.equalsIgnoreCase("kilocalories per second")||from.equalsIgnoreCase("Килокалорий в секунду")) {
			unit_one = kilocalories_per_second;

		} else if (from.equalsIgnoreCase("calories per second")||from.equalsIgnoreCase("Калорий в секунду")) {
			unit_one = calories_per_second;

		} else if (from.equalsIgnoreCase("gigacalories per hour")||from.equalsIgnoreCase("Гигакалорий в час")) {
			unit_one = gigacalories_per_hour;

		} else if (from.equalsIgnoreCase("kilocalories per hour")||from.equalsIgnoreCase("Килокалорий в час")) {
			unit_one = kilocalories_per_hour;

		} else if (from.equalsIgnoreCase("calories per hour")||from.equalsIgnoreCase("Калорий в час")) {

			unit_one = calories_per_hour;

		} else if (from.equalsIgnoreCase("horsepower,boiler")||from.equalsIgnoreCase("Котловая лошадиная сила")) {
			unit_one = horsepower_boiler;

		} else if (from.equalsIgnoreCase("horsepower,electric")||from.equalsIgnoreCase("Электрическая лошадиная сила")) {
			unit_one = horsepower_electric;

		} else if (from.equalsIgnoreCase("horsepower,hydraulic")||from.equalsIgnoreCase("Гидравлическая лошадиная сила")) {

			unit_one = horsepower_hydraulic;

		} else if (from.equalsIgnoreCase("horsepower,mechanical (imperial)")||from.equalsIgnoreCase("Механическая лошадиная сила")) {
			unit_one = horsepower_mechanical;

		} else if (from.equalsIgnoreCase("horsepower,metric")||from.equalsIgnoreCase("Метрическая лошадиная сила")) {
			unit_one = horsepower_metric;

		} else if (from.equalsIgnoreCase("kilogramm-force meter per second")||from.equalsIgnoreCase("Килограмм-сила метр в секунду")) {

			unit_one = kilogramm_force_meter_per_second;

		} else if (from.equalsIgnoreCase("joule per second")||from.equalsIgnoreCase("Джоуль в секунду")) {

			unit_one = joule_per_second;
		} else if (from.equalsIgnoreCase("joule per hour")||from.equalsIgnoreCase("Джоуль в час")) {

			unit_one = joule_per_hour;

		} else if (from.equalsIgnoreCase("erg per second")||from.equalsIgnoreCase("Эрг в секунду")) {

			unit_one = erg_per_second;

		} else if (from.equalsIgnoreCase("metric refrigeration ton (RT)")||from.equalsIgnoreCase("Метрическая тонна охлаждения")) {

			unit_one = metric_refrigeration_ton;

		} else if (from.equalsIgnoreCase("U.S. refrigeration ton (USRT)")||from.equalsIgnoreCase("Американская тонна охлаждения")) {

			unit_one = US_refrigeration_ton;

		} else if (from.equalsIgnoreCase("British Thermal Unit per second")||from.equalsIgnoreCase("Британская термальная единица в секунду")) {

			unit_one = British_Thermal_Unit_per_second;

		} else if (from.equalsIgnoreCase("British Thermal Unit per minute")||from.equalsIgnoreCase("Британская термальная единица в минуту")) {

			unit_one = British_Thermal_Unit_per_minute;

		} else if (from.equalsIgnoreCase("British Thermal Unit per hour")||from.equalsIgnoreCase("Британская термальная единица в час")) {

			unit_one = British_Thermal_Unit_per_hour;

		} else if (from.equalsIgnoreCase("foot pound-force per second")||from.equalsIgnoreCase("Фут фунт-сила в секунду")) {

			unit_one = foot_pound_force_per_second;

		}

		// ------- Convert To
		// ------------------------------------------------------
		if (to.equalsIgnoreCase("megawatt")||to.equalsIgnoreCase("Мегаватт")) {
			unit_two = megawatt;

		} else if (to.equalsIgnoreCase("kilowatt")||to.equalsIgnoreCase("Киловатт")) {
			unit_two = kilowatt;

		} else if (to.equalsIgnoreCase("watt")||to.equalsIgnoreCase("Ватт")) {
			unit_two = watt;

		} else if (to.equalsIgnoreCase("volt-ampere (VA)")||to.equalsIgnoreCase("Вольт-Ампер (ВА)")) {
			unit_two = volt_ampere;

		} else if (to.equalsIgnoreCase("gigacalories per second")||to.equalsIgnoreCase("Гигакалорий в секунду")) {
			unit_two = gigacalories_per_second;

		} else if (to.equalsIgnoreCase("kilocalories per second")||to.equalsIgnoreCase("Килокалорий в секунду")) {
			unit_two = kilocalories_per_second;

		} else if (to.equalsIgnoreCase("calories per second")||to.equalsIgnoreCase("Калорий в секунду")) {
			unit_two = calories_per_second;

		} else if (to.equalsIgnoreCase("gigacalories per hour")||to.equalsIgnoreCase("Гигакалорий в час")) {
			unit_two = gigacalories_per_hour;

		} else if (to.equalsIgnoreCase("kilocalories per hour")||to.equalsIgnoreCase("Килокалорий в час")) {
			unit_two = kilocalories_per_hour;

		} else if (to.equalsIgnoreCase("calories per hour")||to.equalsIgnoreCase("Калорий в час")) {

			unit_two = calories_per_hour;

		} else if (to.equalsIgnoreCase("horsepower,boiler")||to.equalsIgnoreCase("Котловая лошадиная сила")) {
			unit_two = horsepower_boiler;

		} else if (to.equalsIgnoreCase("horsepower,electric")||to.equalsIgnoreCase("Электрическая лошадиная сила")) {
			unit_two = horsepower_electric;

		} else if (to.equalsIgnoreCase("horsepower,hydraulic")||to.equalsIgnoreCase("Гидравлическая лошадиная сила")) {

			unit_two = horsepower_hydraulic;

		} else if (to.equalsIgnoreCase("horsepower,mechanical (imperial)")||to.equalsIgnoreCase("Механическая лошадиная сила")) {
			unit_two = horsepower_mechanical;

		} else if (to.equalsIgnoreCase("horsepower,metric")||to.equalsIgnoreCase("Метрическая лошадиная сила")) {
			unit_two = horsepower_metric;

		} else if (to.equalsIgnoreCase("kilogramm-force meter per second")||to.equalsIgnoreCase("Килограмм-сила метр в секунду")) {

			unit_two = kilogramm_force_meter_per_second;

		} else if (to.equalsIgnoreCase("joule per second")||to.equalsIgnoreCase("Джоуль в секунду")) {

			unit_two = joule_per_second;
		} else if (to.equalsIgnoreCase("joule per hour")||to.equalsIgnoreCase("Джоуль в час")) {

			unit_two = joule_per_hour;

		} else if (to.equalsIgnoreCase("erg per second")||to.equalsIgnoreCase("Эрг в секунду")) {

			unit_two = erg_per_second;

		} else if (to.equalsIgnoreCase("metric refrigeration ton (RT)")||to.equalsIgnoreCase("Метрическая тонна охлаждения")) {

			unit_two = metric_refrigeration_ton;

		} else if (to.equalsIgnoreCase("U.S. refrigeration ton (USRT)")||to.equalsIgnoreCase("Американская тонна охлаждения")) {

			unit_two = US_refrigeration_ton;

		} else if (to.equalsIgnoreCase("British Thermal Unit per second")||to.equalsIgnoreCase("Британская термальная единица в секунду")) {

			unit_two = British_Thermal_Unit_per_second;

		} else if (to.equalsIgnoreCase("British Thermal Unit per minute")||to.equalsIgnoreCase("Британская термальная единица в минуту")) {

			unit_two = British_Thermal_Unit_per_minute;

		} else if (to.equalsIgnoreCase("British Thermal Unit per hour")||to.equalsIgnoreCase("Британская термальная единица в час")) {

			unit_two = British_Thermal_Unit_per_hour;

		} else if (to.equalsIgnoreCase("foot pound-force per second")||to.equalsIgnoreCase("Фут фунт-сила в секунду")) {

			unit_two = foot_pound_force_per_second;

		}

		// ----------
		finalValue = finalValue * (unit_two / unit_one);
		// -----------------------
		return String.valueOf(finalValue);
	}
}
