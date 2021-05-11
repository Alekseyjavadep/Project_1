import jdk.swing.interop.SwingInterOpUtils;

import javax.swing.plaf.synth.SynthTabbedPaneUI;
import java.lang.annotation.ElementType;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Authentication authentication = new Authentication();
        String login = "login1";
        String password = "123@pP";
        System.out.println("1 - вход");
        System.out.println("2 = регистрация");
        Scanner sc = new Scanner(System.in);
        String start = sc.nextLine();
        if (start.equals("1")){
            System.out.println("Введите ваш логин");
            String inputLogin = sc.nextLine();
            System.out.println("Введите ваш пароль");
            String inputPassword = sc.nextLine();
            if (inputLogin.equals("login1")){
                if (inputPassword.equals("123@pP")){
                    System.out.println("Вы успешно вошли");
                }
            }else System.out.println("Ошибка входа");
        }else{
            System.out.println("Введите пароль");
            authentication.check_password();
            System.out.println("Введите Email");
            authentication.check_email();
            System.out.println("Введите логин");
            authentication.check_login();
        }
    }
}
