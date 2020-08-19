import java.util.Locale;
import java.util.Scanner;

public class giris_1
{

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in); //kullanıcıdan input alma

        System.out.println("Bir sayi girin: ");
        int a=scan.nextInt(); //nextInt() kullanıcıdan int deger almak için kullanılır.

        System.out.println("ikinci sayiyi girin: ");
        int b=scan.nextInt();

        //System.out.println("a degiskeni "+a+" dir");
        //System.out.println("b degiskeni "+b+" dir");
        int toplam=a+b;

        System.out.println(toplam);


        scan.useLocale(Locale.US); //bu şekilde 3.14 yazabilirim.





    }
}
