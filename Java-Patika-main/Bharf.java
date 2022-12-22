import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        String [][] arr = new String[7][4];

        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j <arr[i].length;j++){
                if((i==1 && j==1) || (i==1 && j==2) || (i==2 && j==1) || (i==2 && j==2) || (i==4 && j==1) || (i==4 && j==2) ||(i==5 && j==1)||(i==5 && j==2))
                    arr[i][j] =" ";
                else
                    arr[i][j]="*";

            }
        }

        for (String [] i:arr){
            for (String element : i){
                System.out.print(element);
            }
            System.out.println();
        }





        }
    }
