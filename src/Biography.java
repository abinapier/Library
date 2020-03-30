public class Biography extends Nonfiction {
    String gender;

    public Biography(){
        gender = "unknown";
    }

    public Biography(String gender){
        this.gender = gender;
    }

    public String getGender(){
        return gender;
    }

    public void setGender(String gender){
        this.gender = gender;
    }

    public String toString(){
        String returnStr = super.toString();
        returnStr+="\nGender: "+gender;
        return returnStr;
    }
}
