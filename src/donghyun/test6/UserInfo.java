package donghyun.test6;

public class UserInfo {
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
    public void setId(String id){
        this.id = id;
    }
    public String getId(){
        return id;
    }
    public void setPw(String pw){
        this.pw = pw;
    }
    public String getPw(){
        return pw;
    }

    UserInfo(String name, int birthDate, String id, String pw){
        this.name = name;
        this.birthDate = birthDate;
        this.id = id;
        this.pw = pw;
    }
    public String toString(){
        return "--- 회원정보 ---"
                +"\n이름 : "+name
                +"\n생년월일 : "+birthDate
                +"\n아이디 : "+id
                +"\n비밀번호 : "+pw;
    }
}
