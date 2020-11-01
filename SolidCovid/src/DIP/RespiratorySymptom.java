package DIP;

public class RespiratorySymptom extends Symptom {

	public RespiratorySymptom(int c, int s, int a) {
		super(c, s, a);
	}

	public Integer getSeverityIndex() {
		// TODO Auto-generated method stub
		return severityIndex;
	}

	public Integer getAffectedDays() {
		// TODO Auto-generated method stub
		return affectedDays;
	}
	public Integer getCovidImpact() {
		return covidImpact;
	}
}
