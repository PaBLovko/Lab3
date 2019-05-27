package Hello;

public class Number {

    private String value;

    public Number(String value) throws MyException{
        if(Check.containsComplex(value)){
            this.value = value;
        }
    }

    public Number() {
        this.value = "";
    }

    public String getValue() {
        return value;
    }
}
