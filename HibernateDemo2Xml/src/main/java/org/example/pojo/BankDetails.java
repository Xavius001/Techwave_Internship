package org.example.pojo;

import javax.persistence.*;
import java.io.Serializable;


public class BankDetails implements Serializable {

    //foreign as primary key

    private int customerId;


    private String accountNo;


    private String bankName;

    private Customer customer;

    public BankDetails() {}

    public BankDetails(int customerId, String accountNo, String bankName, Customer customer) {
        this.customerId = customerId;
        this.accountNo = accountNo;
        this.bankName = bankName;
        this.customer = customer;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
