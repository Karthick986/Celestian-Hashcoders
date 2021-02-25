
import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
public class Reader   {

    String filename;

    ArrayList<Streat> streatList = new ArrayList<>();

    ArrayList<Cars> carList = new ArrayList<>();

    Map<String,Integer> map = new HashMap<>();

    public Reader(String filename)
    {
        this.filename = filename;
    }

  

    public ArrayList<Streat> readStreats()
    {

        try{

            BufferedReader br = new BufferedReader(new FileReader(filename));

            String[] l1 = br.readLine().split(" ");

            int numStreats = Integer.parseInt(l1[2]);

            for(int i = 0;i<numStreats;i++)
            {
                String[] l2 = br.readLine().split(" ");

                Streat streat  = new Streat();
                streat.setStartPoint(Integer.parseInt(l2[0]));
                streat.setEndPoint(Integer.parseInt(l2[1]));
                streat.setStareatName(l2[2]);
                streat.setDuration(Integer.parseInt(l2[3]));
               
                streatList.add(streat);

                map.put(l2[2], streat.getDuration());

            }

            return streatList;

        } catch (Exception e) {
           System.out.println("Exception>> "+e.toString());
           return null;
        }
        
    }


    //reading Cars info 

    public ArrayList<Cars> readCars()
    {
        try{

            BufferedReader br = new BufferedReader(new FileReader(filename));

            String[] l1 = br.readLine().split(" ");

            int numcars = Integer.parseInt(l1[3]);
            int skip = Integer.parseInt(l1[2]);

            for(int i=0;i<skip;i++)
            {
                br.readLine();
            }
            
            for(int i = 0;i<numcars;i++)
            {
                int totaltime = 0;
                String[] line = br.readLine().split(" ");

                int pathlength = Integer.parseInt(line[0]);
                Cars car  = new Cars();
                Map<String,Integer> paths = new HashMap<>();

                for(int j = 1;j<=pathlength;j++)
                {

                paths.put(line[j],map.get(line[j]));
                totaltime = totaltime + map.get(line[j]);

                }

                car.setPath(paths);
                car.setTotal(totaltime);

                carList.add(car);
            

            }

            return carList;



        } catch (Exception e) {
           System.out.println("Exception>> "+e.toString());
           return null;
        }
       

    }


  



}
