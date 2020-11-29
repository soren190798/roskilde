package Data;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;


public class FileHandler {


    public void readFromFile(String fileName){

        try{
            Scanner input = new Scanner(new File(fileName));

            while(input.hasNextLine()){
                System.out.println(input.nextLine());
            }
        }catch(Exception e){
            System.out.println("Der skete en fejl " + e);
        }
    }

    public void writeToFile(String fileName, ArrayList<?> list){

        try{

            PrintStream output = new PrintStream(new FileOutputStream(fileName,true));
            for(int i = 0; i < list.size(); i++){
                output.println(list.get(i));
            }

        }catch(Exception e){
            System.out.println("Der skete en fejl " + e);
        }

    }
}
