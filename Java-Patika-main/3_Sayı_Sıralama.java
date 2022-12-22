import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        /*Girilen 3 sayıyı "küçükten büyüğe" sıralayan programı yazınız.*/

        int sayı1 , sayı2 , sayı3 , ssayı1 , ssayı2 , ssayı3;

        Scanner inp= new Scanner(System.in);


        System.out.println("1.Sayı girin : ");
        sayı1 = inp.nextInt();

        System.out.println("2.Sayı girin : ");
        sayı2 = inp.nextInt();
        if(sayı1 < sayı2)
        {
            ssayı1 = sayı1;
            ssayı2=sayı2;
        }

        System.out.println("3.Sayı girin : ");
        sayı3 = inp.nextInt();
        if(sayı3 < sayı1)
        {
            ssayı1 = sayı3;
            ssayı2 = sayı1;
            ssayı3=sayı2;
        }
        else if(sayı3 > sayı1 && sayı3 < sayı2)
        {
            ssayı1 = sayı1;
            ssayı2 =sayı3;
            ssayı3 = sayı2;
        }
        else
        {
            ssayı1 = sayı1;
            ssayı2 = sayı2;
            ssayı3 = sayı3;
        }

        System.out.printf("sayılar : %d %d %d\n", sayı1, sayı2, sayı3);
        System.out.printf("sıralanmış sayılar : %d %d %d", ssayı1, ssayı2, ssayı3);

    }
}
