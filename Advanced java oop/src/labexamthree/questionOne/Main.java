package labexamthree.questionOne;


public class Main {
    public static void main(String[] args)
    {
        Wedding guest = new GuestRoom();
        Wedding normal = new NormalRoom();

        Alif_Decorator guestDecorator = new GuestRoomDecorator(new GuestRoom());
        Alif_Decorator normalDecorator = new NormalRoomDecorator(new GuestRoomDecorator(new GuestRoom()));

        System.out.println("Normal Room");
        System.out.println("Type: " + normal.room());
        System.out.println("Decorated Items: " + normalDecorator.decoratedItems());

        System.out.println("---------------------------------------------------------");

        System.out.println("Guest Room");
        System.out.println("Type: " + guest.room());
        System.out.println("Decorated Items: " + guestDecorator.decoratedItems());


    }
}