import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        int number, sum = 0, result, elementCounter = 0;
        Scanner inp = new Scanner(System.in);

        /*
         Java döngüler ile tek bir sayı girilene kadar
         kullanıcıdan girişleri kabul eden ve girilen değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.
         */
        do
        {
            System.out.println("Lütfen sayı girin : ");
            number = inp.nextInt();
            if(number % 4 == 0)
            {
                sum = sum + number ;
            }
        }
        while(number % 2 == 0);


        System.out.printf("sonuc :%d",sum);


    }
}
