package ISP;

public class NeuroMuscularSymptom extends CurableSymptom {

	public NeuroMuscularSymptom(String n,int c, int s, int a) {
		super(n,c, s, a);
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
