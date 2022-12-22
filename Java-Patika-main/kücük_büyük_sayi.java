import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        /*
           Java ile klavyeden girilen N tane sayma sayısından en büyük ve en küçük sayıları bulan ve bu sayıları ekrana yazan programı yazın.

         */
        Scanner inp = new Scanner(System.in);
        int number1,number2, max = 0, min = 0;

        System.out.print("1.sayı gir:");
        number1 = inp.nextInt();

        for (int i = 0; i < number1; i++) {

            System.out.printf((i+1)+".sayı gir:");
            number2 = inp.nextInt();

            if (number2 > max)
                max = number2;

            if (number2 < min)
                min = number2;
        }
        System.out.printf("En Büyük sayı :%d\n",max);
        System.out.printf("En Küçük sayı :%d\n",min);
    }
}
