import Data.FileHandler;
import java.util.ArrayList;

public class Registration {

    FileHandler fileHandler = new FileHandler();
    DataHandler dataHandler = new DataHandler();

    public void signUpChild(){

        ArrayList<Child> childInfo = dataHandler.fillChildInfo();
        fileHandler.writeToFile("childlist.txt", childInfo);
    }
    public void signUpToWaitList(){

        ArrayList<Child> childInfo = dataHandler.fillChildInfo();
        fileHandler.writeToFile("waitList.txt", childInfo);
    }


}
