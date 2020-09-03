public class mltiDimensionArry {

    public static void main(String[] args) {
        // int[] kntl = { 12, 21, 22 };

        // System.out.println(kntl[2]);

        int[][] bgsd = { { 6, 66, 666 }, { 69, 96 }, { 1, 2, 3, 4 }, { 4, 3, 2, 1 } };
        // System.out.println(bgsd[0][2]);
        // System.out.println(bgsd[3][0]);

        // String[][] texts = new String[2][3];

        // texts[1][0] = "Hallo KNTL";
        // System.out.println(texts[1][0]);
        // texts[0][1] = "Hallo bgsd";
        // System.out.println(texts[0][1]);
        // texts[1][2] = "OI!!!";
        // System.out.println(texts[1][2]);

        for (int row = 0; row < bgsd.length; row++) {
            for (int col = 0; col < bgsd[row].length; col++) {

                System.out.print(bgsd[row][col] + "\t");
            }
            String[][] words = new String[2][3];

            // System.out.println(words[0]);
            // // words[0] = new String[2];
            // // words[0][1] "Hallo Bangsad";
            // // System.out.println(words[0][1]);

            words[0] = new String[3];
            words[0][1] = "Hallo Bgsd";
            System.out.println(words[0][1]);

        }
    }
}
