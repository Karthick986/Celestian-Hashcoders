import java.util.Map;

public class Answer {

    Map<String, Integer> paths;

    public  Map<String, Integer> getPaths() {
		return this.paths;
	}

    public void setPaths( Map<String, Integer> paths) {
		this.paths = paths;
	}


    int point;
    int duration;

    public int getDuration() {
        return this.duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }



	public int getPoint() {
		return this.point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

    

    
}
