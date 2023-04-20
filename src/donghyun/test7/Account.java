package donghyun.test7;

public class Account {
    private String accountNumber;
    private Customer customer;
    private int balance;
    private String accountPw;

    public void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }
    public String getAccountNumber(){
        return accountNumber;
    }
}
