package frontend;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

import backend.controller.UserController;
import backend.data.UserRepository;
import entity.Employee;
import entity.Manager;
import entity.User;
import ultils.ScannerUtils;

public class function {
	public void xemthongtinManager() {
		UserController userController = new UserController();

		ArrayList<Manager> list = userController.getListManager();
		System.out.println("----------- Table Manager ----------------");
		for (Manager manager : list) {
			System.out.println(manager.toString());
		}
		System.out.println("---------------------------------------");

	}

	public void timUserID() {
		boolean bl = true;
		do {
			UserController userController = new UserController();
			Scanner scanner = new Scanner(System.in);
			System.out.println("please enter ID ");
			if (scanner.hasNextInt()) {
				int id = scanner.nextInt();
				scanner.nextLine();
				ArrayList<User> listuser = userController.getUser(id);
				if (listuser.size() == 0) {
					System.out.println("ID not exists");
				} else {
					for (User user : listuser) {
						System.out.println(user.toString());
					}
				}
				bl = false;
			} else {
				System.out.println("inccorrect, please enter again!");
				scanner.nextLine();
			}
		} while (bl);

	}

	public void login() {
		boolean bl = true;
		UserController userController = new UserController();
		ArrayList<User> list = userController.getListUsers();
		System.out.println("Enter your email !");
		String emailInput = ScannerUtils.inputEmail();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your password !");
		String passwordInput = sc.nextLine();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getEmail().equals(emailInput) && list.get(i).getPassword().equals(passwordInput)) {
				System.out.println("welcome " + list.get(i).getFullName() + " !");
				bl = false;
			}
		}
		if (bl = true) {
			System.out.println("incorrect, please try again !");
		}

	}
}
