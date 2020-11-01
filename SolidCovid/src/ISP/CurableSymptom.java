package ISP;

public abstract class CurableSymptom implements Symptom {
	public String name;
	int covidImpact;
	int severityIndex;
	int affectedDays;

	public CurableSymptom(String n,int c, int s, int a) {
		this.covidImpact = c;
		this.severityIndex = s;
		this.affectedDays = a;
		this.name=n;
	}
	

	public void show() {
		System.out.println("symptom value :" + name + " severityIndex :" + severityIndex + " covidImpact:" + covidImpact);
	}

	public void cure() {
		System.out.println("treatment applied to: " + name);
	}

}
