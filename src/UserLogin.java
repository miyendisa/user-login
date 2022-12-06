import java.util.Scanner;

public class UserLogin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userName, answer;
        int password, newPassword;

        System.out.print("Enter your username: ");
        userName = scanner.nextLine();
        System.out.print("Enter your password: ");
        password = scanner.nextInt();
        scanner.nextLine();

        if ((userName.equals("aslihan")) && (password == 123456789)) {
            System.out.print("You are succesfully logged in.");
        } else {
            if (!userName.equals("aslihan")) {
                System.out.print("Sorry, your username was incorrect.");
            } else {
                System.out.print("Sorry, your password was incorrect.\nForgot password?\nWrite yes or no: ");
                answer = scanner.nextLine();

                if (answer.equals("yes")) {
                    System.out.print("Reset your password.\nEnter your new password: ");
                    newPassword = scanner.nextInt();
                    if (newPassword != 123456789) {
                        System.out.print("Password Changed!");
                    } else {
                        System.out.println("Error: Unable to change the password.");
                        System.out.print("Your new password must be different from current password.");
                    }
                } else {
                    System.out.print("Please double-check your password.");
                }

            }

        }

    }
}

