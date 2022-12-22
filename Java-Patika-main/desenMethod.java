import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        /*Java dilinde "Recursive" metot kullanarak, kullanıcıdan alınan sayının "Asal" sayı olup olmadığını bulan programı yazın.*/

        Scanner inp = new Scanner(System.in);

        System.out.println("Sayı değeri giriniz :");
        int number1 = inp.nextInt();
        func(number1,number1,number1);




    }
    static int func(int realnumber,int otherNumber,int temp){

        if(otherNumber > 0) {
            System.out.println(temp + " ");
            otherNumber -= 5;
            temp = otherNumber;
            return func(realnumber,otherNumber,temp);

        }
        else if(temp <= realnumber) {
            System.out.println(temp + " ");
            temp += 5;
            return func(realnumber,otherNumber,temp);
        }
        else
            return 1;
}



}
