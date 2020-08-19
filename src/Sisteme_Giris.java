import java.util.Scanner;

public class Sisteme_Giris {

    public static void main(String[] args){

        String sys_kullanici_adi="yazilimbilimi";
        String parola="12345";

        Scanner scan=new Scanner(System.in);

        System.out.println("Kullanici adinizi giriniz: ");
        String kullanici_adi=scan.nextLine();

        System.out.println("Parolanizi giriniz: ");
        String kullanici_parola=scan.nextLine();

        if(!sys_kullanici_adi.equals(kullanici_adi) && !parola.equals(kullanici_parola))
            System.out.println("Kullanici adi ve parolanizi yanlis girdiniz...");
        else if(sys_kullanici_adi.equals(kullanici_adi) && !parola.equals(kullanici_parola))
            System.out.println("Parolanizi yanlis girdiniz...");
        else if(!sys_kullanici_adi.equals(kullanici_adi) && parola.equals(kullanici_parola))
            System.out.println("Kullanici adinizi yanlis girdiniz...");
        else
            System.out.println("Sisteme hosgeldiniz...");

    }
}
