import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        int n,i,j,k,l,m,t;

        Scanner inp = new Scanner(System.in);
        System.out.print("Sayı gir: \n");
        n = inp.nextInt();

        for ( i = 0; i < n; i++) {
            for (j = 0; j < n - i; j++) {
                System.out.print(" ");
            }

            for (k = 0; k < 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }


        for ( int x = n-1 ; x > 0; x--)
        {
            for (l = 1; l <= n - x; l++) {
                System.out.print(" ");
            }

            for (m = 1; m <= 2 * x - 1; m++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
