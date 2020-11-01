package LSK;

public abstract class Symptom {
	public String name;
	int covidImpact;
	int severityIndex;
	int affectedDays;

	public Symptom(String n,int c, int s, int a) {
		this.covidImpact = c;
		this.severityIndex = s;
		this.affectedDays = a;
		this.name=n;
	}

	public abstract void show();
	
	public abstract void cure();

	public abstract Integer getCovidImpact();

	public abstract Integer getSeverityIndex();

	public abstract Integer getAffectedDays();

}
