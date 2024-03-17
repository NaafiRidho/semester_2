public class soalAL {
    public static void main(String[] args) {

        int[][] rating = {
                { 4, 3, 4, 4 },
                { 1, 1, 2, 3 },
                { 1, 2, 3, 4 }
        };

        double[] rata = hitungRata(rating);

        System.out.println("Rata-rata penonton per film:");
        for (int i = 0; i < rata.length; i++) {
            System.out.println("Film " + i + ": " + rata[i]);

        }

        maxMin(rata);
    }

    public static double[] hitungRata(int[][] rating) {

        double[] rata2 = new double[rating[0].length];

        for (int i = 0; i < rata2.length; i++) {
            int total = 0;
            for (int j = 0; j < rating.length; j++) {
                total += rating[j][i];
                rata2[i] = (double) total / rating.length;
            }
        }

        return rata2;
    }

    public static void maxMin(double[] rata) {
        double max = 0, min = 10;
        int tertinggi = 0, terendah = 0;

        for (int i = 0; i < rata.length; i++) {
            if (max < rata[i]) {
                max = rata[i];
                tertinggi = i;
            }
            else if (min > rata[i]) {
                min = rata[i];
                terendah = i;
            }
        }

        System.out.println("tertinggi " + max + " film ke-" + tertinggi);
        System.out.println("terendah " + min + " film ke-" + terendah);
    }
}