public class UserManager{
    public void kayitOl(User user) {
        if(RegisterControl.kayitKontrol(user)) {
            System.out.println("Kayıt başarıyla gerçekleşti.");
        } else {
            System.out.println("Kayıt gerçekleştirilirken hata ortaya çıktı.");
            return;
        }
    }
    public void girisYap(User user, String girilenname, String girilenpass) {
        if(AccessControl.girisKontrol(user, girilenname, girilenpass)) {
            System.out.println("Giriş başarıyla gerçekleşti.");
        } else {
            System.out.println("Giriş yapılırkan sorun çıktı.");
        }
    }
}
