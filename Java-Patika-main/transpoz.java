import java.util.Scanner;
import java.util.Arrays;
public class Main {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Dizinin Satır Sayısı Nedir :");
        int satır = input.nextInt();
        System.out.print("Dizinin Sütün Sayısı Nedir :");
        int sutun = input.nextInt();

        int[][] arr = new int[satır][sutun];

        //2 boyutlu dizi oluşturma
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print((i+1) + "x" + (j+1) + " elemanını girin :");
                arr[i][j] = input.nextInt();
            }
        }


        System.out.println("Orjinal Dizi");
        for (int [] row :arr){
            for (int element : row){
                System.out.print(element + " ");
            }
            System.out.println();
        }

        //Transpoz alma işlemi
        int [][] newArr = new int[sutun][satır];

        for (int i = 0; i < newArr.length; i++) {
            for (int j = 0; j < newArr[0].length; j++) {
                newArr[i][j] = arr[j][i];
            }
        }

        System.out.println("Transpoz Dizi");
        for (int [] row :newArr){
            for (int element : row){
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
