import java.util.Scanner;

public class Main {
    public static boolean checkUser(String user) {
        for (int i = 0; i < user.length(); i++) {
            char dataUser = user.charAt(i);
            if (!(dataUser == '_' || dataUser >= 'A' && dataUser <= 'Z') || (dataUser >= 'a' && dataUser <= 'z')) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String login = "java_skypro.go";
        if (!checkUser(login)) {
            System.out.println("Введен недопустимый логин");
        }
        try {
            if (login.length() > 20) throw new WrongLoginException();
        } catch (RuntimeException e) {
            System.out.println("Логин слишком длинный");
        }
        String password = "D_1hWiKjjP_9";
        if (!checkUser(password)) {
            System.out.println("Введен недопустимый пароль");
        }
        try {
            if (password.length() > 20) throw new WrongPasswordException();
        } catch (RuntimeException e) {
            System.out.println("пароль слишком длинный");
            String confirmPassword = "D_1hWiKjjP_9";


        }
    }
}