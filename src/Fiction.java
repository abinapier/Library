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
    @Override
    public String toString(){
        return ageGroup + super.toString();
    }
}
