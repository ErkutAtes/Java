import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        int n;
        double sonuc = 0;

        Scanner inp = new Scanner(System.in);

        System.out.printf(" Sayı :");
        n = inp.nextInt();

        for (double i=1; i <= n; i++)
        {

        sonuc = sonuc + (1 / i);

        }
        System.out.printf("sonuc :%f",sonuc);
    }
}
