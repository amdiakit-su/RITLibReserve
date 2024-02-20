import java.time.LocalDateTime; // Import the time class
import java.time.format.DateTimeFormatter; // import formatter class

// Concrete visitors
class ReserveVisitorImpl implements ReserveVisitor{
    @Override
    public void visit(Book book){
        LocalDateTime date = LocalDateTime.now();
        DateTimeFormatter formDate = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String formattedDate = date.format(formDate);
        System.out.println("----------------");
        System.out.println("Reserving book: " + book.getNm());
        System.out.println("Book reserved on: " + formattedDate + " pickup within 24 hours");
        System.out.println("1 or 2 hour loan period");
        System.out.println("----------------");
    }

    @Override
    public void visit(DVDPlayer dvdPlayer) {
        LocalDateTime date = LocalDateTime.now();
        DateTimeFormatter formDate = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String formattedDate = date.format(formDate);
        System.out.println("----------------");
        System.out.println("Reserving DVD Player");
        System.out.println("DVD Player reserved on: " + formattedDate + " pickup within 24 hours");
        System.out.println("3 day loan period");
        System.out.println("----------------");

    }

    @Override
    public void visit(Laptop laptop) {
        LocalDateTime date = LocalDateTime.now();
        DateTimeFormatter formDate = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String formattedDate = date.format(formDate);
        System.out.println("----------------");
        System.out.println("Reserving " + laptop.getType()+ " Laptop");
        System.out.println("Laptop reserved on: " + formattedDate + " pickup within 24 hours");
        System.out.println("4 hour loan period");
        System.out.println("----------------");

    }

    @Override
    public void visit(Calculator calculator) {
        LocalDateTime date = LocalDateTime.now();
        DateTimeFormatter formDate = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String formattedDate = date.format(formDate);
        System.out.println("----------------");
        System.out.println("Reserving " + calculator.getType() + " Calculator");
        System.out.println("Calculator reserved on: " + formattedDate + " pickup within 24 hours");
        System.out.println("4 hour loan period");
        System.out.println("----------------");
    }
}
