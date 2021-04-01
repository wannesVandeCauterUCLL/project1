package db.domain;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class WoordenLezer {

    public ArrayList<String> leesTekstBestand(String tekstBestand){
        try {
            File myObj = new File(tekstBestand);
            Scanner myReader = new Scanner(myObj);


            ArrayList<String> woordenlijst = new ArrayList<String>();

            while (myReader.hasNextLine()) {
                String woord = myReader.nextLine();
                woordenlijst.add(woord);
            }
            myReader.close();
            return woordenlijst;

        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        return null;
    }

}
