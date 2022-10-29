package org.example;

public class kemunculanAngka {

    public static void main(String[] args) {

        int[] arrayNum = {0,1,2,3,4,5,4,6,4,7,4};
        int x = 8;
        int count = 0;

        for (int check : arrayNum) {
            if (check == x) {
                count++;
            }
        }

        switch (count) {
            case 0:
                System.out.println(x + " Tidak ditemukan");
                break;
            default:
                System.out.println(x + " muncul sebanyak " + count + " kali");
        }



    }

}
