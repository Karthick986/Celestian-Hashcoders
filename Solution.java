import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Solution {

    public static void main(String[] args) throws Exception {
        

        String filename = "/home/bhushan/Downloads/b.txt";

        Reader reader = new Reader(filename);

        Map<Streat,Integer> streatList = reader.readStreats();

        ArrayList<Cars> carList = reader.readCars();

        Globaldata data = reader.readdata();

        Collections.sort(carList,new CarSorter());

        for (Cars c : carList) {
          // System.out.println("Car >> "+ c.getPath().size() +"\n"+c.getTotal()+"_____________\n");
           if(c.getTotal()>=data.getSimulation())
            carList.remove(c);
        }

        // for (Streat s : streatList) {
        //    // System.out.println("Streat >> "+ s.getStareatName() +"\n"+s.getDuration()+"_____________\n");
        // }

        Map<Integer,Answer> ansList = new HashMap<>();

        for (Cars c : carList) {
            
            for (String s_name : c.getPath().keySet()){

                Answer ans = new Answer();

                try{
                    ans.setPoint(streatList.get(s_name));

                    ansList.put(streatList.get(s_name), ans);
                }catch(Exception e)
                {

                }
               
                
            }
            
        }

        try{

            FileWriter writer = new FileWriter("/home/bhushan/Desktop/ou2.txt");

            writer.write(ansList.size()+"\n");

            for (Integer point : ansList.keySet()) {

                    writer.write(point+"\n");
                    writer.write(ansList.get(point).getPaths().size()+"\n");

                    for (String s : ansList.get(point).getPaths().keySet()) {
                        writer.write(s+" 1");
                    }
                
            }
            

        }catch(Exception e)
        {

        }
      



    }
}
