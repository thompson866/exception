import java.util.Objects;

public class Main {

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


        }

            public static boolean checkSimbols(String user) {
                for (int i = 0; i < user.length(); i++) {
                    char dataUser = user.charAt(i);
                    // if (!(Character.isLetter(dataUser) || Character.isDigit(dataUser) || dataUser == '_'))
                    if (!(dataUser == '_' || dataUser >= 'A' && dataUser <= 'Z') || (dataUser >= 'a' && dataUser <= 'z')) {
                        return true;
                    }

                }return false;
            }
        public static void main(String[] args) {

            boolean result = condition("java_skypro.g", "D_1hWiKjjP_91", "D_1hWiKjjP_9");
            if (result) {
                System.out.println("данные верны");
            } else {
                System.out.println("некоректные данные");

            }
        }
    }



//    private static void throwCheckedException() {
//    }
//
//    public static void validator(String login, String password, String confirmPassword) {
//    }
//}


//        String login = "oв";
//        if (!checkUser(login)) {
//            System.out.println("Введен недопустимый логин");
//        }
//        try {
//            if (login.length() > 20) throw new WrongLoginException("Логин слишком длинный");
//        } catch (RuntimeException e) {
//
//        }

//
//        String password = "D_1hWiKjjP_9";
//        if (!checkUser(password)) {
//            System.out.println("Введен недопустимый пароль");
//        }
//        try {
//            if (password.length() > 20) throw new WrongPasswordException("пароль слишком длинный");
//        } catch (RuntimeException e) {
//
//
//            String confirmPassword = "D_1hWiKjjP_9";
//
//
//        }
//    }
//}