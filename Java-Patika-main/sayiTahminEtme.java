import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
public class Main {

    public static void main(String[] args) {
        int randomNumber,tahmin;
        byte right = 5 , tahminNumarasi = 0;
        int [] wrongAnswers = new int [right];

        System.out.println("***********Merhaba*******************");
        System.out.println("Sayı tahmin etme oyununa hoş geldinz.");
        System.out.println("Yapmanız gereken 0-99 (sınırlar dahil) sayı tahmin etmenmiz");

        Scanner inp = new Scanner(System.in);


        //random obje oluşturma
        Random r = new Random();

        //Rastgele sayı oluşturma 0-99 arasında aralıklar dahil.
        randomNumber = r.nextInt(100);
        System.out.println(randomNumber);

        //Kullanıcıdan sayı alma
        while(right > 0){

            do {
                System.out.print((tahminNumarasi + 1) + ". tahminiinz nedir :");
                tahmin = inp.nextInt();
                if(tahmin < 0 || tahmin > 99){
                    System.out.println("Geçersiz Sayı Girdiniz.Tekrar deneyin.");
                }
            } while (tahmin < 0 || tahmin > 99);

            if(tahmin != randomNumber){
                System.out.println("Tahmin yanlış");
                wrongAnswers[tahminNumarasi] = tahmin;

                //kullacıya alt üst ipucu verme
                if (tahmin > randomNumber){
                   System.out.println("Aşağılara gitmlisin!!!!!");
                }else if (tahmin < randomNumber){
                    System.out.println("Yukarı çıkmalısın!!!!!");
                }
                
                right--;
                tahminNumarasi++;


            }
            else if(tahmin == randomNumber){
                System.out.println("*************Tebrikler Doğru Tahmin*************");
                System.out.printf("Tahmin :%d\nAsıl Sayı :%d",tahmin,randomNumber);
                return;
            }
        }
        System.out.println("**************GAME OVER***************");
        System.out.println("Tahmin hakalarınız Tükendi.");
        System.out.printf("Sayı :%d\n",randomNumber);
        System.out.println("Yaptığınız tahminler");
        for(int i : wrongAnswers){
            System.out.println(i);
        }
    }
}
