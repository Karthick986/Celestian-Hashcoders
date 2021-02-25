import java.io.*;
import java.util.*;

class Solution{

    public static void main(String[] args) throws Exception{
    
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();

        System.out.println(s);

        Map<String ,String> map = new HashMap<>();

        map.put("1", "Bhushan");
        map.put("2", "Pratiksha");
        map.put("3", "Kajal");
        map.put("4", "Pranay");
        map.put("5", "Kartik");

        for (String string : map.keySet()) {

            System.out.println(map.get(string));
            
        }
        
    
    }
}