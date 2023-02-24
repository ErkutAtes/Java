import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class Organizer {
    private int numberOfTeams;
    private int MAX_MATCH_NUMBER;
    private ArrayList<String> namesOfTeams  = new ArrayList<>();
    private ArrayList<Integer> homeMatchCounter  = new ArrayList<>();
    private ArrayList<Integer> awayMatchCounter  = new ArrayList<>();



    public Organizer(int numberOfTeams) {
        this.numberOfTeams = numberOfTeams;
        inputTeamsName();
        this.MAX_MATCH_NUMBER = namesOfTeams.size() - 1;
    }


    private void inputTeamsName(){
        Scanner inp = new Scanner(System.in);
        for (int i = 0; i < numberOfTeams; i++){
            System.out.println((i+1) + ". Takım ismini girin :");
            String tempTeamName = inp.nextLine();
            namesOfTeams.add(tempTeamName);
            homeMatchCounter.add(0);
            awayMatchCounter.add(0);
        }
        //Controlling the size of teams
        if (numberOfTeams % 2 != 0){
            namesOfTeams.add("Bay");
            homeMatchCounter.add(0);
            awayMatchCounter.add(0);
        }
    }

     public void printTeamNameAndStats(){
        System.out.println("===========================================================================");
        System.out.println("                                Teams                                      ");
        for (int i =0; i < numberOfTeams; i++){
            System.out.println("Takım :" + namesOfTeams.get(i) + "    Evde Maç Sayısı :" + homeMatchCounter.get(i) + "    Dışarıda Maç Sayısı :" + awayMatchCounter.get(i));
        }
        System.out.println("===========================================================================");
    }


    public void createOrg(){
        ArrayList<String> copyTeamNames = new ArrayList<>();
        ArrayList<String> homeTeams  = new ArrayList<>();
        ArrayList<String> awayTeams = new ArrayList<>();

        copyTeamNames = (ArrayList)namesOfTeams.clone();

        Random rnd  = new Random();

        for(int numberOfWeek = 0; numberOfWeek < (namesOfTeams.size() - 1) * 2; numberOfWeek++){
            System.out.println((numberOfWeek + 1) + ". Hafta Fikstür");

            for (int k = 0; k < namesOfTeams.size() / 2 ; k++){
                boolean isValidPickForHome = false;
                boolean isValidPickForAway = false;
                do{
                    int randomTeamNameIndex = rnd.nextInt(numberOfTeams);
                    if (copyTeamNames.get(randomTeamNameIndex) != null && homeMatchCounter.get(randomTeamNameIndex) != MAX_MATCH_NUMBER){
                        isValidPickForHome = true;
                        homeTeams.add(copyTeamNames.get(randomTeamNameIndex));
                        homeMatchCounter.set(randomTeamNameIndex,homeMatchCounter.get(randomTeamNameIndex) + 1);
                        copyTeamNames.set(randomTeamNameIndex , null);
                    }
                }while(!isValidPickForHome);

                do{
                    int randomTeamNameIndex = rnd.nextInt(numberOfTeams);
                    if (copyTeamNames.get(randomTeamNameIndex) != null && awayMatchCounter.get(randomTeamNameIndex) != MAX_MATCH_NUMBER){
                    isValidPickForAway = true;
                    awayTeams.add(copyTeamNames.get(randomTeamNameIndex));
                    awayMatchCounter.set(randomTeamNameIndex,awayMatchCounter.get(randomTeamNameIndex) + 1);
                    copyTeamNames.set(randomTeamNameIndex , null);
                    }
                }while(!isValidPickForAway);
            }
            System.out.println("================================================");
            for (int  i =0; i < homeTeams.size(); i++){
                System.out.println(homeTeams.get(i) + " vs " + awayTeams.get(i));
            }
            System.out.println("================================================");
            homeTeams.clear();
            awayTeams.clear();
            copyTeamNames =(ArrayList)namesOfTeams.clone();
        }
    }











}


