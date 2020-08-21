public class AsalCarpanlaraAyirma {

    public static void main(String[] args) {

        int carpan = 2;
        double sayi = 600851475143L; //Javada uzun degismez degerler L ile biter. 600851475143L

        while (sayi / carpan != 1) {
            if (sayi % carpan == 0) {
                sayi = sayi / carpan;
            } else {
                carpan = carpan + 1;
            }
        }
        System.out.print("En büyük asal carpan: " + carpan);
    }
}
