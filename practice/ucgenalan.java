import java.util.Scanner;

public class ucgenalan {
    public static void main(String[] args) {
        double kenar1, kenar2, kenar3, u, alankare;

        Scanner input = new Scanner(System.in);
        System.out.println("Birinci Kenar Uzunluğu : ");
        kenar1 = input.nextDouble();

        System.out.println("İkinci Kenar Uzunluğu : ");
        kenar2 = input.nextDouble();

        System.out.println("Üçüncü Kenar Uzunluğu : ");
        kenar3 = input.nextDouble();

        u = (kenar1 + kenar2 + kenar3)/2 ;


        alankare = (u * (u - kenar1) * (u - kenar2) * (u - kenar3));
        System.out.println("Alan : " + Math.sqrt(alankare));



    }
}
