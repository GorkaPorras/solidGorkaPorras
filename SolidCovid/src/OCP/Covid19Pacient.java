package OCP;

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

	//denbora gehien duen Symptom
	Symptom sanatedDays() {
		Symptom lag=new CardioVascularSymptom(0,0,0);

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
		for (Symptom c : symptoms.keySet()) {
			afection = afection + c.getSeverityIndex() * symptoms.get(c);
			//System.out.println("SeverityIndex(): "+c.getSeverityIndex()+" * "+symptoms.get(c)+" Size: "+ symptoms.size());
		}
		afection = afection / (symptoms.size());
		
		// calculate increment
		if (getYears() > 65)
			increment = afection * 0.5;
		// calculate impact
		impact = afection + increment;
		return impact;
	}
}