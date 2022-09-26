package org.example.pojo;

public class Rectangle {
    private int length, breadth;

    public Rectangle() {
    }

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

//    @Override
//    public String toString() {
//        return "Rectangle{" +
//                "length=" + length +
//                ", breadth=" + breadth +
//                '}';
//    }
}
