import java.util.Locale;
import java.util.Scanner;

public class Toplama
{

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in); //kullanıcıdan input alma

        System.out.print("Bir sayi girin: ");
        int a=scan.nextInt(); //nextInt() kullanıcıdan int deger almak için kullanılır.

        System.out.print("ikinci sayiyi girin: ");
        int b=scan.nextInt();

        int toplam=a+b;
        System.out.println(toplam);
        scan.useLocale(Locale.US); //bu şekilde 3.14 yazabilirim.
    }
}
