import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        int number, sum = 0, result, elementCounter = 0;
        Scanner inp = new Scanner(System.in);

        /*
            Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan
            3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan programı yazınız.
         */
        System.out.println("Lütfen sayı girin : ");
        number = inp.nextInt();
        for (int i = 0; i <= number; i++)
        {
            if(i % 3 == 0)
            {
                sum = sum + i;
                elementCounter += 1;
            }
            else if(i % 4 == 0)
            {
                sum = sum + i;
                elementCounter += 1;
            }
        }
        result = sum / elementCounter;
        System.out.printf("sonuc :%d",result);


    }
}
