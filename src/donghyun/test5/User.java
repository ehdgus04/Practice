package donghyun.test5;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class User {
    private String name;
    private String id;
    private String pw;
    private LocalDateTime createTime;

    public void setName(String name){
        this.name = name;
    }
    public void setId(String id){
        this.id = id;
    }
    public void setPw(String pw){
        this.pw = pw;
    }

    public String getName(){
        return name;
    }
    public String getId(){
        return id;
    }
    public String getPw(){
        return pw;
    }

    User(String name, String id, String pw, LocalDateTime createTime){
        this.name = name;
        this.id = id;
        this.pw = pw;
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
