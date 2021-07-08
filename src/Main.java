import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kayıt olmak için aşağıdaki bilgileri doldurunuz.");

        System.out.println("Lütfen isminizi giriniz: ");
        String name = scanner.next();
        System.out.println("Lütfen yaşınızı: ");
        int age = scanner.nextInt();
        System.out.println("Lütfen şifrenizi: ");
        String pass = scanner.next();
        System.out.println("---------------------");

        User user = new User(name, pass, age);
        UserManager manager = new UserManager();
        manager.kayitOl(user);
        System.out.println(user.getPass());

        System.out.println("Giriş yapmak için isminizi giriniz: ");
        String girilenname = scanner.next();
        System.out.println("Giriş yapmak için şifrenizi giriniz: ");
        String girilenpass = scanner.next();

        manager.girisYap(user, girilenname, girilenpass);

    }
}
