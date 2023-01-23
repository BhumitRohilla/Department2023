import java.util.Random;

class AccountTest {
    public static void main(String[] args) {
        Random rand=new Random();

        Account myAccount=new Account(rand.nextInt(1000));
        myAccount.setName("Bhumit");
        System.out.println(myAccount.getName());
        System.out.print(myAccount.getAccount());
    }
}
