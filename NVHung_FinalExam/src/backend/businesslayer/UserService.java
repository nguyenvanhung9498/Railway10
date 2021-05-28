package backend.businesslayer;

import java.util.ArrayList;

import backend.data.UserRepository;
import entity.Manager;
import entity.User;

public class UserService implements IUserService {
	UserRepository userRepository;

	public UserService() {
		userRepository = new UserRepository();
	}

	@Override
	public ArrayList<User> getUser(int id) {
		return userRepository.getUser(id);
	}

	@Override
	public ArrayList<Manager> getListManager() {
		// TODO Auto-generated method stub
		return userRepository.getListManager();
	}

	@Override
	public ArrayList<User> getListUsers() {
		// TODO Auto-generated method stub
		return userRepository.getListUsers();
	}

}
