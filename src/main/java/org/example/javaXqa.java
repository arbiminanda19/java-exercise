package org.example;

public class javaXqa {

    public static void main(String[] args) {

        int input = 15;
        String[] arr = new String[input];
        int i;
        String temp;
        for (i=1; i<=input; i++) {
            temp = "";
            if ((i % 3 == 0) && (i % 5 == 0)) {
                temp += "Java x QA";
            } else if ((i % 3 == 0) || (i % 5 == 0))  {
                if (i % 3 == 0) {
                    temp += "Java";
                }
                if (i % 5 == 0) {
                    temp += "QA";
                }
            }
            else {
                temp += i;
            }
            arr[i-1] = temp;
        }

        //cetak seluruh element array
        for (String x : arr) {
            System.out.print(x + ", ");
        }

    }

}
