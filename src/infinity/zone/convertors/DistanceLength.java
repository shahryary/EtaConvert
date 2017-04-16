package infinity.zone.convertors;

public class DistanceLength {
	

	/**
	 * @param args
	 * @return
	 */
	public String DL(String from, String to, Double Value) {
		Double kilometer = 1.00;
		Double meter = 1000.00;
		Double decimeter = 10000.00;
		Double centimeter = 100000.00;
		Double millimeter = 1000000.00;
		Double mikrometer = 1000000000.00;
		Double nanometer = 1000000000000.00;
		Double angstrom = 10000000000000.00;
		Double mile = 0.62137119;
		Double league = 0.20712373;
		Double furlong = 4.9709695;
		Double chain = 49.709695;
		Double rod = 198.83878;
		Double perch = 198.83878;
		Double fathom = 546.80665;
		Double yard = 1093.6133;
		Double ell = 874.89064;
		Double cubit = 2187.2266;
		Double foot = 3280.8399;
		Double link = 4970.9695;
		Double hand = 9842.5197;
		Double palm = 13123.36;
		Double nail = 17497.813;
		Double inch = 39370.079;
		Double finger = 44994.376;
		Double digit = 50075.113;
		Double barleycorn = 118110.24;
		Double line = 472440.94;
		Double mil = 39370079.00;
		Double microinch = 39370079000.00;

		Double unit_one = 0.0;
		Double unit_two = 0.0;

		Double finalValue = Value;
		// ------------------------------------------------------

		// ------------------------------------------------------

		if (from.equalsIgnoreCase("Angstrom")||from.equalsIgnoreCase("Ангстрем")){
			unit_one = angstrom;

		}else if (from.equalsIgnoreCase("Barleycorn")||from.equalsIgnoreCase("Барлейкорн")){
			unit_one = barleycorn;

		}else if (from.equalsIgnoreCase("Centimeter")||from.equalsIgnoreCase("Сантиметр")){
			unit_one =centimeter;
		}else if (from.equalsIgnoreCase("Chain")||from.equalsIgnoreCase("Чейн")){
			unit_one =chain;
		}else if (from.equalsIgnoreCase("Cubit")||from.equalsIgnoreCase("Кубит")){
			unit_one =cubit;
		}else if (from.equalsIgnoreCase("Decimeter")||from.equalsIgnoreCase("Дециметр")){
			unit_one =decimeter;
		}else if (from.equalsIgnoreCase("Digit")||from.equalsIgnoreCase("Диджит")){
			unit_one =digit;
		}else if (from.equalsIgnoreCase("Ell")||from.equalsIgnoreCase("Эль")){
			unit_one =ell;
		}else if (from.equalsIgnoreCase("Fathom")||from.equalsIgnoreCase("Фантом")){
			unit_one =fathom;
		}else if (from.equalsIgnoreCase("Finger")||from.equalsIgnoreCase("Фингер (палец)")){
			unit_one =finger;
		}else if (from.equalsIgnoreCase("Foot")||from.equalsIgnoreCase("Фут")){
			unit_one =foot;
		}else if (from.equalsIgnoreCase("Furlong")||from.equalsIgnoreCase("Фарлонг")){
			unit_one =furlong;
		}else if (from.equalsIgnoreCase("Hand")||from.equalsIgnoreCase("Хенд (рука)")){
			unit_one =hand;
		}else if (from.equalsIgnoreCase("Inch")||from.equalsIgnoreCase("Дюйм")){
			unit_one =inch;
		}else if (from.equalsIgnoreCase("Kilometer")||from.equalsIgnoreCase("Километр")){
			unit_one =kilometer;
		}else if (from.equalsIgnoreCase("League")||from.equalsIgnoreCase("Лига, лье")){
			unit_one =league;
		}else if (from.equalsIgnoreCase("Line")||from.equalsIgnoreCase("Линия")){
			unit_one =line;
		}else if (from.equalsIgnoreCase("Link")||from.equalsIgnoreCase("Линк")){
			unit_one =link;
		}else if (from.equalsIgnoreCase("Meter")||from.equalsIgnoreCase("Метр")){
			unit_one =meter;
		}else if (from.equalsIgnoreCase("Microinch")||from.equalsIgnoreCase("Микродюйм")){
			unit_one =microinch;
		}else if (from.equalsIgnoreCase("Mikrometer")||from.equalsIgnoreCase("Микрометр")){
			unit_one =mikrometer;
		}else if (from.equalsIgnoreCase("Mil")||from.equalsIgnoreCase("Мил")){
			unit_one =mil;
		}else if (from.equalsIgnoreCase("Mile")||from.equalsIgnoreCase("Миля")){
			unit_one =mile;
		}else if (from.equalsIgnoreCase("Millimeter")||from.equalsIgnoreCase("Миллиметр")){
			unit_one =millimeter;
		}else if (from.equalsIgnoreCase("Nail")||from.equalsIgnoreCase("Ноготь")){
			unit_one =nail;
		}else if (from.equalsIgnoreCase("Nanometer")||from.equalsIgnoreCase("Нанометр")){
			unit_one =nanometer;
		}else if (from.equalsIgnoreCase("Palm")||from.equalsIgnoreCase("Палм (ладонь)")){
			unit_one =palm;
		}else if (from.equalsIgnoreCase("Perch")||from.equalsIgnoreCase("Перчь")){
			unit_one =perch;
		}else if (from.equalsIgnoreCase("Rod")||from.equalsIgnoreCase("Род")){
			unit_one =rod;
		}else if (from.equalsIgnoreCase("Yard")||from.equalsIgnoreCase("Ярд")){
			unit_one =yard;
		}
		//-----------------------------------------------------------------------------------
	
			if (to.equalsIgnoreCase("Angstrom")||to.equalsIgnoreCase("Ангстрем")){
			unit_two = angstrom;

		}else if (to.equalsIgnoreCase("Barleycorn")||to.equalsIgnoreCase("Барлейкорн")){
			unit_two = barleycorn;

		}else if (to.equalsIgnoreCase("Centimeter")||to.equalsIgnoreCase("Сантиметр")){
			unit_two =centimeter;
		}else if (to.equalsIgnoreCase("Chain")||to.equalsIgnoreCase("Чейн")){
			unit_two =chain;
		}else if (to.equalsIgnoreCase("Cubit")||to.equalsIgnoreCase("Кубит")){
			unit_two =cubit;
		}else if (to.equalsIgnoreCase("Decimeter")||to.equalsIgnoreCase("Дециметр")){
			unit_two =decimeter;
		}else if (to.equalsIgnoreCase("Digit")||to.equalsIgnoreCase("Диджит")){
			unit_two =digit;
		}else if (to.equalsIgnoreCase("Ell")||to.equalsIgnoreCase("Эль")){
			unit_two =ell;
		}else if (to.equalsIgnoreCase("Fathom")||to.equalsIgnoreCase("Фантом")){
			unit_two =fathom;
		}else if (to.equalsIgnoreCase("Finger")||to.equalsIgnoreCase("Фингер (палец)")){
			unit_two =finger;
		}else if (to.equalsIgnoreCase("Foot")||to.equalsIgnoreCase("Фут")){
			unit_two =foot;
		}else if (to.equalsIgnoreCase("Furlong")||to.equalsIgnoreCase("Фарлонг")){
			unit_two =furlong;
		}else if (to.equalsIgnoreCase("Hand")||to.equalsIgnoreCase("Хенд (рука)")){
			unit_two =hand;
		}else if (to.equalsIgnoreCase("Inch")||to.equalsIgnoreCase("Дюйм")){
			unit_two =inch;
		}else if (to.equalsIgnoreCase("Kilometer")||to.equalsIgnoreCase("Километр")){
			unit_two =kilometer;
		}else if (to.equalsIgnoreCase("League")||to.equalsIgnoreCase("Лига, лье")){
			unit_two =league;
		}else if (to.equalsIgnoreCase("Line")||to.equalsIgnoreCase("Линия")){
			unit_two =line;
		}else if (to.equalsIgnoreCase("Link")||to.equalsIgnoreCase("Линк")){
			unit_two =link;
		}else if (to.equalsIgnoreCase("Meter")||to.equalsIgnoreCase("Метр")){
			unit_two =meter;
		}else if (to.equalsIgnoreCase("Microinch")||to.equalsIgnoreCase("Микродюйм")){
			unit_two =microinch;
		}else if (to.equalsIgnoreCase("Mikrometer")||to.equalsIgnoreCase("Микрометр")){
			unit_two =mikrometer;
		}else if (to.equalsIgnoreCase("Mil")||to.equalsIgnoreCase("Мил")){
			unit_two =mil;
		}else if (to.equalsIgnoreCase("Mile")||to.equalsIgnoreCase("Миля")){
			unit_two =mile;
		}else if (to.equalsIgnoreCase("Millimeter")||to.equalsIgnoreCase("Миллиметр")){
			unit_two =millimeter;
		}else if (to.equalsIgnoreCase("Nail")||to.equalsIgnoreCase("Ноготь")){
			unit_two =nail;
		}else if (to.equalsIgnoreCase("Nanometer")||to.equalsIgnoreCase("Нанометр")){
			unit_two =nanometer;
		}else if (to.equalsIgnoreCase("Palm")||to.equalsIgnoreCase("Палм (ладонь)")){
			unit_two =palm;
		}else if (to.equalsIgnoreCase("Perch")||to.equalsIgnoreCase("Перчь")){
			unit_two =perch;
		}else if (to.equalsIgnoreCase("Rod")||to.equalsIgnoreCase("Род")){
			unit_two =rod;
		}else if (to.equalsIgnoreCase("Yard")||to.equalsIgnoreCase("Ярд")){
			unit_two =yard;
		}

		// ----------
		finalValue = finalValue * (unit_two / unit_one);
		// -----------------------
		return String.valueOf(finalValue);
	}
}
