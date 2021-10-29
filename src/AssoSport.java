
public class AssoSport implements Association {
	private AssociationSportive s;
	public void inscrire (Eleve e) {}
	
	public AssoSport(AssociationSportive s) {
		this.setAssoS(s);
	}

	public AssociationSportive getAssoS() {
		return s;
	}

	public void setAssoS(AssociationSportive s) {
		this.s = s;
	}
}
