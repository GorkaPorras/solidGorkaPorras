package OCP;

public class Main {

	public static void main(String[] args) {
			
		Covid19Pacient p=new Covid19Pacient("Gorka", 23);
		
		Symptom c= new CardioVascularSymptom(1,2,30);
		Symptom n= new NeuroMuscularSymptom(2,4,2);
		Symptom r=new RespiratorySymptom(3,3,20);
		
		p.addSymptom(c,2);
		p.addSymptom(n,2);
		p.addSymptom(r, 3);
		
		System.out.println(p.getName()+"-en Covid inpaktua: "+p.calcCovid19Impact());
		System.out.print(p.getName()+"-k "+p.sanatedDays().getAffectedDays()+" egun behar ditu sendatzeko");
	}

}
