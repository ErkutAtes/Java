import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {

        Scanner inp = new Scanner(System.in);
        int number, elementCounter = 3, f0 = 0, f1 = 1, sum0, sum1, sum = 0;

        System.out.print("Sayı gir:");
        number = inp.nextInt();

        for (int i = number; i > 0; i--) {

            for (int j = number - i; j > 0; j--) {
                System.out.print(" ");
            }

            for (int l = 2*i-1; l > 0; l--) {
                System.out.print("*");
            }


            System.out.println();

        }



    }
}
