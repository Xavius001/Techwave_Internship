package org.example.pojo;

public class Salary {
    private int empno;
    private double basic;

    public Salary() {
    }

    public Salary(int empno, double basic) {
        this.empno = empno;
        this.basic = basic;
    }

    public int getEmpno() {
        return empno;
    }

    public void setEmpno(int empno) {
        this.empno = empno;
    }

    public double getBasic() {
        return basic;
    }

    public void setBasic(double basic) {
        this.basic = basic;
    }
}
