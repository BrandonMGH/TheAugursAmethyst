package augursamethyst.com;
import augursamethyst.com.classes.Thief;

import java.util.Scanner;
import java.util.Map;
import java.util.TreeMap;

public class GameInterface {
    public static void main(String[] arg){
            System.out.println("Welcome. Please type 'Game Start' to initiate new gaming session");
            System.out.println("Type 'End Game' at any point to end the gaming session");
            Scanner sc = new Scanner(System.in);
            String gameStartInput = sc.nextLine().toUpperCase();
            String characterNameInput;
            String characterClass;

            System.out.println(gameStartInput);

            if (gameStartInput.equals("GAME START")) {
                System.out.println("Would you like to know more information about the character classes before creating a character, YES or NO?");
                String classInfoInput = sc.nextLine().toUpperCase();
                if(classInfoInput.equals("YES")) {

                } else if (classInfoInput.equals("NO")) {

                } else
                System.out.println("Please create a character");
                System.out.println("Type 'Class Info' for more information about available classes");
                characterNameInput = sc.nextLine().toUpperCase();
                characterClass = sc.nextLine().toUpperCase();
            } else if(gameStartInput.equals("END GAME"))  {
                System.out.println("Game Session Terminated.  Thank you for playing");

            } else {
                System.out.println("Could not recognize response, please try again");
            }
    }


    public static void characterCreation(){

    }

    public static String classInformation(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please select a class you would like to know more information about");

        Thief ThiefClassInfo = new Thief();
        Map Brawler = new TreeMap();
        Map Deacon = new TreeMap();
        Map Thief = new TreeMap();
        Map UnderStudy = new TreeMap();

        return "Placeholder string";
    }

    public void checkHealth(int hitPoints){
        if(hitPoints > 0){
            System.out.println("Your current hit point count is " + hitPoints);
        } else {
            System.out.print("Your hit points are at 0.  Game Over");
        }
    }

    public void gameOver(){

    }
}
