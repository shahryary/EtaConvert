package infinity.zone.convertors;

public class Area {
	

	/**
	 * @param args
	 * @return
	 */
	public String Area(String from, String to, Double Value) {

		// --------------------------------------- calc Angles
		Double squareKilometer = 1.00;
		Double hectare = 100.00;
		Double decare = 1000.00;
		Double are = 10000.00;
		Double squareMeter = 1000000.00;
		Double squareDecimeter = 100000000.00;
		Double squareCentimeter = 10000000000.00;
		Double squareMillimeter = 1000000000000.00;
		Double barn = 1.00E+34;
		Double township = 0.01072506;
		Double homestead = 1.5444086;
		Double squareMile = 0.38610216;
		Double acre = 247.10538;
		Double rude = 988.42153;
		Double squareRod = 39536.861;
		Double perch = 39536.861;
		Double square =107639.1;
		Double squareYard = 1195990.00;
		Double squareFt = 10763910.00;
		Double squareInch = 1550003100.00;

		Double unit_one = 0.0;
		Double unit_two = 0.0;

		Double finalValue = Value;
		// ------------------------------------------------------
		// ------------------------------------------------------
		if (from.equalsIgnoreCase("Acre")||from.equalsIgnoreCase("Акр")) {
			unit_one = acre;

		} else if (from.equalsIgnoreCase("Are")||from.equalsIgnoreCase("Ар")) {
			unit_one = are;

		} else if (from.equalsIgnoreCase("Barn")||from.equalsIgnoreCase("Барн")) {
			unit_one = barn;

		} else if (from.equalsIgnoreCase("Decare")||from.equalsIgnoreCase("Декар")) {
			unit_one = decare;

		} else if (from.equalsIgnoreCase("Hectare")||from.equalsIgnoreCase("Гектар")) {
			unit_one = hectare;


		} else if (from.equalsIgnoreCase("Homestead")||from.equalsIgnoreCase("Хомстед")) {
			unit_one = homestead;


		} else if (from.equalsIgnoreCase("Perch")||from.equalsIgnoreCase("Перч")) {
			unit_one = perch;


		} else if (from.equalsIgnoreCase("Rude")||from.equalsIgnoreCase("Руд")) {
			unit_one = rude;


		} else if (from.equalsIgnoreCase("Square")||from.equalsIgnoreCase("Квадрат")) {
			unit_one = square;


		} else if (from.equalsIgnoreCase("SquareCentimeter")||from.equalsIgnoreCase("Квадратный сантиметр")) {
			
			unit_one = squareCentimeter;

		}  else if (from.equalsIgnoreCase("SquareDecimeter")||from.equalsIgnoreCase("Квадратный дециметр")) {
			
			unit_one = squareDecimeter;

		} else if (from.equalsIgnoreCase("SquareFt")||from.equalsIgnoreCase("Квадратный фут")) {
			
			unit_one = squareFt;

		} else if (from.equalsIgnoreCase("SquareInch")||from.equalsIgnoreCase("Квадратный дюйм")) {
			
			unit_one = squareInch;

		} else if (from.equalsIgnoreCase("SquareKilometer")||from.equalsIgnoreCase("Квадратный километр")) {
			
			unit_one = squareKilometer;

		} else if (from.equalsIgnoreCase("SquareMeter")||from.equalsIgnoreCase("Квадратный метр")) {
			
			unit_one = squareMeter;

		} else if (from.equalsIgnoreCase("SquareMile")||from.equalsIgnoreCase("Квадратная миля")) {
			
			unit_one = squareMile;

		} else if (from.equalsIgnoreCase("SquareMillimeter")||from.equalsIgnoreCase("Квадратный миллиметр")) {
			
			unit_one = squareMillimeter;

		} else if (from.equalsIgnoreCase("SquareRod")||from.equalsIgnoreCase("Квадратный род")) {
			
			unit_one = squareRod;

		} else if (from.equalsIgnoreCase("SquareYard")||from.equalsIgnoreCase("Квадратный ярд")) {
			
			unit_one = squareYard;

		} else if (from.equalsIgnoreCase("Township")||from.equalsIgnoreCase("Тауншип")) {
			
			unit_one = township;

		}
		//-----------------------
		if (to.equalsIgnoreCase("Acre")||to.equalsIgnoreCase("Акр")) {
			unit_two = acre;

		} else if (to.equalsIgnoreCase("Are")||to.equalsIgnoreCase("Ар")) {
			unit_two = are;

		} else if (to.equalsIgnoreCase("Barn")||to.equalsIgnoreCase("Барн")) {
			unit_two = barn;

		} else if (to.equalsIgnoreCase("Decare")||to.equalsIgnoreCase("Декар")) {
			unit_two = decare;

		} else if (to.equalsIgnoreCase("Hectare")||to.equalsIgnoreCase("Гектар")) {
			unit_two = hectare;


		} else if (to.equalsIgnoreCase("Homestead")||to.equalsIgnoreCase("Хомстед")) {
			unit_two = homestead;


		} else if (to.equalsIgnoreCase("Perch")||to.equalsIgnoreCase("Перч")) {
			unit_two = perch;


		} else if (to.equalsIgnoreCase("Rude")||to.equalsIgnoreCase("Руд")) {
			unit_two = rude;


		} else if (to.equalsIgnoreCase("Square")||to.equalsIgnoreCase("Квадрат")) {
			unit_two = square;


		} else if (to.equalsIgnoreCase("SquareCentimeter")||to.equalsIgnoreCase("Квадратный сантиметр")) {
			
			unit_two = squareCentimeter;

		}  else if (to.equalsIgnoreCase("SquareDecimeter")||to.equalsIgnoreCase("Квадратный дециметр")) {
			
			unit_two = squareDecimeter;

		} else if (to.equalsIgnoreCase("SquareFt")||to.equalsIgnoreCase("Квадратный фут")) {
			
			unit_two = squareFt;

		} else if (to.equalsIgnoreCase("SquareInch")||to.equalsIgnoreCase("Квадратный дюйм")) {
			
			unit_two = squareInch;

		} else if (to.equalsIgnoreCase("SquareKilometer")||to.equalsIgnoreCase("Квадратный километр")) {
			
			unit_two = squareKilometer;

		} else if (to.equalsIgnoreCase("SquareMeter")||to.equalsIgnoreCase("Квадратный метр")) {
			
			unit_two = squareMeter;

		} else if (to.equalsIgnoreCase("SquareMile")||to.equalsIgnoreCase("Квадратная миля")) {
			
			unit_two = squareMile;

		} else if (to.equalsIgnoreCase("SquareMillimeter")||to.equalsIgnoreCase("Квадратный миллиметр")) {
			
			unit_two = squareMillimeter;

		} else if (to.equalsIgnoreCase("SquareRod")||to.equalsIgnoreCase("Квадратный род")) {
			
			unit_two = squareRod;

		} else if (to.equalsIgnoreCase("SquareYard")||to.equalsIgnoreCase("Квадратный ярд")) {
			
			unit_two = squareYard;

		} else if (to.equalsIgnoreCase("Township")||to.equalsIgnoreCase("Тауншип")) {
			
			unit_two = township;

		}
		

		// ----------
		finalValue = finalValue * (unit_two / unit_one);
		// -----------------------
		return String.valueOf(finalValue);
	}
}
