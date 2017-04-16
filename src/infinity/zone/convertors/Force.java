package infinity.zone.convertors;

public class Force {
	

	/**
	 * @param args
	 * @return
	 */
	public String force(String from, String to, Double Value) {
		 
	
		
		// --------------------------------------- calc Angles
		Double meganewton = 1.00;
		Double kilonewton = 1000.00;
		Double newton = 1000000.00;
		Double millinewton = 1000000000.00;
		Double micronewton = 1000000000000.00;
		Double ton_force = 112.40447;
		Double pound_force = 224808.94;
		Double ounce_force = 3596943.10;
		Double tonne_force = 101.97162;
		Double kilopond = 101971.62;
		Double kilogram_force = 101971.62;
		Double grave_force = 101971.62;
		Double gram_force = 101971620.00;
		Double milligrave_force = 101971620.00;
		Double gravet_force  = 101971620.00;
		Double milligram_force = 101971620000.00;

		Double unit_one = 0.0;
		Double unit_two = 0.0;

		Double finalValue = Value;

		// ------------------------------------------------------
		if (from.equalsIgnoreCase("Gram-force")||from.equalsIgnoreCase("Грамм-сила")) {
			unit_one = gram_force;

		} else if (from.equalsIgnoreCase("Grave-force (Gf)")||from.equalsIgnoreCase("Грейв-сила (Gf)")) {
			unit_one = grave_force;

		} else if (from.equalsIgnoreCase("Gravet-force (gf)")||from.equalsIgnoreCase("Гравет-сила (gf)")) {
			unit_one = gravet_force;

		} else if (from.equalsIgnoreCase("Kilogram-force (kgf)")||from.equalsIgnoreCase("Килограмм-сила (kgf)")) {
			unit_one = kilogram_force;

		} else if (from.equalsIgnoreCase("Kilonewton")||from.equalsIgnoreCase("Килоньютон")) {
			unit_one = kilonewton;


		} else if (from.equalsIgnoreCase("Kilopond (kp)")||from.equalsIgnoreCase("Килофунт (kp)")) {
			unit_one = kilopond;


		} else if (from.equalsIgnoreCase("Meganewton")||from.equalsIgnoreCase("Меганьютон")) {
			unit_one = meganewton;


		} else if (from.equalsIgnoreCase("Micronewton")||from.equalsIgnoreCase("Микроньютон")) {
			unit_one = micronewton;


		} else if (from.equalsIgnoreCase("Milligram-force")||from.equalsIgnoreCase("Миллиграмм-сила")) {
			unit_one = milligram_force;


		} else if (from.equalsIgnoreCase("Milligrave-force (mGf)")||from.equalsIgnoreCase("Миллигрейв-сила (mGf)")) {
			
			unit_one = milligrave_force;

		} else if (from.equalsIgnoreCase("Millinewton")||from.equalsIgnoreCase("Миллиньютон")) {
			unit_one = millinewton;


		} else if (from.equalsIgnoreCase("Newton")||from.equalsIgnoreCase("Ньютон")) {
			unit_one = newton;


		} else if (from.equalsIgnoreCase("Ounce-force (ozf)")||from.equalsIgnoreCase("Унция-сила (ozf)")) {
			
			unit_one = ounce_force;

		} else if (from.equalsIgnoreCase("Pound-force (lbf)")||from.equalsIgnoreCase("Фунт-сила (lbf)")) {
			unit_one = pound_force;


		} else if (from.equalsIgnoreCase("Ton-force (tnf)")||from.equalsIgnoreCase("Тонна-сила (tnf)")) {
			unit_one = ton_force;


		} else if (from.equalsIgnoreCase("Tonne-force")||from.equalsIgnoreCase("Тонна-сила (тс)")) {
			
			unit_one = tonne_force;

		}

		

		// ------- Convert To
		// ------------------------------------------------------
		if (to.equalsIgnoreCase("Gram-force")||to.equalsIgnoreCase("Грамм-сила")) {
			unit_two = gram_force;

		} else if (to.equalsIgnoreCase("Grave-force (Gf)")||to.equalsIgnoreCase("Грейв-сила (Gf)")) {
			unit_two = grave_force;

		} else if (to.equalsIgnoreCase("Gravet-force (gf)")||to.equalsIgnoreCase("Гравет-сила (gf)")) {
			unit_two = gravet_force;

		} else if (to.equalsIgnoreCase("Kilogram-force (kgf)")||to.equalsIgnoreCase("Килограмм-сила (kgf)")) {
			unit_two = kilogram_force;

		} else if (to.equalsIgnoreCase("Kilonewton")||to.equalsIgnoreCase("Килоньютон")) {
			unit_two = kilonewton;


		} else if (to.equalsIgnoreCase("Kilopond (kp)")||to.equalsIgnoreCase("Килофунт (kp)")) {
			unit_two = kilopond;


		} else if (to.equalsIgnoreCase("Meganewton")||to.equalsIgnoreCase("Меганьютон")) {
			unit_two = meganewton;


		} else if (to.equalsIgnoreCase("Micronewton")||to.equalsIgnoreCase("Микроньютон")) {
			unit_two = micronewton;


		} else if (to.equalsIgnoreCase("Milligram-force")||to.equalsIgnoreCase("Миллиграмм-сила")) {
			unit_two = milligram_force;


		} else if (to.equalsIgnoreCase("Milligrave-force (mGf)")||to.equalsIgnoreCase("Миллигрейв-сила (mGf)")) {
			
			unit_two = milligrave_force;

		} else if (to.equalsIgnoreCase("Millinewton")||to.equalsIgnoreCase("Миллиньютон")) {
			unit_two = millinewton;


		} else if (to.equalsIgnoreCase("Newton")||to.equalsIgnoreCase("Ньютон")) {
			unit_two = newton;


		} else if (to.equalsIgnoreCase("Ounce-force (ozf)")||to.equalsIgnoreCase("Унция-сила (ozf)")) {
			
			unit_two = ounce_force;

		} else if (to.equalsIgnoreCase("Pound-force (lbf)")||to.equalsIgnoreCase("Фунт-сила (lbf)")) {
			unit_two = pound_force;


		} else if (to.equalsIgnoreCase("Ton-force (tnf)")||to.equalsIgnoreCase("Тонна-сила (tnf)")) {
			unit_two = ton_force;


		} else if (to.equalsIgnoreCase("Tonne-force")||to.equalsIgnoreCase("Тонна-сила (тс)")) {
			
			unit_two = tonne_force;

		}


		// ----------
		finalValue = finalValue * (unit_two / unit_one);
		// -----------------------
		return String.valueOf(finalValue);
	}
}
