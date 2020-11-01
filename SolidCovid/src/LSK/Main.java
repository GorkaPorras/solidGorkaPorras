package LSK;

public class Main {

	public static void main(String[] args) {
			
		Covid19Pacient p=new Covid19Pacient("Gorka", 23);
		
		Symptom c= new CardioVascularSymptom("Hipertensión",51,2,30);
		Symptom n= new NeuroMuscularSymptom("Tos seca",2,4,2);
		Symptom r=new RespiratorySymptom("Neumonia",3,3,20);
		Symptom t= new IncurableSymptom("Tristeza");
		
		p.addSymptom(c,2);
		p.addSymptom(n,2);
		p.addSymptom(r, 3);
		p.addSymptom(t, 3);
		
		p.showSymptoms();
		p.cure();
		//System.out.println(p.calcCovid19Impact());
		//System.out.print(p.sanatedDays().getAffectedDays());
	}

}
