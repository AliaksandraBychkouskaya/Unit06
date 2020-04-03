package by.tr.mod6;
import java.util.Random;

public class Array02 {
    public static void main(String[] args) {
        int arr[][] = new int [6][7];
        Random rand = new Random ();
        for (int l = 0 ; l < arr.length; l++) {
            for (int n = 0; n < arr[l].length; n++){
                arr[l][n] = rand.nextInt(100);
            }
        }
        for (int j = 0; j < arr[0].length; j++){
            for (int i = 0; i <arr.length; i++){
                for (int k = 0; k < arr.length - i -1;k++){
                    if (arr[k][j] > arr[k+1][j]){
                        int t = arr[k][j];
                        arr[k][j] = arr[k + 1][j];
                        arr[k + 1][j] = t;
                    }
                }

            }
        }
        for (int l = 0 ; l < 5; l++) {
            for (int n = 0; n < 5; n++){
                System.out.print(arr[l][n] + " ");
            }
            System.out.println();
        }

    }
}
