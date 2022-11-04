public class alternativeCapitalizedEachWord {

    // Source: https://www.programiz.com/java-programming/examples/capitalize-first-character-of-string
    // Note: code dari website ini hanya untuk input string dengan huruf kecil semua,
    // perlu tambah di bagian else untuk bisa terima input campuran huruf kecil dan kapital
    public static void main(String[] args) {

        // create a string
        String message = "saYa aDalAH seOrang QA";

        // stores each characters to a char array
        char[] charArray = message.toCharArray();
        boolean foundSpace = true; // untuk periksa ada spasi atau tidak, periksa huruf pertama

        for(int i = 0; i < charArray.length; i++) {

            // if the array element is a letter
            if(Character.isLetter(charArray[i])) { // spasi tidak masuk isLetter

                // check space is present before the letter
                // if jika huruf sebelum nya adalah spasi -> foundspace == true
                // huruf pertama setiap kata atau bukan
                if(foundSpace) {

                    // change the letter into uppercase
                    charArray[i] = Character.toUpperCase(charArray[i]);
                    foundSpace = false;

                }
                // tambahan biar bisa terima input huruf campuran kecil dan kapital
                // selain huruf pertama setiap kata masuk ke sini karena foundspace == false
                else {
                    charArray[i] = Character.toLowerCase(charArray[i]);
                }
            }

            else { // kalau detek spasi
                // if the new character is not character
                foundSpace = true;
            }
        }

        // convert the char array to the string
        message = String.valueOf(charArray);
        System.out.println("Message: " + message);

    }
}