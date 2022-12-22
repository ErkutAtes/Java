import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        int n, r, part2, nn = 1, rr = 1, nr = 1,total;
        Scanner inp = new Scanner(System.in);

       

        System.out.printf("n girin :");
        n = inp.nextInt();
        System.out.printf("r girin :");
        r = inp.nextInt();

        part2 = n-r;

        for(int i = 1; i<= n; i++)
        {
            nn = nn * i;

            if(i <= r)
            {
                rr = rr * i;
            }

            if(i <= n-r)
            {
                nr = nr *i;
            }
        }
        total = nn / (rr * nr);
        System.out.printf("sonuc :%d",total);

    }
}
