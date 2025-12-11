package OOP;

import java.util.Scanner;



class User{
    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername(){
        return username;
    }

    public boolean checkPassword(String inputPassword) {
        return password.equals(inputPassword);
    }

    public boolean changePassword(String oldPassword, String newPassword){
        if (checkPassword(oldPassword)){
            this.password = newPassword;
            return true;
        } else {
            return false;
        }
    }



}

public class UserDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // create user
        User user = new User("Awvyyy", "123");

        System.out.println("Login: " + user.getUsername());
        System.out.println("Enter password: ");
        String inputPass = scanner.nextLine();


        if (user.checkPassword(inputPass)) {
            System.out.println("Login Succesful!");

            System.out.println("Do you want to change your password? (yes/no): ");
            String answer = scanner.nextLine();
            if (answer.equalsIgnoreCase("yes")) {
                System.out.println("Enter old password: ");
                String oldPass = scanner.nextLine();
                System.out.println("Enter new password: ");
                String newPass = scanner.nextLine();

                if (user.changePassword(oldPass, newPass)) {
                    System.out.println("Password changed");
                }
                else {
                    System.out.println("Wrong old password, cannot change. ");
                }


                // спросить старый пароль
                // спросить новый
                // вызвать changePassword(...)
            }


        } else {
            System.out.println("Wrong password!");
        }
        scanner.close();
    }
}
