package entity;

public class Project {
	private int projectID;
	private int teamSize;
	private int idManager;
	private int idEmployees;
	User user;

	public int getProjectID() {
		return projectID;
	}

	public void setProjectID(int projectID) {
		this.projectID = projectID;
	}

	public int getTeamSize() {
		return teamSize;
	}

	public void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}

	public int getIdManager() {
		return idManager;
	}

	public void setIdManager(int idManager) {
		this.idManager = idManager;
	}

	public int getIdEmployees() {
		return idEmployees;
	}

	public void setIdEmployees(int idEmployees) {
		this.idEmployees = idEmployees;
	}

	@Override
	public String toString() {
		return "Project [projectID=" + projectID + ", teamSize=" + teamSize + ", idManager=" + idManager
				+ ", idEmployees=" + idEmployees + "]";
	}

	public Project(int projectID, int teamSize, int idManager, int idEmployees) {
		super();
		this.projectID = projectID;
		this.teamSize = teamSize;
		this.idManager = idManager;
		this.idEmployees = idEmployees;
	}

}
