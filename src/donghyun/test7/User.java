package donghyun.test7;

public class User {
    private String name;
    private int birthDate;
    private String id;
    private String pw;

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setBirthDate(int birthDate){
        this.birthDate = birthDate;
    }
    public int getBirthDate(){
        return getBirthDate();
    }
    public

    User(){}
    User(String name, int birthDate, String id, String pw){
        this.name = name;
        this.birthDate = birthDate;
        this.id = id;
        this.pw = pw;
    }
}
