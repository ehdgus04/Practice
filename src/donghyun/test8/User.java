package donghyun.test8;

public class User {
    private String name;
    private int birthDate;
    private String school;
    private String department;
    private String id;
    private String password;

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
        return birthDate;
    }
    public void setSchool(String school){
        this.school = school;
    }
    public String getSchool(){
        return school;
    }
    public void setDepartment(String department){
        this.department = department;
    }
    public String getDepartment(){
        return department;
    }
    public void setId(String id){
        this.id = id;
    }
    public String getId(){
        return id;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public String getPassword(){
        return password;
    }
    User(String name, int birthDate, String school, String department, String id, String password){
        this.name = name;
        this.birthDate = birthDate;
        this.school = school;
        this.department = department;
        this.id = id;
        this.password = password;
    }

    public String userInfo(){
        return "--- 회원정보 ---" +
                "\n이름    "+name+
                "\n생년월일  "+birthDate+
                "\n학교    "+school+
                "\n학과명   "+department+
                "\n아이디   "+id+
                "\n비밀번호  "+password;
    }
}
