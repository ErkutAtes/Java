import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
    /*
    *Dizideki sayıların harmonik ortalamasını hesaplayan programı yazınız.

    *Harmonik Ortalama formülü : n (eleman sayısı) / elemanların harmonik serisi
    */
        int [] arr = new int[]{1,22,34,999,8,5,4,7,5,9,6};
        double sum = 1;
        
        for (double i : arr){
            sum = sum + (1 / i);
        }
        System.out.printf("Harmonik  Ortalması : %f",(double)arr.length / sum);


        }
    }
