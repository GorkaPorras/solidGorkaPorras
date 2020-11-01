package LSK;

public class IncurableSymptom extends Symptom {

	public IncurableSymptom(String n) {
		super(n, 0, 0, 0);
	}

	public void cure() {
		System.out.println("ERROR, can not be treated");
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

	public void show() {
		System.out.println("symptom value :" + name );
		
	}
}