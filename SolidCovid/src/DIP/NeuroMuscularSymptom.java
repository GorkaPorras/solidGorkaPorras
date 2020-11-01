package DIP;

public class NeuroMuscularSymptom extends Symptom {

	public NeuroMuscularSymptom(int c, int s, int a) {
		super(c, s, a);
	}

	public Integer getSeverityIndex() {
		// TODO Auto-generated method stub
		return severityIndex;
	}

	@Override
	public Integer getAffectedDays() {
		// TODO Auto-generated method stub
		return affectedDays;
	}

	@Override
	public Integer getCovidImpact() {
		return covidImpact;
	}

}
