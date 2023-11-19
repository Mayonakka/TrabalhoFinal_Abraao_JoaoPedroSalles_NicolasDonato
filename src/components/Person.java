package components;

public abstract class Person {

    private String name;
    private int code;

    public Person(String name, int code) {
        this.name = name;
        this.code = code;
    }

    public String getName() {
        return name;
    }
    public int getCode() {
        return code;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setCode(int code) {
        this.code = code;
    }
}