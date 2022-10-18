import java.util.Scanner;
public class manavkasa {
    public static void main(String[] args) {

        double armut, elma, domates, muz, patlican, total;

        Scanner input = new Scanner(System.in);

        System.out.println("Armut Kaç Kg ? ");
        armut = input.nextDouble();

        System.out.println("Elma Kaç Kg ? ");
        elma = input.nextDouble();

        System.out.println("Domates Kaç Kg ? ");
        domates = input.nextDouble();

        System.out.println("Muz Kaç Kg ? ");
        muz = input.nextDouble();

        System.out.println("Patlican Kaç Kg ? ");
        patlican = input.nextDouble();

        total = (armut * 2.14) + (elma * 3.67) + (domates * 1.11) + (muz * 0.95) + (patlican * 5);
        System.out.println("Toplam Tutar : " + total + "TL");

    }
}
