public class Children extends Fiction {
    private int readingLevel;

    public Children() {

    }
    public Children(int readingLevel){
        this.readingLevel = readingLevel;

    }
    public void setReadingLevel(int readingLevel){

        this.readingLevel= readingLevel;
    }
    public int getReadingLevel(){
        return readingLevel;
    }
    @Override
    public String toString(){
        return readingLevel + super.toString();
    }

}
