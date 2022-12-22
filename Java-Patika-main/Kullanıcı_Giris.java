import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        /*
        Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sorun,
        eğer kullanıcı sıfırlamak isterse yeni girdiği şifrenin hatalı girdiği ve unuttuğu şifre ile aynı olmaması gerektiğini kontrol edip,
        şifreler aynı ise ekrana "Şifre oluşturulamadı,
        lütfen başka şifre giriniz." sorun yoksa "Şifre oluşturuldu" yazan programı yazınız.
         */
        //kullanıcı bilgileri
        String userName = "test1", password = "1234";

        String inpUserName, inpPassword, changeDesicion;
        //şifre değiştirmek istenip istenmediğini belirliyen gösterge
        Boolean isChange = false;


        Scanner input =new Scanner(System.in);


        //kullanıcı adı alınması
        System.out.println("Lütfen kullanıcı adını girin :");
        inpUserName= input.nextLine();


        //password bilgisi alınması
        System.out.println("Lütfen şifre girin girin :");
        inpPassword = input.nextLine();

        //sisteme giriş için bilgilerin karşılaştırılması
        if(userName.equals(inpUserName) && password.equals(inpPassword))
        {
            System.out.println("Giriş bilgileriniz doğru sisteme başarıyla giriş yaptınız");
        }
        else if(userName.equals(inpUserName) && !password.equals(inpPassword))
        {
            System.out.println("şifre bilginiz yanlış");
            System.out.println("şifre bilginizi değiştitmek ister misiniz ? (y/n) ");
            changeDesicion = input.nextLine();

            if(changeDesicion.equals("y"))
            {
                isChange = true;
            }
            else
            {
                isChange = false;
            }
        }

        if(isChange)
        {
          System.out.println("Yeni şifreniz eski şifreniz ile aynı olamaz");
            System.out.println("Lütfen yeni şifre girin girin :");
            inpPassword = input.nextLine();
            if(password.equals(inpPassword))
            {
                System.out.println("şifre oluşturulamadı");
            }
            else
            {
                password = inpPassword;
                System.out.println("Şifre oluşturuldu");
            }
        }


    }
}
