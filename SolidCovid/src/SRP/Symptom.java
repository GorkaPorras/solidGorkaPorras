package SRP;

public abstract class Symptom {
	int covidImpact;
	int severityIndex;
	int affectedDays;

	public Symptom(int c, int s ,int a) {
		this.covidImpact = c;
		this.severityIndex = s;
		this.affectedDays=a;
	}
	
	public abstract Integer getCovidImpact();
	public abstract Integer getSeverityIndex();
	public abstract Integer getAffectedDays();
	
	
}
