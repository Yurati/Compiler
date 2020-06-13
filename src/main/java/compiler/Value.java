package compiler;

public class Value {
    private Object value;

    public Value(){
        this.value = new Object();
    }

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

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if(value == obj) {
            return true;
        }

        if(value == null || obj == null || obj.getClass() != value.getClass()) {
            return false;
        }

        Value that = (Value)obj;

        return this.value.equals(that.value);
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}