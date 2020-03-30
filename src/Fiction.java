public class Fiction extends Book {
    private String ageGroup;

    public Fiction() {

    }
    public Fiction(String ageGroup){
        this.ageGroup = ageGroup;

    }
    public void setAgeGroup(String ageGroup){

        this.ageGroup = ageGroup;
    }
    public String getAgeGroup(){
        return ageGroup;
    }

    public String toString(){
        String returnStr = super.toString();
        returnStr += "\nAge Group: "+ ageGroup;
        return returnStr;
    }
}
