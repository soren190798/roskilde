import java.util.*;
public class Login {

    private String accessedAccount;

    public boolean checkPassword(String password ,String employeePassword, String managerPassword){

        if(password.equals(employeePassword)){
            accessedAccount = "employee";
            return true;
        } else if(password.equals(managerPassword)){
            accessedAccount = "manager";
            return true;
        } else if(password.equals("exit")) {
            System.exit(0);
            return false;
        } else{
            return false;
        }
    }

    public String getAccessedAccount(){
        return this.accessedAccount;
    }
}
