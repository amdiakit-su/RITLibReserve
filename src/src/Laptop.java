public class Laptop implements Visitable{
    private String type;
    private int serialNum;

    public Laptop(String t, int serial){
        this.type = t;
        this.serialNum = serial;
    }

    public String getType(){
        return type;
    }

    public int getSerialNum(){
        return serialNum;
    }

    @Override
    public void accept(ReserveVisitor visitor){
        visitor.visit(this);
    }

}
