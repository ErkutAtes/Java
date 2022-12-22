import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        /*
            4000 bin yıldır kullanılan bir astroloji çeşididir Çin astrolojisi ve insanları 12 değişik burç ve sembollerle tanımlar.
            Çin Zodyağı bu 12 burcun eşit aralıklarla(10 derece genişliğinde) sıralandığı bir hayvan halkasıdır ve yıldızlarla pek bir ilgisi yoktur.
            Çin Zodyağı nasıl hesaplanır?
            Çin zodyağı hesaplanırken kişinin doğum yılının 12 ile bölümünde kalana göre bulunur.
            Doğum Tarihi %12 = 0 ➜ Maymun
            Doğum Tarihi %12 = 1 ➜ Horoz
            Doğum Tarihi %12 = 2 ➜ Köpek
            Doğum Tarihi %12 = 3 ➜ Domuz
            Doğum Tarihi %12 = 4 ➜ Fare
            Doğum Tarihi %12 = 5 ➜ Öküz
            Doğum Tarihi %12 = 6 ➜ Kaplan
            Doğum Tarihi %12 = 7 ➜ Tavşan
            Doğum Tarihi %12 = 8 ➜ Ejderha
            Doğum Tarihi %12 = 9 ➜ Yılan
            Doğum Tarihi %12 = 10 ➜ At
            Doğum Tarihi %12 = 11 ➜ Koyun
        */

        Scanner input = new Scanner(System.in);
        int dugumYıl, reminder;
        System.out.printf("doğum yılı girin :");
        dugumYıl = input.nextInt();

        reminder = dugumYıl % 12;

        switch (reminder)
        {
            case 0:
                System.out.printf("Maymun");
                break;

            case 1:
                System.out.printf("Horoz");
                break;

            case 2:
                System.out.printf("Köpek");
                break;

            case 3:
                System.out.printf("Domuz");
                break;

            case 4:
                System.out.printf("fare");
                break;

            case 5:
                System.out.printf("Öküz");
                break;

            case 6:
                System.out.printf("Kaplan");
                break;

            case 7:
                System.out.printf("Tavşan");
                break;

            case 8:
                System.out.printf("Ejderha");
                break;

            case 9:
                System.out.printf("Yılan");
                break;

            case 10:
                System.out.printf("At");
                break;

            case 11:
                System.out.printf("Koyun");
                break;
        }



    }
}
