public class Calculator implements Visitable {
    private String type;
    private int serialNum;


    public Calculator(String t, int serial){
        this.serialNum = serial;
        this.type = t;
    }

    public int getSerialNum(){
        return serialNum;
    }
    public String getType(){
        return type;
    }

    @Override
    public void accept(ReserveVisitor visitor){
        visitor.visit(this);
    }

}
