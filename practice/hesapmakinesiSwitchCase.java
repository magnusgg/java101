import java.util.Scanner;

public class hesapmakinesiSwitchCase {
    public static void main(String[] args) {
        int n1, n2, select;


        Scanner input = new Scanner(System.in);
        System.out.println("İlk Sayıyı Giriniz: ");
        n1 = input.nextInt();
        System.out.println("İkinci Sayıyı Giriniz");
        n2 = input.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.println("Seçiminiz : ");
        select = input.nextInt();

        switch (select){
            case 1:
                System.out.println("Sonuç : "+ (n1 + n2));
                break;

            case 2:
                System.out.println("Sonuç : "+ (n1 - n2));
                break;

            case 3:
                System.out.println("Sonuç : "+ (n1 * n2));
                break;

            case 4:
                switch (n2){
                    case 0:
                        System.out.println("Tanımsız");
                        break;
                    default:
                        System.out.println("Sonuç : "+ (n1 / n2));

                }
                break;


            default:
                System.out.println("Hatalı Seçim Yaptınız");
        }




    }
}
