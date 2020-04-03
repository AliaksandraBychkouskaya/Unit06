package by.tr.mod6;

public class Array2 {
    public static void main(String[] args) {
        int n = 4;
        int arr[][] = new int [n][n];
        for (int i = 0; i < arr.length; i++)
            for (int j = 0; j <arr[i].length-i; j++){
                arr[i][j]=i+1;
            }
        for (int i = 0 ; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
