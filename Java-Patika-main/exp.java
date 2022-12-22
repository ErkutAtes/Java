import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        /*Java dilinde, taban ve üs değerleri kullanıcıdan alınan üs alma işlemini "Recursive" metot kullanarak yapan programı yazınız.*/

        Scanner inp = new Scanner(System.in);

        System.out.println("Taban değeri giriniz :");
        int number1 = inp.nextInt();

        System.out.println("Üs değeri giriniz :");
        int number2= inp.nextInt();


         int result = exp(number1, number2);
        System.out.printf("Sonuç : %d",result);

    }
    static int exp(int taban,int us){

        if(us == 0)
            return 1;

        return exp(taban,us-1) * taban;
    }
}
