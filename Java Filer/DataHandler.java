import java.util.ArrayList;
import java.util.Scanner;

public class DataHandler {

    Scanner sc = new Scanner(System.in);
    Child child = new Child();

    public ArrayList<Child> fillChildInfo(){

        ArrayList<Child> childInfo = new ArrayList<Child>();

        Child ch = new Child();

        System.out.print("Barns navn?:"); ch.setName(sc.nextLine());
        System.out.print("Værges navn?:"); ch.setParentsName(sc.nextLine());
        System.out.print("Adresse?:"); ch.setAddress(sc.nextLine());
        System.out.print("Barns Cpr?:"); ch.setCpr(inputVerifier(10));
        System.out.print("Forældres telefonnummer?:"); ch.setPhoneNumber(inputVerifier(8));

        System.out.println(ch);

        childInfo.add(ch);

        return childInfo;
    }

    public String inputVerifier(int length){

        String input = sc.nextLine();

        while(input.length() != length){
            System.out.println("Indtast "+ length + " cifre, prøv igen smiler");
            input = sc.nextLine();
        }
        return input;
    }


}
