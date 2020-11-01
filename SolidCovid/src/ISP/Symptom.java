package ISP;

public interface Symptom {

		public abstract void show();
		
		public abstract void cure();

		public abstract Integer getCovidImpact();

		public abstract Integer getSeverityIndex();

		public abstract Integer getAffectedDays();

	
}
