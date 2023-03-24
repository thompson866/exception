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
        String password = "D_1hWiKjjP_9";
        String confirmPassword = "D_1hWiKjjP_9";

    }

}