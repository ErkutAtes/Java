import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        /*
            ebob okek

         */
        Scanner inp = new Scanner(System.in);
        int number1, number2;

        System.out.print("1.sayı gir:");
        number1 = inp.nextInt();

        System.out.print("2.sayı gir:");
        number2 = inp.nextInt();

        //Ebob hesaplanması
        int i = 1;
        int ebob =0;
        //büyük sayıya kadar olan döngü
        while (i<=number1 || number2 <= i) {

            //bölüm kontrol
            if(number1 % i == 0 && number2 % i == 0 )
            {
                //ebob bulunması
                if (i > ebob) {
                    ebob = i;

                }
            }
            i++;
        }

        System.out.printf("Ebob :%d\n",ebob);
        System.out.printf("Ekok :%d\n",((number1 * number2)/ebob));
    }
}
