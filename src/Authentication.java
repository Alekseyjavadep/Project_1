import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Authentication {
    void check_password(String password) {
        Pattern pattern = Pattern.compile("^.*(?=.{8,})(?=..*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).*$");
        Matcher matcher = pattern.matcher(password);
        boolean isPassword = matcher.matches();
        if (isPassword == true){
            return;
        }
        else System.out.println("Ошибка, введите снова");
        //check_password(password);
        Scanner sc = new Scanner(System.in);
        String password1 = sc.nextLine();
        check_password(password1);
    }
    void check_email(String email) {
        Pattern pattern = Pattern.compile("^[\\w-_.]*[\\w-_.]@[\\w].+[\\w]+[\\w]$");
        Matcher matcher = pattern.matcher(email);
        boolean isEmail = matcher.matches();
        if (isEmail == true){
            return;
        } else System.out.println("Ошибка, введите снова");
        check_email(email);
    }
    void check_login(String login) {
        Pattern pattern = Pattern.compile("^[a-z]+([-_]?[a-z0-9]+){0,2}$");
        Matcher matcher = pattern.matcher(login);
        boolean isLogin = matcher.matches();
        if (isLogin == true){
            System.out.println("Вы успешно зарегистрировались!");
            return;
        } else System.out.println("Ошибка, введите снова");
        check_login(login);
    }

}
