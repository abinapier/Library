public class Textbook extends Nonfiction{
    private String topic;
    private double edition;

    public Textbook(){
        topic = "unknown";
        edition = 0;
    }

    public Textbook(String topic, int edition){
        this.topic = topic;
        this.edition = edition;
    }

    public String getTopic() {
        return topic;
    }

    public double getEdition() {
        return edition;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public void setEdition(double edition) {
        this.edition = edition;
    }

    public String toString(){
        String returnStr = super.toString();
        returnStr+="\nTopic: "+topic;
        returnStr+="\nEdition: "+edition;
        return returnStr;
    }
}
