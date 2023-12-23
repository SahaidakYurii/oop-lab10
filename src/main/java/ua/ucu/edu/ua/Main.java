package ua.ucu.edu.ua;

public class Main {
    public static void main(String[] args) {
        Document doc = new SmartDocument("C:/Users/Yura/ucu/semester3/objectOrientedProgramming/lab10");
        String result = doc.parse();
        System.out.println(result);
    }
}