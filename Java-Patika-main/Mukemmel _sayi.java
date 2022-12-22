import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        /*
           Java ile klavyeden girilen N tane sayma sayısından en büyük ve en küçük sayıları bulan ve bu sayıları ekrana yazan programı yazın.

         */
        Scanner inp = new Scanner(System.in);
        int number, sum = 0;

        System.out.print("Sayı gir:");
        number = inp.nextInt();


        for (int i = 1; i < number; i++) {
            if(number % i == 0)
                sum += i;
        }

        if (sum == number) {
            System.out.printf(number + " Mükemmel sayıdır");
        }
        else if (sum != number) {
            System.out.printf(number + " Mükemmel sayı değildir!");
        }


    }
}
