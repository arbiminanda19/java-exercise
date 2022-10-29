package org.example;

public class anagram {

    public static void main(String[] args) {

        String str1 = "acbd";
        String str2 = "dcba";

        char[] charStr1 = str1.toCharArray();
        char[] charStr2 = str2.toCharArray();

        int i, k = 0;
        char temp;
        for (i=0; i<str1.length()-1; i++) {
            for (k=0; k<str1.length()-1; k++) {
                if (charStr1[k] > charStr1[k+1]) {
                    temp = charStr1[k];
                    charStr1[k] = charStr1[k+1];
                    charStr1[k+1] = temp;
                }
            }
        }

        str1 = String.valueOf(charStr1);

        for (i=0; i<str2.length()-1; i++) {
            for (k=0; k<str2.length()-1; k++) {
                if (charStr2[k] > charStr2[k+1]) {
                    temp = charStr2[k];
                    charStr2[k] = charStr2[k+1];
                    charStr2[k+1] = temp;
                }
            }
        }

        str2 = String.valueOf(charStr2);

        if (str1.equals(str2)) {
            System.out.println("Kedua string adalah anagram");
        } else {
            System.out.println("Kedua string bukan anagram");
        }

    }

}
