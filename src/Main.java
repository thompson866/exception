import java.util.Objects;

public class Main {


    public static void main(String[] args) {

        boolean result = condition("java_skypro.go", "D_1hWiKjjP_9", "D_1hWiKjjP_9");

        if (result) {
            System.out.println("данные верны");
        }
    }


    public static boolean condition(String login, String password, String confirmPassword) {
        try {
            checkUser(login, password, confirmPassword);
            return true;
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public static void checkUser(String login, String password, String confirmPassword)
            throws WrongLoginException, WrongPasswordException {

        if (Objects.isNull(login) || login.length() >= 20) {
            throw new WrongLoginException("должен быть равен или меньше 20 символов");
        }
        if (Objects.isNull(password) || password.length() > 20) {
            throw new WrongPasswordException("должен быть строго меньше 20 символов");
        }
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Параметры Password и confirmPassword должны быть равны");
        }


        Checkerable checkerable = new checkControl();
        if (!checkerable.check(login)) {
            throw new WrongLoginException("символы логина некорректны ");
        }
        if (!checkerable.check(password)) {
            throw new WrongPasswordException("символы пароля некорректны ");

        }
    }
}