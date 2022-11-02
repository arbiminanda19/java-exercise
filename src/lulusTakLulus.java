public class lulusTakLulus {
    public static void main(String[] args) {
        char[] nilai = {'A','C','D','B','A','E','B','D','D','A'};
        int countLulus = 0, countTidakLulus = 0;
        for (char i: nilai) {
            if ((i == 'A') || (i == 'B') || (i == 'C')) {
                countLulus++;
            } else {
                countTidakLulus++;
            }
        }
        System.out.println("Lulus: " + countLulus);
        System.out.println("Tidak Lulus: " + countTidakLulus);
    }
}