import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        /*
        Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
        Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
        Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
        Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.
         */

        //değişen tanımlama
        int heat;

        //Scenner oluşturulması
        Scanner inp = new Scanner(System.in);

        //sıcaklık bilgisi alınması
        System.out.print("Sıcaklık nedir :");
        heat = inp.nextInt();

        //sıcaklık biilgisine göre karar verilmesi
        if (heat < 5)
        {
            System.out.println("Kayak yapabilirsiniz.");
        } else if (heat >= 25)
        {
            System.out.println("Yüzebilirsiniz.");
        }
        else
        {
            if(heat > 5 && heat < 15)
                System.out.println("Sinema");
            else if (heat > 15 && heat < 25)
                System.out.println("piknik");
        }
    }
}
