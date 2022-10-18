import java.util.Scanner;
public class dairedilimialan {
    public static void main(String[] args) {

        double pi = 3.14 , r , alan , alfa;

        Scanner input = new Scanner(System.in);

        System.out.println("Yarıçapı Giriniz : ");
        r = input.nextDouble();

        System.out.println("Açıyı Giriniz");
        alfa = input.nextDouble();

        alan = (pi * (r * r) * alfa)/360;

        System.out.println("Daire Diliminin Alanı : " + alan);


    }
}
