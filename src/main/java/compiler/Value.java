package compiler;

public class Value {
    private Object value;

    public Value(Object object) {
        this.value = object;
        if (!(isDouble() || isInteger() || isBoolean() || isString()))
            throw new IllegalArgumentException();
    }


    public boolean isDouble() {
        return value instanceof Double;
    }
    public Double asDouble() {
        return (Double) value;
    }

    public boolean isInteger() {
        return value instanceof Integer;
    }

    public Integer asInteger() {
        return (Integer) value;
    }

    public boolean isBoolean() {
        return value instanceof Boolean;
    }
    public Boolean asBoolean() {
        return (Boolean) value;
    }

    public boolean isString() {
        return value instanceof String;
    }

    public String asString() {
        return (String) value;
    }



}