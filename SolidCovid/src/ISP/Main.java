package ISP;

public class Main {

	public static void main(String[] args) {		
		
		Pertsona p=new Pertsona("Ibon", "75");

		CalcIncrement ci=new CalcIncrementImplementation();
		double Increment=ci.calculateIncrementPerYear(p, 40);
		System.out.print(Increment);
		

	}

}
