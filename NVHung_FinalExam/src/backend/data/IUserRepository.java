package backend.data;

import java.sql.SQLException;
import java.util.ArrayList;

import entity.Manager;
import entity.User;

public interface IUserRepository {
	public ArrayList<User> getUser(int id);

	public ArrayList<Manager> getListManager();

	public ArrayList<User> getListUsers();

}
