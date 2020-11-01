package ISP;

public class IncurableSymptom implements Symptom {

	public String name;

	public IncurableSymptom(String n) {
		this.name=n;
	}
	
	public void cure() {
		System.out.println("ERROR, can not be treated");
	}
	@Override
	public void show() {
		System.out.println("symptom value :" + name );
		
	}

	@Override
	public Integer getCovidImpact() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer getSeverityIndex() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer getAffectedDays() {
		// TODO Auto-generated method stub
		return null;
	}

}