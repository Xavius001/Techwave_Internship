package org.example.pojo;

public class Employee {
    private int empno;
    private String ename;
    private Department deptno;

    public Employee() {
    }

    public Employee(int empno, String ename, Department deptno) {
        this.empno = empno;
        this.ename = ename;
        this.deptno = deptno;
    }

    public int getEmpno() {
        return empno;
    }

    public void setEmpno(int empno) {
        this.empno = empno;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public Department getDeptno() {
        return deptno;
    }

    public void setDeptno(Department deptno) {
        this.deptno = deptno;
    }
}
