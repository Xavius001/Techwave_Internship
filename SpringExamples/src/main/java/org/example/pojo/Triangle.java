package org.example.pojo;

public class Triangle
{
    private int base;
    private int height;

    @Override
    public String toString() {
        return "Triangle{" +
                "base=" + base +
                ", height=" + height +
                '}';
    }

    public Triangle() {
        base=0;
        height=0;
    }

    public Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    public Triangle(int base, int height, int extra) {
        this.base = base+extra;
        this.height = height+extra;
    }

    public void Draw()
    {
        System.out.println("Triangle drawn");
    }
}
