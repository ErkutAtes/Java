import java.util.Scanner;
import java.util.Arrays;
public class Main {


    static Boolean isExist(int[] arr , int value) {
        for (int i = 0; i < arr.length; i++) {
                if (value == arr[i]){
                    return true;
                }
        }
        return false;
    }






        public static void main (String[]args) {

            Scanner inp = new Scanner(System.in);

            System.out.println("Dizi kaç elmanlı olacak :");
            int size = inp.nextInt();
            int[] arr = new int[size];
            int elementIndex = 0;

            //Asıl array boyutu kadar boş array
            int [] repeatArray = new int[size];

            for (int i = 0; i < arr.length; i++) {
                System.out.print((i + 1) + ".elemanı girin :");
                arr[i] = inp.nextInt();
            }

            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length; j++) {
                    if ((i != j) && (arr[i] == arr[j]) && (arr[i] % 2 == 0)) {
                        if (!isExist(repeatArray , arr[i])) {
                            repeatArray[elementIndex] = arr[i];
                            elementIndex++;
                        }
                    }

                }

            }

            System.out.println("Tekrar eden çift sayılar");
            for (int i : repeatArray){
                if (i == 0)
                    continue;
                System.out.println(i);
            }
        }
}

