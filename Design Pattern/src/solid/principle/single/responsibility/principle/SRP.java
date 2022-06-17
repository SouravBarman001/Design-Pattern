package solid.principle.single.responsibility.principle;

// Single Responsibility Principle : A class should have one and only one reason to change

class AccountService{
    AccountReposotory accountReposotory = new AccountReposotory();
    NotificationSevice notificationSevice = new NotificationSevice();
    public void openAccount(){

        // responsibility - 01
        System.out.println("fill account details");
       accountReposotory.create();
       notificationSevice.sendNotification();

    }
}

class AccountReposotory{
    public void create(){
        // responsibility - 02
        System.out.println("store account in database");
    }
}

class NotificationSevice{
    public void sendNotification(){
        // responsibility - 03
        System.out.println("send welcome msg");
    }
}

public class SRP {
    public static void main(String[] args) {
        AccountService accountService = new AccountService();
        accountService.openAccount();
    }
}
