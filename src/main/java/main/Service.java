package main;

public class Service {
    public String toUpperCase(String s) {
        if (s == null) {
            return null;
        }
        return s.toUpperCase();
    }

    public String toLowerCase(String s) {
        if (s == null) {
            return null;
        }
        return s.toLowerCase();
    }
}
