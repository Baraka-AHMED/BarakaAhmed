
public class AssoCultur implements Association{
	
	private AssociationCulturelle c;
	public void inscrire(Eleve e) {}
	
	public AssoCultur(AssociationCulturelle c) {
		this.setAssoC(c);
	}

	public AssociationCulturelle getAssoC() {
		return c;
	}

	public void setAssoC(AssociationCulturelle c) {
		this.c = c;
	}
	

}
