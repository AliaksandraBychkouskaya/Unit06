package by.tr.mod6;

import java.util.Random;

public class Array1 {
    public static void main(String[] args) {
        int n = 4;
        int arr[][] = new int [n][n];
        for (int i = 0 ; i < arr.length; i++){
            arr[i][0] = 1;
            arr[i][n-1] = 1;
        }
        for (int j = 0 ; j < arr.length; j++){
            arr[0][j] = 1;
            arr[n-1][j] = 1;
        }
        for (int i = 0 ; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
