import Data.FileHandler;
import UI.IO;

import java.util.*;

public class Controller {

    //instanser oprettes
    Scanner scanner = new Scanner(System.in);
    EmployeeMenu employeeMenu = new EmployeeMenu();
    ManagerMenu managerMenu = new ManagerMenu();
    Login login = new Login();
    FileHandler fileHandler = new FileHandler();
    IO io = new IO();

    public void login(){

        //checker om password er rigtigt
        String password = io.printLogin(scanner);
        while(!login.checkPassword(password, employeeMenu.getPassword(), managerMenu.getPassword())){
            io.printWrongPassword();
            password = io.printLogin(scanner);
        }
        selectTaskFromMenu();   //sendes videre til næste step, når password er rigtigt
    }

    public void selectTaskFromMenu(){

        int taskChoice = 0;     //nul er logud
        do{
            if (login.getAccessedAccount().equals("manager")) {
                taskChoice = io.showManagerMenu(scanner);
                managerMenu.selectTask(taskChoice);
            } else {
                taskChoice = io.showEmployeeMenu(scanner);
                employeeMenu.selectTask(taskChoice);
            }
        }
        while(taskChoice != 0); //hvis ikke man har valgt 0 fortsætter loopet.
        scanner.nextLine(); //så den ikke tror 0 bliver indtastet som password.
        login();                //ved indtastning af 0, sendes man tilbage til login.
    }
}
