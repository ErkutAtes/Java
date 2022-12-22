import java.util.Scanner;


public class Main {
    public static void main(String[] args)
    {

        //Switch-case yapısı ile hesap makinesi yapımı

        //1.sayı alıınacak
        //2.sayı alıınacak
        //operatör alınacak
        //işlem yapılıp ekrana yazdıralacak




        //değişken oluşturulması
        int sayı1,sayı2,operator;


        //scanner oluşturma
        Scanner inp =new Scanner(System.in);

        //Bilgilerin alınması
        System.out.print("1. sayı giriniz :");
        sayı1 = inp.nextInt();

        System.out.print("2. sayı giriniz :");
        sayı2 = inp.nextInt();

        System.out.print("1-)Toplama\n2-)Çıkarma\n3-)Bölme\n4-)Çarpma\nYapılmak istenen işlem seçimiz (sayısını girin :): ");
        operator = inp.nextInt();

        switch(operator){

            case 1:
                System.out.println("Sonuç : " + (sayı1 + sayı2));
                break;

            case 2:
                System.out.println("Sonuç : " + (sayı1 - sayı2));
                break;

            case 3:
                if(sayı2 != 0)
                {
                    System.out.println("Sonuç : " + (sayı1 / sayı2));
                    break;
                }
                else
                {
                    System.out.println("Herhangi bir sayı 0 ile bölümemez");
                    break;
                }

            case 4:
                System.out.println("Sonuç : " + (sayı1 * sayı2));
                break;


            default:
                System.out.println("İşlem titpi yanlış seçildi.");

        }


    }
}
