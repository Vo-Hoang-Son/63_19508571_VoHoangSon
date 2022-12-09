package cau1;

public class Main {
    public static void main(String[] args) {
        CB cb = new CB("OPEN");
        cb.sendRequest();
        cb.checkStatus();
    }
}
