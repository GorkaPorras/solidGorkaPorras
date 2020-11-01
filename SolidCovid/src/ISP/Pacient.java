package ISP;

public class Pacient implements YearAble{
	String name;
	int years;
	
	public Pacient(String n, int y) {
		this.name=n;
		this.years=y;
	}
	
	public Integer getYears() {
		return years;
	}
	public String getName() {
		return name;
	}

	@Override
	public String getAdina() {
		return Integer.toString(years);
	}
}
