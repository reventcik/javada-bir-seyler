public class AccessControl {
    public static boolean girisKontrol(User user, String name, String pass) {
        return user.getName().equals(name) && user.getPass().equals(pass);
    }
}
