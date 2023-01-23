import javax.xml.crypto.KeySelector.Purpose;

class Account{
    private String name;
    private int accountNumber;
    public Account(int accountNumber){
        this.accountNumber=accountNumber;
    }
    public String getName(){
        return this.name;
    }
    public int getAccount(){
        return this.accountNumber;
    }
    public void setName(String name){
        this.name=name;
    }
}