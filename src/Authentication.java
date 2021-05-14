import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Authentication {
    void check_password(String password) {
        Pattern pattern = Pattern.compile("^.*(?=.{8,})(?=..*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).*$");
        Matcher matcher = pattern.matcher(password);
        boolean isPassword = matcher.matches();
        if (isPassword){
            return;
        }
        else System.out.println("Ошибка, введите снова");
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
        Scanner sc = new Scanner(System.in);
        String email_new = sc.next();
        check_email(email_new);
    }
    void check_login(String login) {
        Pattern pattern = Pattern.compile("^[A-Za-z]([.A-Za-z0-9-]{1,18})([A-Za-z0-9])$");
        Matcher matcher = pattern.matcher(login);
        boolean isLogin = matcher.matches();
        if (isLogin){
            return;
        } else System.out.println("Ошибка, введите снова");
        Scanner sc = new Scanner(System.in);
        String login_new = sc.next();
        check_login(login_new);
    }

}
