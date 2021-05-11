import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Authentication {
    String password;
    String email;
    String login;
    int counter_password = 0;

    void check_password() {
        Scanner sc_1 = new Scanner(System.in);
        password = sc_1.next();
        Pattern pattern = Pattern.compile("^.*(?=.{8,})(?=..*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).*$");
        Matcher matcher = pattern.matcher(password);
        boolean isPassword = matcher.matches();
        if (isPassword == true){
            return;
        }
        else System.out.println("Ошибка, введите снова");
        check_password();
    }
    void check_email() {
        Scanner sc_2 = new Scanner(System.in);
        email = sc_2.next();
        Pattern pattern = Pattern.compile("^[\\w-_.]*[\\w-_.]@[\\w].+[\\w]+[\\w]$");
        Matcher matcher = pattern.matcher(email);
        boolean isEmail = matcher.matches();
        if (isEmail == true){
            return;
        } else System.out.println("Ошибка, введите снова");
        check_email();
    }
    void check_login() {
        Scanner sc_2 = new Scanner(System.in);
        login = sc_2.next();
        Pattern pattern = Pattern.compile("^[a-z]+([-_]?[a-z0-9]+){0,2}$");
        Matcher matcher = pattern.matcher(login);
        boolean isLogin = matcher.matches();
        if (isLogin == true){
            System.out.println("Вы успешно зарегистрировались!");
            return;
        } else System.out.println("Ошибка, введите снова");
        check_login();
    }

}
