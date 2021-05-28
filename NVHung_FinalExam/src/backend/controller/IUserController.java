package backend.controller;

import java.util.ArrayList;

import entity.Manager;
import entity.User;

public interface IUserController {
	public ArrayList<User> getUser(int id);

	public ArrayList<Manager> getListManager();

	public ArrayList<User> getListUsers();
}
