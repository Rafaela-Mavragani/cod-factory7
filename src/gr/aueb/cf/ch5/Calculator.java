package gr.aueb.cf.ch5;

import java.util.Scanner;

public class Calculator {
    static Scanner in = new Scanner(System.in);


    public static void main(String[] args) {
        int choice;
        int result = 0;

        while (true) {
            printMenu();
            choice = getOneInt();
            if (!isChoiceValid(choice)) {
                System.out.println("Error. Choice must be between 1-6.");
                continue;
            }
            if (choice == 6) {
                System.out.println("Exit");
                break;
            }

            result = getResultOnChoice(choice);
            System.out.println("result" + result);
        }
    }

    public static void printMenu(){

        System.out.println("επιλεξτε ενα απο τα παρακατω");
        System.out.println("1. προσθεση");
        System.out.println("2. αφαιρεση");
        System.out.println("3. πολλαπλασιασμος");
        System.out.println("4. διαιρεση");
        System.out.println("5. υπολοιπο διαιρεσης");
        System.out.println("6. εξοδος");
    }

    public static int getOneInt() {
        return in.nextInt();
    }

    public static boolean isChoiceValid(int choice) {
        return choice >= 1 && choice <= 6;
    }

    public static int getResultOnChoice(int choice) {
        int num1 = 0;
        int num2 = 0;
        int result = 0;

        System.out.println("Παρακαλω εισαγεται δυο ακεραιους");
        num1 = getOneInt();
        num2 = getOneInt();

        switch (choice) {
            case 1:
                result = add(num1, num2);
                break;
            case 2:
                result = sub(num1, num2);
                break;
            case 3:
                result = mul(num1, num2);
                break;
            case 4:
                result = div(num1, num2);
                break;
            case 5:
                result = mod(num1, num2);
                break;
            default:
                System.out.println("Error in choice");
        }
            return result;
    }
        public static int add(int a , int b){
        return  a + b;
        }
    public static int sub(int a , int b){
        return  a - b;
    }
    public static int mul(int a , int b){
        return  a * b;
    }
    public static int div(int a , int b){
        if (b == 0 ) return 0;
        return  a / b;
    }
    public static int mod(int a , int b){
        if (b == 0 ) return 0;
        return  a % b;
    }

    }


