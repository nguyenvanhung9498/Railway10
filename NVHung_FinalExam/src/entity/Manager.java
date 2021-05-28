package entity;

public class Manager extends User {
	private int expInYear;
	Project project;

	public Manager(int id, String fullName, String email, String password) {
		super(id, fullName, email, password);

	}

	public Manager(int id, String fullName, String email, String password, int expInYear) {
		super(id, fullName, email, password);
		this.expInYear = expInYear;
	}

	public int getExInYear() {
		return expInYear;
	}

	public void setExInYear(int exInYear) {
		this.expInYear = exInYear;
	}

	@Override
	public String toString() {
		return "Manager [id=" + super.getId() + ",  fullname= " + super.getFullName() + ",  password: ********"
				+ ",  ExpInYear :" + expInYear + "]";
	}

}
