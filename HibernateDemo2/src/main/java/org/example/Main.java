package org.example;

import org.example.common.GetSessionFactory;
import org.example.dao.DatabaseOperations;
import org.example.pojo.Customer;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter customer details  id, name, dob, mobile");
        int custid = S.nextInt();
        S.nextLine();
        String name = S.nextLine();
        LocalDate dob = LocalDate.parse(S.nextLine());
        String mobile = S.nextLine();
        Customer C = new Customer(custid,name,dob,mobile);
        System.out.println(DatabaseOperations.insertCustomer(C));
    }
}