import java.util.Scanner;
import java.util.Arrays;
public class Main {

        public static void main (String[]args) {

            Scanner inp = new Scanner(System.in);

            System.out.print("Dizi kaç elmanlı olacak :");
            int size = inp.nextInt();
            int[] arr = new int[size];
            int elementIndex = 0;

            //Asıl array boyutu kadar boş array
            int [] repeatArray = new int[size];

            for (int i = 0; i < arr.length; i++) {
                System.out.print((i + 1) + ".elemanı girin :");
                arr[i] = inp.nextInt();
            }

            Arrays.sort(arr);

            System.out.printf("Sıralama :");
            for (int i = 0; i < arr.length; i++){
                System.out.printf(" %d",arr[i]);
            }



        }
}
