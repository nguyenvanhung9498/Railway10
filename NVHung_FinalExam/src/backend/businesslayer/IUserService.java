package backend.businesslayer;

import java.util.ArrayList;

import entity.Manager;
import entity.User;

public interface IUserService {
	public ArrayList<User> getUser(int id);

	public ArrayList<Manager> getListManager();

	public ArrayList<User> getListUsers();

}
