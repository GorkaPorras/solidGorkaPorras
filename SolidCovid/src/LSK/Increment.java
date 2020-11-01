package LSK;


public class Increment {

	public double getIncrement(Covid19Pacient covid19Pacient, double  afection) {
		double increment = 0;

		if (covid19Pacient.getYears() > 65)
			increment = afection * 0.5;
		return increment;
	}

}
