package LSK;

public abstract class CurableSymptom extends Symptom {

	public CurableSymptom(String n, int c, int s, int a) {
		super(n, c, s, a);
	}

	public void show() {
		System.out.println("symptom value :" + name + " severityIndex :" + severityIndex + " covidImpact:" + covidImpact);
	}

	public void cure() {
		System.out.println("treatment applied to: " + name);
	}
	
	public abstract Integer getCovidImpact();

	public abstract Integer getSeverityIndex();

	public abstract Integer getAffectedDays();

}
