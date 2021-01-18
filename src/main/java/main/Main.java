package main;

public class Main {
    public static void main(String[] args) {
        Service s = new Service();
        String email = s.toLowerCase("SoMeEmAIl@uKr.NEt");
        System.out.println(email);
        String dbFieldName = s.toUpperCase("UserId");
        System.out.println(dbFieldName);
    }
}
