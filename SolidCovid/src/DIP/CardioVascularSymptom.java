package DIP;

public class CardioVascularSymptom extends Symptom {

	public CardioVascularSymptom(int c, int s, int a) {
		super(c, s, a);
	}

	public Integer getSeverityIndex() {
		return severityIndex;
	}
	public Integer getAffectedDays() {
		return affectedDays;
	}
	public Integer getCovidImpact() {
		return covidImpact;
	}

}
