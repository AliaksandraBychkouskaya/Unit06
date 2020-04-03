package by.tr.mod6;
import java.util.Random;
public class Array01 {
    public static void main(String[] args) {
        int [][] mas = new int [5][5];
        int a = 1,b = 2;

        for (int i = 0 ; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if ((i == 0) && (j == 0)) {
                    mas[i][j] = a;
                }
                else {
                    if ((i == 0) && (j == 1)) {
                        mas[i][j] = b;
                    }
                    else {
                        mas[i][j] = a + b;
                        a = b;
                        b = mas[i][j];
                    }
                }

            }
        }
            for (int l = 0 ; l < 5; l++) {
                for (int n = 0; n < 5; n++){
                    System.out.print(mas[l][n] + " ");
                }
                System.out.println();
            }

           /* for (int [] k : mas)
                for (int m: k)
                    System.out.print(m+ " ");
            System.out.println();*/
        }

    }


