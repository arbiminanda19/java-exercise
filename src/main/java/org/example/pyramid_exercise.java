package org.example;

public class pyramid_exercise {

    public static void main(String[] args) {

        int input = 5;
        int i = 0;
        int j = 0;
        int k =0;

        //rata kiri
        for (i=0; i<input; i++) {
            for (j=input; j>i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

        //rata kanan
        for (i=0; i<input; i++) {
            for (j=0; j<i; j++){
                System.out.print(" ");
            }
            for (k = (j-i); k<(input-j); k++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

}
