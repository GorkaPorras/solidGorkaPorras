package DIP;

public class CalcAfectionimplementation extends CalcAfection {
	double calculateSympomsAfection(Covid19Pacient p) {
		double afection = 0;
		int elems = 0;
		for (Symptom s : p.symptoms.keySet()) {

			if (s.getCovidImpact() > 50) {

				afection = afection + s.getSeverityIndex() * p.symptoms.get(s);
				elems++;
			}
		}
		if (elems != 0) {
			afection = afection / elems;
		}
		return afection;

	}
}
