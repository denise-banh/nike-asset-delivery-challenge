package Question1.DataStructure1;

public class Square {
    private SquareValue _value;

    public Square(){
        _value = SquareValue.EMPTY;
    }

    public Square(SquareValue value){
        _value = value;
    }

    public SquareValue getValue() {
        return _value;
    }

    public void setValue(SquareValue value){
        _value = value;
    }
}
