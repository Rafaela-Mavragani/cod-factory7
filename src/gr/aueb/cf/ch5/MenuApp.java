package gr.aueb.cf.ch5;

import java.util.Scanner;

public class MenuApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice;
        do {
            printMenu();
            choice = in.nextInt();
            if (!isCoiceValid(choice)){
                System.out.println("Error.Choice not valid");
                continue;
            }
            doOnChoice(choice);

            //
        }while (choice!=5);
    }
    public static void printMenu(){
        System.out.println("επιλεξτε ενα απο τα παρακατω");
        System.out.println("1. εισαγωγη");
        System.out.println("2. διαγραφη");
        System.out.println("3. ενημερωση");
        System.out.println("4. αναζητηση");
        System.out.println("5. εξοδος");
    }
    public  static boolean isCoiceValid(int choice){
        return choice >= 1 && choice <=5;
    }
    public static  void doOnChoice(int choice){
        switch (choice){
            case 1:
                System.out.println("εισαγωγη");
                break;
            case 2:
                System.out.println("διαγραφη");
                break;
            case 3 :
                System.out.println("ενημερωση");
                break;
            case 4:
                System.out.println("αναζητηση");
                break;
            case 5:
                System.out.println( "εξοδος");
                break;
            default:
                System.out.println( "λαθος επιλογη");
                break;

        }
    }
}
