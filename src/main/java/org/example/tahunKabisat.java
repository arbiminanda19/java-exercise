package org.example;

public class tahunKabisat {

    public static void main(String[] args) {

        int tahun = 2004;

        if (((tahun % 4 == 0) && (tahun % 100 != 0)) || (tahun % 400 == 0)) {
            System.out.println(tahun + " tahun kabisat");
        } else {
            System.out.println(tahun + " bukan tahun kabisat");
        }

        switch (tahun % 4) {
            case 0:
                System.out.println("Tahun Kabisat");
                break;
            default:
                System.out.println("Bukan Tahun Kabisat");
        }
    }

}
