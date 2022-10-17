import java.util.Scanner;

public class kdvhesaplama {
    public static void main(String[] args) {
        double tutar, kdvOran = 0.18, kdvOran2 = 0.08, kdvTutar, kdvliTutar;
        Scanner input = new Scanner(System.in);
        System.out.println("Ücret Tutarını Giriniz");
        tutar = input.nextDouble();

        kdvTutar = (tutar > 1000) ? tutar * kdvOran2 : tutar * kdvOran;
        kdvliTutar = tutar + kdvTutar;


        System.out.println("KDV'siz Tutar : " + tutar);
        boolean kdvOranSon = (tutar > 1000);
        String son = (kdvOranSon)? "KDV Oranı : "+ kdvOran2 : "KDV Oranı : " + kdvOran;
        System.out.println(son);
        System.out.println("KDV Tutarı : " + kdvTutar);
        System.out.println("KDV'li Tutar : " + kdvliTutar);

    }
}
