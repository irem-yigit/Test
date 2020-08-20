public class Katlarin_Toplami { // 3 ve 5 in 1000 e kadar olan katlarının toplamı

    public static void main(String[] args){

        int toplam = 0;
        for (int i = 1; i < 1000; i++) {
            if (i % 3 == 0 || i % 5 == 0)
                toplam += i;

        }
        System.out.println("toplam: " + toplam);
    }
}
