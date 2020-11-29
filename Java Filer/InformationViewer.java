import Data.FileHandler;

public class InformationViewer {

    public void showKidList(){

        FileHandler fH = new FileHandler();
        fH.readFromFile("childlist.txt");

    }

    public void showWaitList(){

        FileHandler fH = new FileHandler();
        fH.readFromFile("waitList.txt");

    }

}
