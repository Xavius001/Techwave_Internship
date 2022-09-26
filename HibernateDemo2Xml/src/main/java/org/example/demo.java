package org.example;

class Sample {
    static {
        System.out.println("Static block");
    }
    public Sample() {
        System.out.println("Default");
    }
    public Sample(int a) {
        System.out.println("a "+a);
    }
}

public class demo {
    public static void main(String[] args) {
        Sample S = new Sample();
        Sample S1 = new Sample(10);
    }
}
