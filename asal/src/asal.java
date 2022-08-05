public class asal {
    public static void main(String[] args) {
        int sayac = 0;
        String asalSayilar = "";
        for (int i = 1; i <= 100; i++) {
            for (int k = i; k >= 1; k--) {
                if (i % k == 0) {
                    sayac ++;
                }
            }
            if (sayac == 2) {
                asalSayilar = asalSayilar + i + " ";
            }
        }
        System.out.println(asalSayilar);
    }
}
