public class Main {
    public static void main(String[] args) {

        ReserveVisitorImpl visitor = new ReserveVisitorImpl();

        Book book = new Book("123232353","Architecture", 5);
        DVDPlayer dvdPlayer = new DVDPlayer(2534342);
        Laptop laptop = new Laptop("Mac", 4523465);
        Calculator calculator = new Calculator("Standard", 567746);

        book.accept(visitor);
        dvdPlayer.accept(visitor);
        laptop.accept(visitor);
        calculator.accept(visitor);
    }
}