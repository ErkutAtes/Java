import java.util.Scanner;

import static java.lang.Integer.MAX_VALUE;

public class Main {
    public static void main(String[] args)
    {
        int sayı1;

        Scanner inp = new Scanner(System.in);

        System.out.println("Lütfen sayı girin: ");
        sayı1 = inp.nextInt();

       System.out.println(isPalindrom(sayı1));


    }

    static Boolean  isPalindrom(int number)
    {
        int oldNumber =number,remain, newNumber = 0;

        while (oldNumber > 0){

            remain = oldNumber % 10;
            oldNumber= oldNumber / 10;
            newNumber = newNumber*10 + remain ;

        }

        if(number == newNumber)
            return true;
        else
            return false;

    }
}
