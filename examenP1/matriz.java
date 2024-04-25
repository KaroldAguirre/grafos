public class matriz {
    public static void main(String[] args) {
        int matriz [][] = {{0,1,0,1}, {1,0,1,0}, {0,1,0,1}, {1,0,1,0}};
        int matrizA [][] = {{1,1,1,0}, {1,0,1,1}, {1,1,0,0}, {0,1,0,0}};
        int matrizB [][] = {{0,0,1,1}, {0,1,1,1}, {1,1,0,0}, {1,1,0,0}};
        int matrizC [][] = {{0,0,0,1}, {0,0,1,0}, {0,1,0,4}, {1,0,1,0}};

        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;

        while (i < 4) {
            for (int j = 0; j < 4; j++) {
                System.out.print("|" + matriz [i][j] + "| ");
            }  

            System.out.println();
            i++;
        }

        System.out.println();

        while (i2 < 4) {
            for (int j = 0; j < 4; j++) {
                System.out.print("|" + matrizA [i2][j] + "| ");
            }  

            System.out.println();
            i2++;
        }

        System.out.println();

        while (i3 < 4) {
            for (int j = 0; j < 4; j++) {
                System.out.print("|" + matrizB [i3][j] + "| ");
            }  

            System.out.println();
            i3++;
        }

        System.out.println();

        while (i4 < 4) {
            for (int j = 0; j < 4; j++) {
                System.out.print("|" + matrizC [i4][j] + "| ");
            }  

            System.out.println();
            i4++;
        }

    }
    
}