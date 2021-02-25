import java.util.Comparator;

public class CarSorter implements Comparator<Cars> {

    @Override
    public int compare(Cars arg0, Cars arg1) {

        if(arg0.getTotal()>arg1.getTotal())
        return 1;
        else
        return -1;
        // TODO Auto-generated method stub
        //return 0;
    }
    
}
