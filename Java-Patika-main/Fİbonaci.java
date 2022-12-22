import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
       
        Scanner inp = new Scanner(System.in);
        int number, elementCounter = 3, f0 = 0, f1 = 1, sum0, sum1, sum = 0;

        System.out.print("Sayı gir:");
        number = inp.nextInt();

        System.out.printf(f0 + 1 + ".dizi elemanı %d\n",f0);
        System.out.printf(f1 + 1 + ".dizi elemanı %d\n",f1);
        sum = f0 +f1;
        System.out.printf(f1 + 2 + ".dizi elemanı %d\n",sum);
        while (elementCounter < number) {
            elementCounter ++;
            f0 = f1;
            f1 = sum;
            sum = f0 + f1;
            System.out.printf(elementCounter + ".dizi elemanı %d\n",sum);


        }





    }
}
