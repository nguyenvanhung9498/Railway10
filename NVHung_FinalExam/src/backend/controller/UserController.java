package backend.controller;

import java.util.ArrayList;

import backend.businesslayer.UserService;
import entity.Manager;
import entity.User;

public class UserController implements IUserController {
	UserService userService;

	public UserController() {
		userService = new UserService();
	}

	@Override
	public ArrayList<User> getUser(int id) {
		// TODO Auto-generated method stub
		return userService.getUser(id);
	}

	@Override
	public ArrayList<Manager> getListManager() {
		// TODO Auto-generated method stub
		return userService.getListManager();
	}

	@Override
	public ArrayList<User> getListUsers() {
		// TODO Auto-generated method stub
		return userService.getListUsers();
	}

}
