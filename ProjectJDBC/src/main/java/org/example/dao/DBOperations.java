package org.example.dao;

import oracle.jdbc.OracleTypes;
import org.example.pojo.Emp;

import java.sql.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class DBOperations {
    static Connection Con = null;
    static  CallableStatement cstmt = null;
    public static String insertEmp(Emp E) {
        DateTimeFormatter D = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
        Con = DBConnection.getConnection();
        try {
            cstmt = Con.prepareCall("{call emp_insertExp(?,?,?,?,?,?,?,?,?)}");
            cstmt.setInt(1,E.getEmpno());
            cstmt.setString(2,E.getEname());
            cstmt.setString(3,E.getJob());
            cstmt.setInt(4,E.getMgr());
            cstmt.setString(5, D.format(E.getHiredate()));
            cstmt.setDouble(6, E.getSal());
            cstmt.setDouble(7, E.getComm());
            cstmt.setInt(8, E.getDeptno());
            cstmt.registerOutParameter(9, Types.VARCHAR, 25);
            cstmt.execute();
            return cstmt.getString(9);
        } catch (SQLException e) {
            return e.getMessage();
        }
    }

    /*
        create or replace procedure emp_deleteExp(eno number,status out varchar2)
        as
        begin
         delete from emp where empno=eno;
         status:='1 row deleted';
        Exception
            when others then
                if instr(sqlerrm,'SYS_C007434')=0 then
                    status:='Empno does not exist';
                else
                    status:='Could not delete';
                end if;
        End;
        /
     */

    public static String deleteEmp(Emp E) {
        Con = DBConnection.getConnection();
        try {
            cstmt = Con.prepareCall("{call emp_deleteExp(?,?)}");
            cstmt.setInt(1,E.getEmpno());
            cstmt.registerOutParameter(2, Types.VARCHAR, 25);
            cstmt.execute();
            return cstmt.getString(2);
        } catch (SQLException e) {
            return e.getMessage();
        }
    }

    /*
        create or replace procedure emp_updateExp(eno number,ejob varchar2,esal number,edno number,status out varchar2)
        as
        begin
         update emp set job=ejob, sal=esal, deptno=edno  where empno=eno;
         status:='1 row updated';
        Exception
            when others then
                if instr(sqlerrm,'SYS_C007434')=0 then
                    status:='Empno does not exist';
                elsif instr(sqlerrm,'SYS_C007435')>0 then
                    status:='Deptno is invalid';
                else
                    status:='Could not update';
                end if;
        End;
        /
     */

    public static String updateEmp(Emp E) {
        DateTimeFormatter D = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
        Con = DBConnection.getConnection();
        try {
            cstmt = Con.prepareCall("{call emp_updateExp(?,?,?,?,?)}");
            cstmt.setInt(1,E.getEmpno());
            cstmt.setString(2,E.getJob());
            cstmt.setDouble(3, E.getSal());
            cstmt.setInt(4, E.getDeptno());
            cstmt.registerOutParameter(5, Types.VARCHAR, 25);
            cstmt.execute();
            return cstmt.getString(5);
        } catch (SQLException e) {
            return e.getMessage();
        }
    }

    public static List<Emp> getEmp(LocalDate hd) {
        List<Emp> list = new ArrayList<Emp>();
        Con = DBConnection.getConnection();
        DateTimeFormatter D = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
        try {
            cstmt = Con.prepareCall("{call sp_selectemp(?, ?)}");
            cstmt.setString(1, D.format(hd));
            cstmt.registerOutParameter(2, OracleTypes.CURSOR);
            cstmt.execute();
            ResultSet Rs = (ResultSet) cstmt.getObject(2);
            Emp E = null;
            while(Rs.next()) {
                E = new Emp();
                E.setEmpno(Rs.getInt(1));
                E.setEname(Rs.getString(2));
                E.setJob(Rs.getString(3));
                E.setMgr(Rs.getInt(4));
                list.add(E);
            }
            return list;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
