package io.woolford.database.entity;

public class Record {

    private String attribute;
    private String value;

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Record{" +
                "attribute='" + attribute + '\'' +
                ", value='" + value + '\'' +
                '}';
    }

}
