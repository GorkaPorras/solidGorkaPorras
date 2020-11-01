package LSK;

public class NeuroMuscularSymptom extends CurableSymptom {

	public NeuroMuscularSymptom(String n,int c, int s, int a) {
		super(n,c, s, a);
	}

	public Integer getSeverityIndex() {
		return severityIndex;
	}

	@Override
	public Integer getAffectedDays() {
		return affectedDays;
	}

	@Override
	public Integer getCovidImpact() {
		return covidImpact;
	}

}
