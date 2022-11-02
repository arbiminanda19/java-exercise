public class sumGanjil {
    public static void main(String[] args) {
        long N = 15; // variabel untuk menyimpan nilai N (input pengguna)
        long sum = 0; // variabel untuk menyimpan hasil penjumlahan
        for (int i = 1; i <= N; i++) { // i untuk variabel increment dalam looping
            if (i % 2 != 0) {
                sum += i; //sum = sum + i
            }
        }
        System.out.println("Jumlah: " + sum);
    }
}