import java.util.Scanner;
public class vucutkitleindeksi {
    public static void main(String[] args) {

        double boy, kilo, indeks;

        Scanner girdi = new Scanner(System.in);
        System.out.println("Boyunuzu Metre Cinsinden Giriniz : ");
        boy = girdi.nextDouble();

        System.out.println("Kilonuzu Kg Cinsinden Giriniz : ");
        kilo = girdi.nextDouble();

        indeks = kilo/(boy * boy);
        System.out.println("Vücut Kitle İndeksiniz : " + indeks);

    }
}
