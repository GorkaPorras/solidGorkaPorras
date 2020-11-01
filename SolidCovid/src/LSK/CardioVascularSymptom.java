package LSK;

public class CardioVascularSymptom extends CurableSymptom {

	public CardioVascularSymptom(String n,int c, int s, int a) {
		super(n,c, s, a);
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
