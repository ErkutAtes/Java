import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner inp = new Scanner(System.in);

        int yıl,reminder;
        System.out.printf("Yıl Girin :");
        yıl = inp.nextInt();

        if(yıl % 100 == 0)
        {
            if(yıl % 400 == 0)
            {
                System.out.printf("%d Artık yıl",yıl);
            }
            else
            {
                System.out.printf("%d Artık yıl  değil",yıl);
            }
        }
        else
        {
            if(yıl % 4 ==0)
            {
                System.out.printf("%d Artık yıl",yıl);
            }
            else
            {
                System.out.printf("%d Artık yıl değil",yıl);
            }
        }
    }
}
