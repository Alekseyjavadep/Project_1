import jdk.swing.interop.SwingInterOpUtils;

import javax.swing.plaf.synth.SynthTabbedPaneUI;
import java.lang.annotation.ElementType;
import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Authentication authentication = new Authentication();
        Scanner sc = new Scanner(System.in);
        String password = null;
        String email;
        String login = null;
        System.out.println("1 - вход");
        System.out.println("2 = регистрация");
        Scanner sc1 = new Scanner(System.in);
        String start = sc.nextLine();
        if (start.equals("1")) {
            System.out.println("Введите ниже ваш логин");
            String inputLogin = sc.nextLine();
            String inputPassword = sc.nextLine();
            if (inputLogin.equals("login1")) {
                if (inputPassword.equals("123@pP")) {
                    System.out.println("Вы успешно вошли");
                }
            } else System.out.println("Ошибка входа");
        } else {
            System.out.println("Введите ваш пароль" + " " + "Пароль должен соотвествовать следующим критериям:");
            System.out.println("Длинна не меньше 6 символов");
            System.out.println("Заглавные и прописные буквы");
            System.out.println("Один из специальных символов:@,#,$,%");
            password = sc.nextLine();
            authentication.check_password(password);
            System.out.println("Введите Email");
            email = sc.nextLine();
            authentication.check_email(email);
            System.out.println("Введите логин");
            login = sc.nextLine();
            authentication.check_login(login);
        }
        System.out.println("Для входа введите ваш логин и пароль");
        System.out.println("Логин:");
        String login_input = sc.nextLine();
        System.out.println("Пароль:");
        String password_input = sc.nextLine();
        if (login_input.equals(login)) {
           if(password_input.equals(password)){
               System.out.println("Вы успешно вошли");
           }else System.out.println("Ошибка");
        }
    }
}
