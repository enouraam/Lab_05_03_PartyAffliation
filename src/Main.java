import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String partyAffiliation = "";

        System.out.print("Enter the first letter of your party affiliation (Republican," +
                "Independent,Democrat, or Other): ");

        if (in.hasNext("[a-zA-Z]+")){

            partyAffiliation = in.next().toUpperCase();

            switch (partyAffiliation) {
                case "R":
                    System.out.println("Your a republican elephant");
                    break;
                case "D":
                    System.out.println("Your a democrat donkey");
                    break;
                case "I":
                    System.out.println("Your an independent person");
                    break;
                default:
                    System.out.println("You chose other");
                    break;
            }

        }else{
            System.out.print("Please put in a valid input");
        }


    }
}