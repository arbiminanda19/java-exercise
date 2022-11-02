public class capitalizedEachWord {
    public static void main(String[] args) {
        String text = "saYa aDalAH seOrang QA";
        char[] arrayText = text.toCharArray(); // arrayText = {'s', 'a', 'Y', 'a', ' ', 'a', 'D', ...};
        //check first char in text
        if (arrayText[0] >= 97) {
            arrayText[0] -= 32; // i = i - 32
        }
        //loop for check the other char
        int i = 1; // variabel sebagai increment
        while (i < text.length()) {
            // mengkapitalkan huruf setelah space
            if (arrayText[i] == ' '){
                if (arrayText[i+1] >= 97) {
                    arrayText[i+1] -= 32; // i = i - 32
                }
                i+=2;
            }
            // mengecilkan semua huruf
            else {
                if (arrayText[i] < 97) {
                    arrayText[i] += 32; // i = i + 32
                }
                i++;
            }
        }
        // print array
        for (char x : arrayText) {
            System.out.print(x);
        }
    }
}