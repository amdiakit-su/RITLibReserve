//This visitable interface provides a way for each visitable object
// to accept a visitor & execute the appropriate method based on its type
public interface Visitable {
    void accept(ReserveVisitor visitor);
}
