import java.util.ArrayList;

public class Solution {

    public static void main(String[] args) throws Exception {
        

        String filename = "/home/bhushan/Downloads/b.txt";

        Reader reader = new Reader(filename);

        ArrayList<Streat> streatList = reader.readStreats();

        ArrayList<Cars> carList = reader.readCars();

        for (Cars c : carList) {
            System.out.println("Car >> "+ c.getPath().size() +"\n"+c.getTotal()+"_____________\n");
        }

        for (Streat s : streatList) {
           // System.out.println("Streat >> "+ s.getStareatName() +"\n"+s.getDuration()+"_____________\n");
        }


    }
}
