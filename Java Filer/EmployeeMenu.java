import java.util.Scanner;

public class EmployeeMenu {

    //kodeord til at komme ind på menuen (den sender flere fejlmeddelseser hvis det er forkert)
    private String password = "emp123";

    Registration registration = new Registration();
    InformationViewer iW = new InformationViewer();



    public void selectTask(int choice){


        switch (choice) {
            case 0:  //Logger ud. behøver ingen kode.
                break;
            case 1:
                //("Vis vagtplan");
                break;
            case 2:
                iW.showWaitList();
                break;
            case 3:
                registration.signUpToWaitList();
                break;
            case 4:
                iW.showKidList();
                break;
            case 5:
                //("Vis telefonliste");
                break;
        }
    }

    public String getPassword(){
        return this.password;
    }

}

