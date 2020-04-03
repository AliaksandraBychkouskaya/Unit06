package by.tr.mod6;

public class Array3 {
    public static void main(String[] args) {
        int n = 8;
        int arr[][] = new int [n][n];
        for (int i = 0; i < arr.length/2; i++)
            for (int j = i; j <arr[i].length-i; j++){
                arr[i][j]=1;
            }
        for (int i = arr.length/2; i < arr.length; i++)// i от 4 до 7
            for (int j = arr.length -i-1; j < i+1; j++){//3,4// 4,5
                arr[i][j]=1;
            }
        for (int i = 0 ; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
