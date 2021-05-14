import jdk.swing.interop.SwingInterOpUtils;

import javax.swing.plaf.synth.SynthTabbedPaneUI;
import java.lang.annotation.ElementType;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    static Authentication authentication = new Authentication();
    public static String login;
    private static String password;
    static int counter = 0;
    static ArrayList<String> input_data = new ArrayList<String>();

    static void input_chek_login_and_password() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите логин");
        login = sc.next();
        System.out.println("Введите пароль");
        password = sc.next();
        if (login.equals(input_data.get(2))){
            if (password.equals(input_data.get(3))){
                System.out.println("Вы успешно вошли!");
                counter++;
                return;
            }
        }else System.out.println("Ошибка входа.");
        input_chek_login_and_password();
//        int a = 1;
//        switch (a) {
//            case 1:
//                System.out.println("Введите логин");
//                login = sc.next();
//                login.equals(input_data.get(0));
//            case 2:
//                System.out.println("Введите пароль");
//                password = sc.next();
//                if (login.equals(input_data.get(1))) {
//                    break;
//                }
//            case 3:
//                System.out.println("Некоректно введены данные, повторите попытку");
//                input_chek_login_and_password();
//        }
    }
        static void check_in(){
            Scanner sc = new Scanner(System.in);

            System.out.println("Фамилия Имя Отчество:");
            input_data.add(0, sc.nextLine());

            System.out.println("email");
            input_data.add(1,sc.nextLine());
            authentication.check_email(input_data.get(1));

            System.out.println("Логин:");
            input_data.add(2, sc.nextLine());
            authentication.check_login(input_data.get(2));

            System.out.println("Пароль:");
            System.out.println("Пароль должен соотвествовать следующим критериям:");
            System.out.println("Длинна не меньше 6 символов, заглавные и пропиcные буквы, цифру, специальный символ");
            input_data.add(3, sc.nextLine());
            authentication.check_password(input_data.get(3));

            System.out.println("Роль:");
            input_data.add(4,sc.nextLine());

        }
        static void get_info(){
        if (counter == 1){
            System.out.println("Добро пожаловать" + " " + input_data.get(0));
            System.out.println("Ваша роль в проекте" + " " + "-" + " " + input_data.get(4));
        }
        }
        public static void main (String[]args){
            Scanner sc = new Scanner(System.in);
            System.out.println("1 - вход");
            System.out.println("2 - регистрация");
            int start = sc.nextInt();
                switch (start)
                {
                    case 1:
                        System.out.println("Вход по паролю и логину");
                        break;
                    case 2:
                        check_in();
                        System.out.println("Регистрация успешно выполнена");
                        break;
                    default:
                        System.out.println("Введена некорректно цифра");
                }
            System.out.println("Для входа введите данные:");
            input_chek_login_and_password();
            get_info();
        }
    }
