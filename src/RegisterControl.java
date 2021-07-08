public class RegisterControl {
    public static boolean kayitKontrol(User user) {
        return user.getAge() > 13 && !user.getName().isEmpty() && !user.getPass().isEmpty();
    }
}
