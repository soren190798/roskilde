import java.util.Scanner;

public class ManagerMenu extends EmployeeMenu{

    Registration registration = new Registration();
    InformationViewer informationViewer = new InformationViewer();

    //kodeord til at komme ind på menuen
    private String password = "manager0000";

    public void selectTask(int choice){

        super.selectTask(choice);
        switch(choice) {
            case 6:
                registration.signUpChild();
            case 7:
                //("Vis ansatte");
                break;
            case 8:
                //("Rediger vagtplan");
                break;
        }
    }

    public String getPassword(){
        return this.password;
    }




}
