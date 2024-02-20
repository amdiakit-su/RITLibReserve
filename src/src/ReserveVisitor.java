// visitor interface declares methods for each type of
// library item that visitor can operate on
public interface ReserveVisitor {
    void visit(Book book);
    void visit(DVDPlayer dvdPlayer);
    void visit(Laptop laptop);
    void visit(Calculator calculator);
}
