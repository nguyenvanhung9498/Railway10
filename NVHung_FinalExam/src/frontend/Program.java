package frontend;

import java.lang.ModuleLayer.Controller;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

import backend.controller.UserController;
import backend.data.UserRepository;
import entity.*;
import ultils.ScannerUtils;

public class Program {

	public static void main(String[] args) throws SQLException {
		function ft = new function();
		Scanner sc = new Scanner(System.in);
		System.out.println("-- please enter 1 - 4");
		System.out.println("-- 1 get user's information by projecID");
		System.out.println("-- 2 get manager's information");
		System.out.println("-- 3 login");
		System.out.println("-- 4 exit");
		String s1 = sc.nextLine().trim();
		switch (s1) {
		case "1": {
			ft.timUserID();
			break;
		}
		case "2": {
			ft.xemthongtinManager();
			break;
		}
		case "3": {
			ft.login();
			break;
		}
		case "4": {
			System.out.println("Program complete, thank you!");
			break;
		}
		default: {
			System.err.println("in correct, please try again !");
		}
		}

	}
}
