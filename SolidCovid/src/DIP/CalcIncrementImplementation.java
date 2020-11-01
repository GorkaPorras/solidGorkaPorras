package DIP;

public class CalcIncrementImplementation extends CalcIncrement {


	public double calculateIncrementPerYear(Covid19Pacient p, double afection) {
		
			double increment = 0;

			if (p.getYears() > 65)
				increment = afection * 0.5;
			return increment;
		
	}
	
	/*public double getIncrement(Covid19Pacient p, double  afection) {
	double increment = 0;

	if (p.getYears() > 45 && p.getYears()<65)
		increment = afection * 0.3;
	return increment;
}
*/

}
