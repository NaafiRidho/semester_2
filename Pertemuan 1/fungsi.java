public class fungsi {
    public static void main(String[] args) {
        int[][] royalGarden = {
                { 10, 5, 15, 7 },
                { 6, 11, 9, 12 },
                { 2, 10, 10, 5 },
                { 5, 7, 12, 9 }
        };
        int[] totalPendapatan = new int[4];
        pendapatan(royalGarden, totalPendapatan);
        System.out.println("==========================");
        System.out.println("Stock Pada Royal Garden 4:");
        System.out.println("==========================");
        stock(royalGarden); 
    }

    static void pendapatan(int[][] stok, int[] pendapatan) {
        int aglonema = 75000;
        int keladi = 50000;
        int alocasia = 60000;
        int mawar = 10000;
        for (int i = 0; i < stok.length; i++) {
            pendapatan[i] = aglonema * stok[i][0] + keladi * stok[i][1] + alocasia * stok[i][2]
                    + mawar * stok[i][3];
        }
        for (int i = 0; i < stok.length; i++) {
            System.out.println("Pendapatan Royal Garden " + (i + 1) + " " + pendapatan[i]);
        }

    }

    static void stock(int[][] stock) {
        int pengurangan[] = { 1, 2, 0, 5 };
        for (int i = 3; i < stock.length; i++) {
            for (int j = 0; j < stock[i].length; j++) {
                stock[i][j] = stock[i][j] - pengurangan[j];
                System.out.println(stock[i][j]);
            }
        }
    }
}
