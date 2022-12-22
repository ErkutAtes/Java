import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
    /*
    *Dizideki sayıların harmonik ortalamasını hesaplayan programı yazınız.

    *Harmonik Ortalama formülü : n (eleman sayısı) / elemanların harmonik serisi
    */
        Scanner inp = new Scanner(System.in);
        System.out.println("Dizi kaç elmanlı olacak :");
        int size = inp.nextInt();
        int [] arr = new int[size];

        for (int i = 0 ; i < arr.length; i++){
            System.out.print((i+1) + ".elemanı girin :");
            arr[i] = inp.nextInt();
        }

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.printf("En küçük elemana yakın olan sayı :%d\n",arr[1]);
        System.out.printf("En büyük elemana yakın olan sayı :%d\n",arr[size-2]);

        }
    }
