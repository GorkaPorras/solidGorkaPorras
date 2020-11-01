package OCP;

public class DigestiveSymptom extends Symptom {

	public DigestiveSymptom(int c, int s, int a) {
		super(c, s, a);
	}

	public Integer getSeverityIndex() {
		return severityIndex;
	}

	public Integer getAffectedDays() {
		return affectedDays;
	}
	
}
