package OCP;

public class RespiratorySymptom extends Symptom {

	public RespiratorySymptom(int c, int s, int a) {
		super(c, s, a);
	}

	public Integer getSeverityIndex() {
		return severityIndex;
	}

	public Integer getAffectedDays() {
		return affectedDays;
	}
}
