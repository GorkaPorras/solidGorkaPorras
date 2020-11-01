package ISP;

public class Pertsona implements  YearAble {
	String name, adina;

	public Pertsona(String n, String a) {
		name = n;
		adina = a;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdina() {
		return adina;
	}

	public void setAdina(String adina) {
		this.adina = adina;
	}

	
}
