import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        //Test 1
        // Even team size and printing teams names
        //Organizer org = new Organizer(8);
        //org.printTeamName();


        //Test 2
        // Odd team size and printing teams names
        //Organizer org = new Organizer(7);
        //org.printTeamName();

        //Test 3
        //Print Control Teams
        //Organizer org = new Organizer(8);
        //org.printTeamNameAndStats();

        //Test 4
        Organizer org = new Organizer(6);
        org.createOrg();
        org.printTeamNameAndStats();




    }
}