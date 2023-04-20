package donghyun.test7;

public class Customer {
    private int customerId;
    private int birthDate;
    private String name;
    private String pw;

    public void setCustomerId(int customerId){
        this.customerId = customerId;
    }
    public int getCustomerId(){
        return customerId;
    }
    public void setBirthDate(int birthDate){
        this.birthDate = birthDate;
    }
    public int getBirthDate(){
        return birthDate;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setPw(String pw){
        this.pw = pw;
    }
    public String getPw(){
        return pw;
    }

    Customer(int customerId, int birthDate, String name, String pw){
        this.customerId = customerId;
        this.birthDate = birthDate;
        this.name = name;
        this.pw = pw;
    }

}
