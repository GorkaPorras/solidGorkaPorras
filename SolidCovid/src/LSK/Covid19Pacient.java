package LSK;

import java.util.HashMap;
import java.util.Map;

public class Covid19Pacient extends Pacient {

	public Covid19Pacient(String name, int years) {
		super(name, years);

	}

	Map<Symptom, Integer> symptoms = new HashMap<Symptom, Integer>();

//Symptoma sartu
	void addSymptom(Symptom s, Integer w) {
		symptoms.put(s, w);
	}

	public void showSymptoms() {
		for (Symptom s : symptoms.keySet())
			s.show();
	}

	public void cure() {
		for (Symptom s : symptoms.keySet())
			s.cure();
	}

	// denbora gehien duen Symptom
	Symptom sanatedDays() {
		Symptom lag = new CardioVascularSymptom("proba", 0, 0, 0);

		for (Symptom c : symptoms.keySet()) {
			if (lag.getAffectedDays() < c.affectedDays) {
				lag = c;

			}
		}
		return lag;
	}

	double calcCovid19Impact() {
		double afection = 0;
		double increment = 0;
		double impact;

		// calculate afection
		Afection af = new Afection();
		afection = af.getAfection(symptoms);

		// calculate increment
		Increment in = new Increment();
		increment = in.getIncrement(this, afection);

		// calculate impact
		Impact im = new Impact();
		impact = im.getImpact(getYears(), afection, increment);
		return impact;
	}
}