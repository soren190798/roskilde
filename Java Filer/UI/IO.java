package UI;

import java.util.ArrayList;
import java.util.Scanner;
public class IO {


    public String printLogin (Scanner scanner){
        System.out.println("Indtast Password \nskriv exit for at afslutte");
        String password = scanner.nextLine();
        return password;
    }

    public void printDefaultMenu(){
        System.out.println("foretag handling:");
        System.out.println(" 0: Log ud.");
        System.out.println(" 1: Vis vagtplan");
        System.out.println(" 2: Vis venteliste");
        System.out.println(" 3: Opskriv til venteliste");
        System.out.println(" 4: Vis liste over børn");
        System.out.println(" 5: Vis telefonliste");
    }

    public int showEmployeeMenu(Scanner scanner){
        printDefaultMenu();
        int choice = promptForValidChoice(0,5,scanner.nextInt(), scanner);
        return choice;
    }

    public int showManagerMenu(Scanner scanner){
        printDefaultMenu(); //kan det samme + mere
        System.out.println(" 6: Indskriv barn");
        System.out.println(" 7: Vis ansatte");
        System.out.println(" 8: Rediger vagtplan");
        int choice = promptForValidChoice(0,8,scanner.nextInt(), scanner);
        return choice;
    }

    //sørger for at at værdi at en værdi uden for min-max ikke kan vælges
    public int promptForValidChoice(int min, int max,int choice, Scanner scanner){

        while(choice < min || choice > max){
            System.out.println("Funktion ikke mulig. indtast valg igen");
            choice = scanner.nextInt();
        }
        return choice;
    }

    public void printWrongPassword() {
        System.out.println("Password ikke fundet. prøv igen");
    }

}
