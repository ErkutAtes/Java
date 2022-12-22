import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
public class Main {

    public static void main(String[] args) {

        String word;

        Scanner inp = new Scanner(System.in);

        System.out.print("Kelime girin :");
        word = inp.nextLine();

        //bir tane char array oluşturup içine string atyoruz
        char [] chArr = new char[word.length()];
        chArr = word.toCharArray();

        //bir tane char array oluştuup stringin tersini içine alıoruz.
        char [] reversedCh = new char[word.length()];
        for (int i = 0; i < word.length(); i++){
            reversedCh[i] = chArr[word.length()-1-i];
        }

        //yeni tersten yazılan string oluşturma
        String reversedWord = new String(reversedCh);
        System.out.println(reversedWord);

        //eski ve yeni strin karşılaştırma yapılıyor.
        if (word.equals(reversedWord)){
            System.out.println("Palindromik Kelime'dir");
        }else{
            System.out.println("Palindromik Kelime değildir.");
        }
    }
}
