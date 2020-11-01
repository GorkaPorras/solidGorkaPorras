package ISP;

public class RespiratorySymptom  extends CurableSymptom  {

	public RespiratorySymptom(String n,int c, int s, int a) {
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
