public class DVDPlayer implements Visitable {
    private int serialNum;

    public DVDPlayer(int serial){this.serialNum = serial;}

    public int getSerialNum(){
        return serialNum;
    }

    @Override
    public void accept(ReserveVisitor visitor){
        visitor.visit(this);
    }
}
