package OCP;

public class NeuroMuscularSymptom extends Symptom {

	public NeuroMuscularSymptom(int c, int s, int a) {
		super(c, s, a);
	}

	public Integer getSeverityIndex() {
		return severityIndex;
	}

	public Integer getAffectedDays() {
		return affectedDays;
	}

}
