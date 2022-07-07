public class CampoDeBatalla {
    private String people;
    public CampoDeBatalla(String people){
        this.people=people;
    }
    public String getPeople(){
        return people;
    }
    public String checkCampoDeBatalla() {
        if(people.length()==0) return "";
        int count=countOfSharp();
        if(count>=2) return "";
        if(count==1){
            return cutStringWhenThereIsABomb();
        }
        return people;
    }
    public int countOfSharp(){
        return people.split("#").length-1;
    }
    public String cutStringWhenThereIsABomb(){
        String str = people.replace("[", ".").replace("]", ".");

        return people.contains("[")?str.split("\\.")[1]:"";
    }
}
