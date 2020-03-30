public class Novel extends Fiction {
    private int pageNumber;

    public Novel() {

    }
    public Novel(int pageNumber){
        this.pageNumber = pageNumber;

    }
    public void setPageNumber(int pageNumber){

        this.pageNumber= pageNumber;
    }
    public int getPageNumber(){
        return pageNumber;
    }

    public String toString(){
        String returnStr = super.toString();
        returnStr+= "\n# Pages: "+pageNumber;
        return returnStr;
    }

}

