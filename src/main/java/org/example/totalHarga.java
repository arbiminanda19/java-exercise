package org.example;

public class totalHarga {

    public static void main(String[] args) {

        int[] harga = {10000, 20000, -50000, 0, 10000};
        int sum = 0;
        int i=0;
        while (harga[i] != 0) {
            if (harga[i]>0){
                sum += harga[i];
            }
            i++;
        }

        System.out.println(sum);

    }

}
