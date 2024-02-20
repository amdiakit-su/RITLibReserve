public class Book implements Visitable{

    private String isbnNumber;
    private String nm;
    private int price;

    public Book(String isbn, String name, int cost){
        this.isbnNumber = isbn;
        this.nm = name;
        this.price = cost;
    }

    public int getPrice(){
        return price;
    }
    public String getIsbnNumber(){
        return isbnNumber;
    }
    public String getNm(){
        return nm;
    }

    @Override
    public void accept(ReserveVisitor visitor){
        visitor.visit(this);
    }

}
