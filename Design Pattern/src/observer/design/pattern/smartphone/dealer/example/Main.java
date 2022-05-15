package observer.design.pattern.smartphone.dealer.example;

public class Main {
    public static void main(String[] args) {
        StoreOne storeOne = new StoreOne();
        StoreTwo storeTwo = new StoreTwo();

        HandleStore handleStore = new HandleStore();
        handleStore.attach(storeOne);
        handleStore.attach(storeTwo);

        handleStore.notifyUpdate(new Message("galaxy S20 phone arrived"));

        System.out.println("------------------------------------------------------------");

        handleStore.detach(storeOne);
        handleStore.notifyUpdate(new Message("galaxy S21 phone arrived"));
    }
}
