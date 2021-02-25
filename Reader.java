
import java.io.*;
import java.util.ArrayList;
public class Reader   {

    String filename;

    ArrayList<Streat> streatList = new ArrayList<>();

    ArrayList<Cars> carList = new ArrayList<>();

    public Reader(String filename)
    {
        this.filename = filename;
    }

    BufferedReader br = new BufferedReader(new FileReader(filename));

    //reading Cars info 

    public ArrayList<Cars> readCars()
    {

        
    }


    public ArrayList<Streat> readStreats()
    {
        
    }



}
