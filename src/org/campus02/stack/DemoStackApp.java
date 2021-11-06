package org.campus02.stack;

public class DemoStackApp {
    public static void main(String[] args) {
        Stack <Integer> stapel = new Stack(new Integer[7]);
        stapel.push(7);
        stapel.push(6);
        stapel.push(5);

        System.out.println("stapel.pop()" +  stapel.pop());
        System.out.println("stapel.pop()" +  stapel.pop());
        stapel.push(3);
        System.out.println("stapel.pop()" +  stapel.pop());
        System.out.println("stapel.pop()" +  stapel.pop());
    }
}
