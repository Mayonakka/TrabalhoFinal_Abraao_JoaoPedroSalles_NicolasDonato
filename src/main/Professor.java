package main;

public class Professor extends Person {

    public Professor(String name, int code) {
        super(name, code);
    }

    @Override
    public String toString() {
        return getCode() +"  |  "+ getName() +"\n";
    }
}