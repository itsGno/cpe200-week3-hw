package cpe200;

public class Student {

    public Student() {
        // implement here
        Name = "John Doe";
        ID="560610000";
        year=1990;
    }

    // implement all missing constructors here
    public Student(String Name,String ID){
        setName(Name);
        setStudent_id(ID);
    }
    public Student(String Name,String ID,int year){
        setName(Name);
        setStudent_id(ID);
        setYearOfBirth(year);
    }
    public Student(String Name,String ID,int year,boolean status){
        setName(Name);
        setStudent_id(ID);
        setYearOfBirth(year);
        set_status(status);
    }
    public String getName(){
        return Name;
    }
    public String getStudent_id(){
        return ID;
    }
    public int getYearOfBirth(){
        return year;
    }
    public boolean isActive(){
        return status;
    }

    public void setName(String Name){
        if(Name.length()>1)
        this.Name=Name;
    }
    public void setStudent_id(String new_ID){
        if(isValidStudent_id(new_ID))
            ID=new_ID;

    }
    public void setYearOfBirth(int new_year){
        if(isValidYOB(new_year))
        year=new_year;
    }
    public void set_status(boolean new_status){
        status=new_status;
    }
    // implement all get and set methods here

    @Override
    public String toString() {
        String o = Name+" ("+ID+") was born in "+year+" is an ";
        if(status)
            o+="ACTIVE student.";
        else
            o+="INACTIVE student.";
        return o;
    }

    private boolean isValidStudent_id(String id) {
        String patt = "5[6-9]{1}061[0-2]{1}[0-9]{3}";
        if(id.matches(patt))
            return true;
        else
            return false;
    }

    private boolean isValidYOB(int yob) {
        if(yob>=1990)
        return true;
        else
            return false;
    }

    private
    String Name="John doe";
    int year=1990;
    String ID="560610000";
    boolean status=false;
    // declare your attributes here


}
