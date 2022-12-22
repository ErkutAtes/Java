import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        //GEÇME NOTU AYARLANMASI
        final int PASSING_GRADE = 55;
        double ortalama;
        int turkce , mat , fizik , kimya , muzik , dersSayıcı = 0;

        Scanner input = new Scanner(System.in);

        //Türkçe ders notu alınması
        System.out.print("Türkçe Ders Notu Girin :");
        turkce = input.nextInt();
        if(turkce >= 0 && turkce <= 100)
            dersSayıcı = dersSayıcı + 1  ;

        //Mat ders notu alınması
        System.out.print("Matematik Ders Notu Girin :");
        mat =  input.nextInt();
        if(mat >= 0 && mat <= 100)
            dersSayıcı = dersSayıcı + 1  ;

        //Fizik ders notu alınması
        System.out.print("Fizik Ders Notu Girin :");
        fizik = input.nextInt();
        if(fizik >= 0 && fizik <= 100)
            dersSayıcı = dersSayıcı + 1  ;

        //Kimya ders notu alınması
        System.out.print("Kimya Ders Notu Girin :");
        kimya = input.nextInt();
        if(kimya >= 0 && kimya <= 100)
            dersSayıcı = dersSayıcı + 1  ;

        //Müzik ders notu alınması
        System.out.print("Müzik Ders Notu Girin :");
        muzik = input.nextInt();
        if(muzik >= 0 && muzik <= 100)
            dersSayıcı = dersSayıcı + 1  ;

        //ortalama hesaplama
        ortalama = (turkce + mat + fizik + kimya + muzik) / dersSayıcı;

        if(ortalama >= PASSING_GRADE)
        {
            System.out.printf("Sınıfı geçtiniz ortalama =%f",ortalama);
        }
        else
        {
            System.out.printf("Sınıfta kaldınız ortalama =%f",ortalama);
        }
    }
}
