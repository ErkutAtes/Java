import java.util.Scanner;
import java.util.Arrays;
public class Main {

    static int[] createIntArray(){
        Scanner input = new Scanner(System.in);
        System.out.print("Dizinin boyutu nedir :");
        int size = input.nextInt();
        int [] arr =new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print((i + 1) + ".elemanı girin :");
            arr[i] = input.nextInt();
        }
        return arr;
    }

    static void printRepeatNumbers(int [] arr) {

        //diziyi sırlama
        Arrays.sort(arr);
        int [] temp = new int[arr.length];

        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr.length; j++){
                if (arr[i] == arr[j]){
                    temp[i]++;

                }
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(temp));
        }

        public static void main (String[]args) {

          int [] myArr = createIntArray() ;
          printRepeatNumbers(myArr);

        }
}
