package ultils;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ScannerUtils {
	private static Scanner scanner = new Scanner(System.in);

	public static String inputEmail() {
		while (true) {
			final String EMAIL_REGEX = "^[a-zA-Z][\\w-]+@([\\w]+\\.[\\w]+|[\\w]+\\.[\\w]{2,}\\.[\\w]{2,})$";
			String email = scanner.nextLine();
			if (Pattern.matches(EMAIL_REGEX, email)) {
				return email;
			} else {
				System.err.println("incorrect, please enter again ! ");
			}
		}

	}

//	public static String inputEmail() {
//
//		final String EMAIL_REGEX = "^[a-zA-Z][\\w-]+@([\\w]+\\.[\\w]+|[\\w]+\\.[\\w]{2,}\\.[\\w]{2,})$";
//		boolean bl = true;
//		do {
//			String email = scanner.nextLine();
//			if (Pattern.matches(EMAIL_REGEX, email)) {
//				bl = false;
//				return email;
//			} else {
//				bl= true;
//				return "Email's pattern incorrect, please enter again!";
//			}
//		} while (bl);
//
//	}
}
