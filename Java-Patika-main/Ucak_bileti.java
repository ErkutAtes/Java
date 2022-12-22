
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {

        /*
        ++ ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın.
       ++ Kullanıcıdan Mesafe (KM), yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın.

       ++ Mesafe başına ücret 0,10 TL / km olarak alın. İlk olarak uçuşun toplam fiyatını hesaplayın
       ++ ve sonrasında ki koşullara göre müşteriye aşağıdaki indirimleri uygulayın ;
        ++Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır.

        ++Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.

       ++ Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
        ++Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
        Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
        Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.
         */
        int mesafe,tip,yas;
        double ücret;
        Scanner inp = new Scanner(System.in);

        //dataları alınması ve kontrol edilmesi
        System.out.printf("Lütfen mesafe bilgisini girin (KM) cinsinden ve tam sayı olarak girin :");
        mesafe =  inp.nextInt();
        if(!(mesafe > 0)){
            System.out.printf("Hatalı measafe bilgisi");
            return ;
        }

        System.out.printf("Lütfen yas bilgisini girin  :");
        yas =  inp.nextInt();
        if(!(yas > 0)){
            System.out.printf("Hatalı yas bilgisi");
            return ;
        }

        System.out.printf("Lütfen yolculuk tipini girin\n1.Tip :Tek yön\n2.Tip :Gidiş-Dönüş\n1 ve 2 tuşlatın :");
        tip =  inp.nextInt();
        if(!(tip ==1 || tip ==2)){
            System.out.printf("Hatalı tip bilgisi");
            return ;
        }
        //ücret hesaplanması

        ücret = mesafe * 0.10;

        if(yas < 12)
        {
            ücret =ücret / 2;
        }
        else if(yas >=12 && yas <= 24)
        {
            ücret = ücret - ((ücret * 10) / 100);
        }
        else if(yas >=65)
        {
            ücret = ücret - ((ücret * 30) / 100);
        }

        if(tip == 2)
        {
            ücret = ücret - (((ücret * 20) / 100));
        }

        System.out.printf("ücret %.2f",ücret);

    }
}
