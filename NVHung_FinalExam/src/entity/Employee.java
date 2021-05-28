package entity;

public class Employee extends User {
	private int projecID;
	private ProSkills proSkill;
	Project project;

	public int getProjecID() {
		return projecID;
	}

	public void setProjecID(int projecID) {
		this.projecID = projecID;
	}

	public ProSkills getProSkill() {
		return proSkill;
	}

	public void setProSkill(ProSkills proSkill) {
		this.proSkill = proSkill;
	}

	public Employee(int id, String fullName, String email, String password, int projecID) {
		super(id, fullName, email, password);
		this.projecID = projecID;
	}

	@Override
	public String toString() {
		return "EMPlOYEE [id=" + super.getId() + ",  full name= " + super.getFullName() + ",  password: ********"
				+ ",  ProjectID: " + this.projecID + "]";
	}
}
