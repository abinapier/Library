public class Nonfiction extends Book {
    private String timePeriod;

    public Nonfiction(){
        timePeriod = "unknown";
    }

    public Nonfiction(String timePeriod){
        this.timePeriod = timePeriod;
    }

    public String getTimePeriod() {
        return timePeriod;
    }

    public void setTimePeriod(String timePeriod){
        this.timePeriod = timePeriod;
    }

    public String toString(){
        String returnStr = super.toString();
        returnStr+="\nTime Period: "+ timePeriod;
        return returnStr;
    }
}
