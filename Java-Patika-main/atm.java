import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        /*
            Atm Programı
            giriş için 3 hak

         */
        final String  USER_NAME = "test", PASSWORD = "1324";
        String userName, password;
        byte right = 3, secim, cekilenHak = 3;
        int balance = 1500, yatanTutar,cekilenTutar;
        Boolean isAgain = true;


        Scanner inp = new Scanner(System.in);


        do
        {
            //Take persenol information about account
            System.out.print("Kullanıcı ad girin :");
            userName = inp.nextLine();

            System.out.print("parola girin :");
            password = inp.nextLine();

            //control credentials
            if (!userName.equals(USER_NAME) || !password.equals(PASSWORD)) {
                right--;
                System.out.printf("Hatalı giriş \nKalan Hak :%d\n",right);

                //remaining right check
                if(right == 0){
                    System.out.println("Hakkınız bitti sistemden çıkış yapılıyor.");
                    return;
                }
            }
            else{
                break;
            }

        }
        while(right > 0);

        while(isAgain){
            //task selection
            System.out.print("1-)Para Yatırma\n2-)Para çekme\n3-)Bakiye Sorgulama\n4-)Çıkış\n");
            System.out.print("Yapılcak işlemin numarasını girin :");
            secim = inp.nextByte();

            switch (secim){
                case 1:
                    System.out.print("Tutar girin :");
                    yatanTutar = inp.nextInt();
                    balance +=yatanTutar;
                    System.out.printf("Güncel Bakiye Durumu: %d TL\n",balance);
                    System.out.println();
                    
                    break;

                case 2:
                    do {
                        System.out.print("Tutar girin 10 ve 10'un katları şeklinde:");
                        cekilenTutar = inp.nextInt();
                        //Balance Contrtol
                        if(cekilenTutar > balance)
                        {
                            System.out.print("Yetersiz Bakiye!\n");
                            System.out.print("Tekar Deneyin!\n");
                            cekilenHak--;
                            System.out.printf("Kalan Hak: %d\n",cekilenHak);
                        }
                        else
                            break;
                    }
                    while(cekilenHak > 0);
                    balance -= cekilenTutar;
                    System.out.printf("Güncel Bakiye Durumu: %d TL\n",balance);

                    System.out.println();
                    
                    break;

                case 3:
                    System.out.printf("Güncel Bakiye Durumu: %d TL\n",balance);
                    System.out.println();
                   
                    break;

                case 4:
                    System.out.println("Sistemden Çıkılıyor, İyi Günler");
                    isAgain = false;
                    break;
                default:

            }
        }


    }
}
