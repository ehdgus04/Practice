package donghyun.test5;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class User {
    private String name;
    private int age;
    private String id;
    private String pw;
    private int userNumber;
    private LocalDateTime createTime;

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
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
    public void setUserNumber(int userNumber){
        this.userNumber = userNumber;
    }
    public int getUserNumber(){
        return userNumber;
    }

    User(String name, int age, String id, String pw, int userNumber, LocalDateTime createTime){
        this.name = name;
        this.age = age;
        this.id = id;
        this.pw = pw;
        this.userNumber = userNumber;
        this.createTime = createTime;
    }

    public String toString(){
        return "--- 유저 정보 ---" +
                "\n이름 : "+name+
                "\n아이디 : "+id+
                "\n비밀번호 : "+pw+
                "\n생성일 : "+createTime.format(DateTimeFormatter.ofPattern("yyy-MM-dd"))+
                "\n";
    }

}
