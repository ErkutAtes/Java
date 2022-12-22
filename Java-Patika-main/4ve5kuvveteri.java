import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        int number, total4 = 1, total5 = 1 ;
        Scanner inp = new Scanner(System.in);

        /*
            Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz.
         */
        System.out.printf("sayı gir :");
        number  = inp .nextInt();
        for(int i = 1; i<=number; i++)
        {
            total4 = total4 * 4;
            total5 = total5 * 5;
            System.out.printf("4 ün kuvvetleri :%d\n",total4);
            System.out.printf("5 ün kuvvetleri :%d\n",total5);
        }
       
    }
}
