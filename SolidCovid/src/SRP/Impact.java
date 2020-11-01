package SRP;

public class Impact {

	double getImpact(int y,double afection, double increment) {
		if(y<10) {
			return 0;
		}
		double impact = 0;
		impact = afection + increment;
		return impact;
	}
}
